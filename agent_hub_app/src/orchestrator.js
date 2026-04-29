const { runClaude } = require("./agents/claude");
const { runOpenAI } = require("./agents/openai");
const { runGemini } = require("./agents/gemini");

const ORCHESTRATOR_SYSTEM = `You are an AI orchestrator. Analyze the user's task and decide which AI agent(s) should handle it.

Agent strengths:
- Claude: reasoning, code, structured analysis, technical writing
- ChatGPT: creative writing, general knowledge, conversational tasks
- Gemini: research, long-form content, factual synthesis

Respond ONLY with valid JSON (no markdown fences):
{
  "plan": "one sentence explaining your approach",
  "assignments": [
    {
      "agent": "Claude|ChatGPT|Gemini",
      "subtask": "specific task for this agent",
      "context": "extra context or instructions"
    }
  ],
  "synthesis_instruction": "how to combine results, or 'passthrough' if only one agent"
}

Only assign agents listed as available. Always produce a complete, finished result.`;

async function orchestrate(task, { anthropicKey, openaiKey, googleKey }) {
  const available = [];
  if (anthropicKey) available.push("Claude");
  if (openaiKey) available.push("ChatGPT");
  if (googleKey) available.push("Gemini");

  // Plan
  const Anthropic = require("@anthropic-ai/sdk");
  const client = new Anthropic.default({ apiKey: anthropicKey });

  const planMsg = await client.messages.create({
    model: "claude-sonnet-4-6",
    max_tokens: 1024,
    system: ORCHESTRATOR_SYSTEM,
    messages: [
      {
        role: "user",
        content: `Available agents: ${available.join(", ")}\n\nUser task:\n${task}`,
      },
    ],
  });

  let raw = planMsg.content[0].text.trim();
  if (raw.startsWith("```")) {
    raw = raw.replace(/^```[a-z]*\n?/, "").replace(/\n?```$/, "");
  }
  const plan = JSON.parse(raw);

  // Execute
  const agentResults = [];
  for (const assignment of plan.assignments) {
    if (!available.includes(assignment.agent)) continue;
    let result;

    if (assignment.agent === "Claude") {
      result = await runClaude(assignment.subtask, assignment.context || "", anthropicKey);
    } else if (assignment.agent === "ChatGPT") {
      result = await runOpenAI(assignment.subtask, assignment.context || "", openaiKey);
    } else if (assignment.agent === "Gemini") {
      result = await runGemini(assignment.subtask, assignment.context || "", googleKey);
    }

    agentResults.push({ agent: assignment.agent, subtask: assignment.subtask, result });
  }

  if (agentResults.length === 0) {
    return { plan: plan.plan, agentResults: [], finalOutput: "No agents available." };
  }

  // Single agent or passthrough
  if (agentResults.length === 1 || plan.synthesis_instruction === "passthrough") {
    return { plan: plan.plan, agentResults, finalOutput: agentResults[0].result };
  }

  // Synthesize
  const parts = agentResults.map((r) => `=== ${r.agent} ===\n${r.result}`).join("\n\n");
  const synthesisPrompt =
    `Original task: ${task}\n\nInstruction: ${plan.synthesis_instruction}\n\n${parts}\n\n` +
    "Combine the above into one cohesive, finished result.";

  const synthMsg = await client.messages.create({
    model: "claude-sonnet-4-6",
    max_tokens: 4096,
    system: "You are a synthesis AI. Combine multiple AI outputs into one polished, finished result.",
    messages: [{ role: "user", content: synthesisPrompt }],
  });

  return {
    plan: plan.plan,
    agentResults,
    finalOutput: synthMsg.content[0].text,
  };
}

module.exports = { orchestrate };
