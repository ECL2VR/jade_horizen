#!/usr/bin/env bash
set -e

SCRIPT_DIR="$(cd "$(dirname "$0")" && pwd)"
cd "$SCRIPT_DIR"

if [ ! -f ".env" ]; then
  cp .env.example .env
  echo "Created .env — add your API keys then run this script again."
  exit 1
fi

if [ ! -d ".venv" ]; then
  echo "Setting up virtual environment..."
  python3 -m venv .venv
  .venv/bin/pip install -q --upgrade pip
  .venv/bin/pip install -q -r requirements.txt
  echo "Done."
fi

echo "Starting Agent Hub at http://localhost:8000"
.venv/bin/uvicorn main:app --host 0.0.0.0 --port 8000 --reload
