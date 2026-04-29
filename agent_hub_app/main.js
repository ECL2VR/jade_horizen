const { app, BrowserWindow, ipcMain, nativeTheme } = require("electron");
const path = require("path");
const Store = require("electron-store");

const store = new Store({
  encryptionKey: "agenthub-local-key",
});

nativeTheme.themeSource = "dark";

let mainWindow;

function createWindow() {
  mainWindow = new BrowserWindow({
    width: 980,
    height: 720,
    minWidth: 700,
    minHeight: 500,
    backgroundColor: "#0e0e11",
    titleBarStyle: process.platform === "darwin" ? "hiddenInset" : "default",
    webPreferences: {
      preload: path.join(__dirname, "preload.js"),
      contextIsolation: true,
      nodeIntegration: false,
    },
    icon: path.join(__dirname, "renderer", "icon.png"),
    show: false,
  });

  mainWindow.loadFile(path.join(__dirname, "renderer", "index.html"));

  mainWindow.once("ready-to-show", () => {
    mainWindow.show();
  });
}

app.whenReady().then(() => {
  createWindow();
  app.on("activate", () => {
    if (BrowserWindow.getAllWindows().length === 0) createWindow();
  });
});

app.on("window-all-closed", () => {
  if (process.platform !== "darwin") app.quit();
});

// ── IPC: settings ──────────────────────────────────────────
ipcMain.handle("get-keys", () => ({
  anthropic: store.get("anthropic_key", ""),
  openai: store.get("openai_key", ""),
  google: store.get("google_key", ""),
}));

ipcMain.handle("save-keys", (_e, keys) => {
  if (keys.anthropic !== undefined) store.set("anthropic_key", keys.anthropic);
  if (keys.openai !== undefined) store.set("openai_key", keys.openai);
  if (keys.google !== undefined) store.set("google_key", keys.google);
  return true;
});

// ── IPC: list available agents ─────────────────────────────
ipcMain.handle("list-agents", () => {
  return [
    { name: "Claude", available: !!store.get("anthropic_key") },
    { name: "ChatGPT", available: !!store.get("openai_key") },
    { name: "Gemini", available: !!store.get("google_key") },
  ];
});

// ── IPC: run task ──────────────────────────────────────────
ipcMain.handle("run-task", async (_e, task) => {
  const anthropicKey = store.get("anthropic_key", "");
  const openaiKey = store.get("openai_key", "");
  const googleKey = store.get("google_key", "");

  if (!anthropicKey) throw new Error("Add your Anthropic API key in Settings first.");

  const { orchestrate } = require("./src/orchestrator");
  return await orchestrate(task, { anthropicKey, openaiKey, googleKey });
});
