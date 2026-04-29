let lastResult = null;

// ── Screen navigation ──────────────────────────────────────
function showMain() {
  document.getElementById("screenMain").classList.add("active");
  document.getElementById("screenSettings").classList.remove("active");
  refreshAgents();
}

function showSettings() {
  document.getElementById("screenMain").classList.remove("active");
  document.getElementById("screenSettings").classList.add("active");
  loadKeys();
}

// ── Agent pills ────────────────────────────────────────────
async function refreshAgents() {
  const agents = await window.api.listAgents();
  const el = document.getElementById("titleAgents");
  el.innerHTML = agents
    .map(
      (a) =>
        `<div class="pill ${a.available ? "on" : "off"}">
          <span class="dot"></span>${a.name}
        </div>`
    )
    .join("");
}

// ── Settings ───────────────────────────────────────────────
async function loadKeys() {
  const keys = await window.api.getKeys();
  document.getElementById("keyAnthropic").value = keys.anthropic || "";
  document.getElementById("keyOpenAI").value = keys.openai || "";
  document.getElementById("keyGoogle").value = keys.google || "";
}

async function saveKeys() {
  await window.api.saveKeys({
    anthropic: document.getElementById("keyAnthropic").value.trim(),
    openai: document.getElementById("keyOpenAI").value.trim(),
    google: document.getElementById("keyGoogle").value.trim(),
  });
  const confirm = document.getElementById("saveConfirm");
  confirm.style.display = "inline";
  setTimeout(() => (confirm.style.display = "none"), 2000);
  refreshAgents();
}

// ── Task runner ────────────────────────────────────────────
function setStatus(msg) {
  document.getElementById("statusEl").classList.remove("hidden");
  document.getElementById("statusText").textContent = msg;
  document.getElementById("errorEl").classList.add("hidden");
}

function clearStatus() {
  document.getElementById("statusEl").classList.add("hidden");
}

function showError(msg) {
  clearStatus();
  const el = document.getElementById("errorEl");
  el.textContent = msg;
  el.classList.remove("hidden");
}

async function runTask() {
  const task = document.getElementById("taskInput").value.trim();
  if (!task) return;

  const btn = document.getElementById("runBtn");
  btn.disabled = true;
  document.getElementById("resultCard").classList.add("hidden");
  document.getElementById("errorEl").classList.add("hidden");
  setStatus("Orchestrator is planning your task…");

  try {
    const result = await window.api.runTask(task);
    lastResult = result;
    renderResult(result);
  } catch (e) {
    showError(e.message || "Something went wrong.");
  } finally {
    btn.disabled = false;
  }
}

// ── Result rendering ───────────────────────────────────────
function renderResult(data) {
  clearStatus();

  document.getElementById("planText").textContent = data.plan || "";

  const usedAgents = [...new Set(data.agentResults.map((r) => r.agent))];
  document.getElementById("resultBadges").innerHTML = usedAgents
    .map((a) => `<span class="badge">${a}</span>`)
    .join("");

  document.getElementById("finalOutput").textContent = data.finalOutput;

  const breakdown = document.getElementById("breakdownContent");
  if (!data.agentResults.length) {
    breakdown.innerHTML = "<p style='color:var(--muted);font-size:.85rem'>No breakdown available.</p>";
  } else {
    breakdown.innerHTML = data.agentResults
      .map(
        (r) => `
      <div class="agent-block">
        <div class="agent-block-header">
          ${r.agent}
          <div class="agent-block-sub">${escHtml(r.subtask)}</div>
        </div>
        <div class="agent-block-body">${escHtml(r.result)}</div>
      </div>`
      )
      .join("");
  }

  showTab("final");
  document.getElementById("resultCard").classList.remove("hidden");
  document.getElementById("resultCard").scrollIntoView({ behavior: "smooth", block: "start" });
}

function showTab(name) {
  ["final", "breakdown"].forEach((t) => {
    document.getElementById(`tab${cap(t)}`).classList.toggle("active", t === name);
  });
  document.querySelectorAll(".tab").forEach((btn, i) => {
    btn.classList.toggle("active", (i === 0 && name === "final") || (i === 1 && name === "breakdown"));
  });
}

function copyResult() {
  if (!lastResult) return;
  navigator.clipboard.writeText(lastResult.finalOutput);
  const btn = document.querySelector(".copy-btn");
  const orig = btn.textContent;
  btn.textContent = "Copied!";
  setTimeout(() => (btn.textContent = orig), 1500);
}

function escHtml(s) {
  return String(s)
    .replace(/&/g, "&amp;")
    .replace(/</g, "&lt;")
    .replace(/>/g, "&gt;");
}

function cap(s) {
  return s.charAt(0).toUpperCase() + s.slice(1);
}

// ── Init ───────────────────────────────────────────────────
document.addEventListener("DOMContentLoaded", () => {
  refreshAgents();
  document.getElementById("taskInput").addEventListener("keydown", (e) => {
    if (e.key === "Enter" && (e.ctrlKey || e.metaKey)) runTask();
  });
});
