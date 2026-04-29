async function runOpenAI(task, context, apiKey) {
  const OpenAI = require("openai");
  const client = new OpenAI.default({ apiKey });

  const system =
    "You are a highly capable AI assistant. Complete the task given to you thoroughly and return a finished, polished result." +
    (context ? `\n\nContext:\n${context}` : "");

  const res = await client.chat.completions.create({
    model: "gpt-4o",
    max_tokens: 4096,
    messages: [
      { role: "system", content: system },
      { role: "user", content: task },
    ],
  });

  return res.choices[0].message.content;
}

module.exports = { runOpenAI };
