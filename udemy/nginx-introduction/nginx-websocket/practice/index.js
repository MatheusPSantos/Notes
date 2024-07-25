const http = require("http");
const WebSocketServer = require('websocket').server;

const httpServer = http.createServer();
const websocketServe = new WebSocketServer({ "httpServer": httpServer });

const PORT = process.argv[2] || 8080;

let connection = null;

httpServer.listen(PORT, () => console.log('listing port ', PORT));

websocketServe.on("request", request => {
  connection = request.accept(null, request.origin);
  connection.on("message", data => {
    console.log("Received message");
    console.log(data)
    connection.send(`Client I received your message on ${PORT}`);
  });
});
