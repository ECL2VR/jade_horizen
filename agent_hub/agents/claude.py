import os
import anthropic

_client = None


def _get_client():
    global _client
    if _client is None:
        _client = anthropic.Anthropic(api_key=os.getenv("ANTHROPIC_API_KEY"))
    return _client


class ClaudeAgent:
    name = "Claude"
    description = "Anthropic Claude — strong reasoning, writing, analysis, and code"
    available = bool(os.getenv("ANTHROPIC_API_KEY"))

    @staticmethod
    def is_available() -> bool:
        return bool(os.getenv("ANTHROPIC_API_KEY"))

    @staticmethod
    def run(task: str, context: str = "") -> str:
        client = _get_client()
        system = "You are a highly capable AI assistant. Complete the task given to you thoroughly and return a finished, polished result."
        if context:
            system += f"\n\nAdditional context from the orchestrator:\n{context}"

        message = client.messages.create(
            model="claude-sonnet-4-6",
            max_tokens=4096,
            system=system,
            messages=[{"role": "user", "content": task}],
        )
        return message.content[0].text
