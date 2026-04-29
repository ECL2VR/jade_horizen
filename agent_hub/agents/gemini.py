import os

_model = None


def _get_model():
    global _model
    if _model is None:
        import google.generativeai as genai
        genai.configure(api_key=os.getenv("GOOGLE_API_KEY"))
        _model = genai.GenerativeModel(
            model_name="gemini-1.5-pro",
            system_instruction="You are a highly capable AI assistant. Complete the task given to you thoroughly and return a finished, polished result.",
        )
    return _model


class GeminiAgent:
    name = "Gemini"
    description = "Google Gemini 1.5 Pro — research, long documents, multimodal tasks"

    @staticmethod
    def is_available() -> bool:
        return bool(os.getenv("GOOGLE_API_KEY"))

    @staticmethod
    def run(task: str, context: str = "") -> str:
        model = _get_model()
        prompt = task
        if context:
            prompt = f"Context from orchestrator:\n{context}\n\nTask:\n{task}"
        response = model.generate_content(prompt)
        return response.text
