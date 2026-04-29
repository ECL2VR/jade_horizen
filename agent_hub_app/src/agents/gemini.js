async function runGemini(task, context, apiKey) {
  const { GoogleGenerativeAI } = require("@google/generative-ai");
  const genAI = new GoogleGenerativeAI(apiKey);
  const model = genAI.getGenerativeModel({
    model: "gemini-1.5-pro",
    systemInstruction:
      "You are a highly capable AI assistant. Complete the task given to you thoroughly and return a finished, polished result.",
  });

  const prompt = context ? `Context:\n${context}\n\nTask:\n${task}` : task;
  const result = await model.generateContent(prompt);
  return result.response.text();
}

module.exports = { runGemini };
