import os
import json
import anthropic
from agents import ClaudeAgent, OpenAIAgent, GeminiAgent

ALL_AGENTS = [ClaudeAgent, OpenAIAgent, GeminiAgent]

ORCHESTRATOR_SYSTEM = """You are an AI orchestrator. Your job is to:
1. Analyze the user's task
2. Decide which AI agent(s) would produce the best result
3. Optionally split the task into sub-tasks for different agents
4. Synthesize their outputs into a single finished product

Available agents and their strengths:
- Claude: strong reasoning, code, structured analysis, technical writing
- ChatGPT: creative writing, broad general knowledge, conversational tone
- Gemini: research synthesis, long-form content, factual lookup

Respond ONLY with valid JSON in this exact format:
{
  "plan": "one sentence explaining your approach",
  "assignments": [
    {
      "agent": "<Claude|ChatGPT|Gemini>",
      "subtask": "the specific task for this agent",
      "context": "any extra context or instructions for this agent"
    }
  ],
  "synthesis_instruction": "how to combine results into the final output (or 'passthrough' if only one agent)"
}

Only assign agents that are listed as available. Always produce a complete, finished result."""


def plan_and_execute(task: str, available_agents: list[str]) -> dict:
    """
    Orchestrate: plan via Claude, execute subtasks, synthesize results.
    Returns a dict with plan, agent_results, and final_output.
    """
    client = anthropic.Anthropic(api_key=os.getenv("ANTHROPIC_API_KEY"))

    available_str = ", ".join(available_agents)
    planning_prompt = f"Available agents: {available_str}\n\nUser task:\n{task}"

    plan_response = client.messages.create(
        model="claude-sonnet-4-6",
        max_tokens=1024,
        system=ORCHESTRATOR_SYSTEM,
        messages=[{"role": "user", "content": planning_prompt}],
    )

    raw = plan_response.content[0].text.strip()
    # Strip markdown code fences if present
    if raw.startswith("```"):
        raw = raw.split("```")[1]
        if raw.startswith("json"):
            raw = raw[4:]
    plan = json.loads(raw)

    agent_map = {
        "Claude": ClaudeAgent,
        "ChatGPT": OpenAIAgent,
        "Gemini": GeminiAgent,
    }

    agent_results = []
    for assignment in plan["assignments"]:
        agent_name = assignment["agent"]
        if agent_name not in available_agents:
            continue
        agent_cls = agent_map.get(agent_name)
        if not agent_cls:
            continue

        result = agent_cls.run(assignment["subtask"], assignment.get("context", ""))
        agent_results.append({
            "agent": agent_name,
            "subtask": assignment["subtask"],
            "result": result,
        })

    if len(agent_results) == 0:
        return {
            "plan": plan.get("plan", ""),
            "agent_results": [],
            "final_output": "No agents were available to complete this task.",
        }

    # Single agent — return directly
    if len(agent_results) == 1 or plan.get("synthesis_instruction") == "passthrough":
        return {
            "plan": plan.get("plan", ""),
            "agent_results": agent_results,
            "final_output": agent_results[0]["result"],
        }

    # Multiple agents — synthesize
    synthesis_parts = []
    for r in agent_results:
        synthesis_parts.append(f"=== {r['agent']} output ===\n{r['result']}")

    synthesis_prompt = (
        f"Original task: {task}\n\n"
        f"Synthesis instruction: {plan['synthesis_instruction']}\n\n"
        + "\n\n".join(synthesis_parts)
        + "\n\nCombine the above into one cohesive, finished result for the user."
    )

    synthesis_response = client.messages.create(
        model="claude-sonnet-4-6",
        max_tokens=4096,
        system="You are a synthesis AI. Combine multiple AI outputs into a single polished, finished result.",
        messages=[{"role": "user", "content": synthesis_prompt}],
    )

    return {
        "plan": plan.get("plan", ""),
        "agent_results": agent_results,
        "final_output": synthesis_response.content[0].text,
    }
