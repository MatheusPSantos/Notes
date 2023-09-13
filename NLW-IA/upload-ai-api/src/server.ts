import { fastify } from 'fastify';

const PORT = 3333;
const app = fastify();

app.get('/', () => {
  return 'Hello world';
});

app.listen({
  port: PORT,
}).then(() => console.log(`Http server running http://127.0.0.1:${PORT}`));