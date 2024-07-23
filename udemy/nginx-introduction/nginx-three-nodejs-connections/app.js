const express = require("express");
const app = express();
const os = require("os");
const hostname = os.hostname();

const PORT = 8000;

app.get("/", (req, res) => res.send("Hello from " + hostname));

app.listen(PORT, () => console.info("App running, listining on ", PORT));