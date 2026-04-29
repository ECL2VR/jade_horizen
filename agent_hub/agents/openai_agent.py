import os

_client = None


def _get_client():
    global _client
    if _client is None:
        import openai
        _client = openai.OpenAI(api_key=os.getenv("OPENAI_API_KEY"))
    return _client


class OpenAIAgent:
    name = "ChatGPT"
    description = "OpenAI GPT-4o — creative writing, broad knowledge, conversational tasks"

    @staticmethod
    def is_available() -> bool:
        return bool(os.getenv("OPENAI_API_KEY"))

    @staticmethod
    def run(task: str, context: str = "") -> str:
        client = _get_client()
        system = "You are a highly capable AI assistant. Complete the task given to you thoroughly and return a finished, polished result."
        if context:
            system += f"\n\nAdditional context:\n{context}"

        response = client.chat.completions.create(
            model="gpt-4o",
            messages=[
                {"role": "system", "content": system},
                {"role": "user", "content": task},
            ],
            max_tokens=4096,
        )
        return response.choices[0].message.content
