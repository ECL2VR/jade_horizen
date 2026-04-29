async function runClaude(task, context, apiKey) {
  const Anthropic = require("@anthropic-ai/sdk");
  const client = new Anthropic.default({ apiKey });

  const system =
    "You are a highly capable AI assistant. Complete the task given to you thoroughly and return a finished, polished result." +
    (context ? `\n\nOrchestrator context:\n${context}` : "");

  const msg = await client.messages.create({
    model: "claude-sonnet-4-6",
    max_tokens: 4096,
    system,
    messages: [{ role: "user", content: task }],
  });

  return msg.content[0].text;
}

module.exports = { runClaude };
