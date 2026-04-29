import os
from contextlib import asynccontextmanager
from dotenv import load_dotenv

load_dotenv()

from fastapi import FastAPI, HTTPException
from fastapi.staticfiles import StaticFiles
from fastapi.responses import FileResponse
from pydantic import BaseModel

from agents import ClaudeAgent, OpenAIAgent, GeminiAgent
from orchestrator import plan_and_execute

ALL_AGENTS = [ClaudeAgent, OpenAIAgent, GeminiAgent]


@asynccontextmanager
async def lifespan(app: FastAPI):
    yield


app = FastAPI(title="Agent Hub", lifespan=lifespan)
app.mount("/static", StaticFiles(directory="static"), name="static")


@app.get("/")
def root():
    return FileResponse("static/index.html")


@app.get("/api/agents")
def list_agents():
    return [
        {
            "name": cls.name,
            "description": cls.description,
            "available": cls.is_available(),
        }
        for cls in ALL_AGENTS
    ]


class TaskRequest(BaseModel):
    task: str


@app.post("/api/run")
def run_task(req: TaskRequest):
    if not os.getenv("ANTHROPIC_API_KEY"):
        raise HTTPException(status_code=500, detail="ANTHROPIC_API_KEY is required for the orchestrator.")

    available = [cls.name for cls in ALL_AGENTS if cls.is_available()]
    if not available:
        raise HTTPException(status_code=500, detail="No AI agents are configured. Add API keys to .env")

    try:
        result = plan_and_execute(req.task, available)
        return result
    except Exception as e:
        raise HTTPException(status_code=500, detail=str(e))
