let lastResult = null;

async function loadAgents() {
  try {
    const res = await fetch("/api/agents");
    const agents = await res.json();
    const container = document.getElementById("agent-pills");
    container.innerHTML = agents.map(a => `
      <div class="pill ${a.available ? "online" : "offline"}">
        <span class="dot"></span>${a.name}
      </div>
    `).join("");
  } catch (e) {
    console.error("Failed to load agents", e);
  }
}

function setStatus(msg) {
  const bar = document.getElementById("status-bar");
  bar.classList.remove("hidden");
  bar.innerHTML = `<div class="spinner"></div><span>${msg}</span>`;
}

function clearStatus() {
  document.getElementById("status-bar").classList.add("hidden");
}

function showTab(name) {
  document.querySelectorAll(".tab-content").forEach(el => el.classList.remove("active"));
  document.querySelectorAll(".tab").forEach(el => el.classList.remove("active"));
  document.getElementById(`tab-${name}`).classList.add("active");
  const tabs = document.querySelectorAll(".tab");
  const idx = name === "final" ? 0 : 1;
  tabs[idx].classList.add("active");
}

function copyOutput() {
  if (!lastResult) return;
  navigator.clipboard.writeText(lastResult.final_output).then(() => {
    const btn = document.querySelector(".copy-btn");
    btn.textContent = "Copied!";
    setTimeout(() => btn.textContent = "Copy", 1500);
  });
}

async function runTask() {
  const input = document.getElementById("task-input");
  const task = input.value.trim();
  if (!task) return;

  const btn = document.getElementById("run-btn");
  btn.disabled = true;
  document.getElementById("result-area").classList.add("hidden");
  setStatus("Orchestrator is planning your task…");

  try {
    const res = await fetch("/api/run", {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify({ task }),
    });

    if (!res.ok) {
      const err = await res.json();
      throw new Error(err.detail || "Unknown error");
    }

    setStatus("Agents working…");
    const data = await res.json();
    lastResult = data;
    renderResult(data);
  } catch (e) {
    clearStatus();
    document.getElementById("status-bar").classList.remove("hidden");
    document.getElementById("status-bar").innerHTML = `<span style="color:var(--red)">Error: ${e.message}</span>`;
  } finally {
    btn.disabled = false;
  }
}

function renderResult(data) {
  clearStatus();

  // Plan label
  document.getElementById("plan-label").textContent = data.plan || "";

  // Agent badges
  const usedAgents = [...new Set(data.agent_results.map(r => r.agent))];
  document.getElementById("agent-badges").innerHTML = usedAgents.map(
    a => `<span class="badge">${a}</span>`
  ).join("");

  // Final output
  document.getElementById("final-output").textContent = data.final_output;

  // Breakdown
  const breakdown = document.getElementById("breakdown-output");
  if (data.agent_results.length === 0) {
    breakdown.innerHTML = "<p style='color:var(--muted)'>No agent breakdown available.</p>";
  } else {
    breakdown.innerHTML = data.agent_results.map(r => `
      <div class="agent-result">
        <div class="agent-result-header">
          <span>${r.agent}</span>
          <span class="agent-result-subtask">${r.subtask}</span>
        </div>
        <div class="agent-result-body">${escapeHtml(r.result)}</div>
      </div>
    `).join("");
  }

  showTab("final");
  document.getElementById("result-area").classList.remove("hidden");
}

function escapeHtml(str) {
  return str
    .replace(/&/g, "&amp;")
    .replace(/</g, "&lt;")
    .replace(/>/g, "&gt;")
    .replace(/"/g, "&quot;");
}

// Allow Ctrl+Enter to submit
document.addEventListener("DOMContentLoaded", () => {
  loadAgents();
  document.getElementById("task-input").addEventListener("keydown", e => {
    if (e.key === "Enter" && (e.ctrlKey || e.metaKey)) runTask();
  });
});
