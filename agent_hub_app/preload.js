const { contextBridge, ipcRenderer } = require("electron");

contextBridge.exposeInMainWorld("api", {
  getKeys: () => ipcRenderer.invoke("get-keys"),
  saveKeys: (keys) => ipcRenderer.invoke("save-keys", keys),
  listAgents: () => ipcRenderer.invoke("list-agents"),
  runTask: (task) => ipcRenderer.invoke("run-task", task),
});
