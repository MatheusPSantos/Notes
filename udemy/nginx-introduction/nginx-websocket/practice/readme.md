to add the configuration to use layer 4 reverse proxy for webscoket
- use the path to tcp.cfg
  - at nginx -c /udemy/nginx-introduction/nginx-websocket/practice/tcp.cfg

run
```shell
  nginx -c /Notes/udemy/nginx-introduction/nginx-websocket/practice/tcp.cfg 
```

When call the server websocket in client we can have this:

```javascript
let ws1 = new WebSocket("ws://localhost")
//undefined
ws1.onmessage = e => console.log(e.data)
//e => console.log(e.data)
ws1.send("Hi there")
//undefined
// output: VM366:1 Client I received your message on 2222
let ws1 = new WebSocket("ws://localhost")
//undefined
ws1.onmessage = e => console.log(e.data)
//e => console.log(e.data)
ws1.send("Hi there")
//undefined
// output: VM392:1 Client I received your message on 4444
let ws = new WebSocket("ws://localhost")
//undefined
ws.onmessage = e => console.log(e.data)
//e => console.log(e.data)
ws.send("Hi there")
//undefined
// output: VM445:1 Client I received your message on 5555
let ws2 = new WebSocket("ws://localhost")
//undefined
ws2.onmessage = e => console.log(e.data)
//e => console.log(e.data)
ws2.send("Hello")
//undefined
// output: VM656:1 Client I received your message on 2222
```

### using Nginx as layer 7 proxy
creating ws.cfg

add the path to ws.cfg in command `nginx -c path/ws.cfg`

we can obtain this output testing an client:

```js
let ws = new WebSocket("ws://localhost/wsApp");
undefined
ws.onmessage = e => console.log(e.data)
e => console.log(e.data)
    ws.send("blabla")
undefined
VM1298:1 Client I received your message on 2222
    ws.send("blabla")
undefined
VM1298:1 Client I received your message on 2222
    ws.send("blabla")
undefined
VM1298:1 Client I received your message on 2222
let ws = new WebSocket("ws://localhost/wsChat");
undefined
ws.onmessage = e => console.log(e.data)
e => console.log(e.data)
    ws.send("blabla")
undefined
VM1386:1 Client I received your message on 4444
    ws.send("blabla")
undefined
VM1386:1 Client I received your message on 4444
    ws.send("blabla")
undefined
VM1386:1 Client I received your message on 4444
let ws = new WebSocket("ws://localhost/wsChat");
undefined
ws.onmessage = e => console.log(e.data)
e => console.log(e.data)
    ws.send("blabla")
undefined
VM1422:1 Client I received your message on 5555
let ws = new WebSocket("ws://localhost/wsChat");
undefined
ws.onmessage = e => console.log(e.data)
e => console.log(e.data)
    ws.send("blabla")
undefined
VM1447:1 Client I received your message on 4444
```