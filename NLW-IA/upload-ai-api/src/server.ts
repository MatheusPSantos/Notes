import fastifyCors from '@fastify/cors';
import { fastify } from 'fastify';
import { createTranscriptionRoute } from './routes/create-transcription';
import { generateAiCompletionRoute } from './routes/generate-ai-completion';
import { getAllPromptsRoute } from './routes/get-all-prompts';
import { uploadVideoRoute } from './routes/upload-video';

const PORT = 3333;
const app = fastify();

app.register(fastifyCors, { origin: '*' });

app.register(getAllPromptsRoute);
app.register(uploadVideoRoute);
app.register(createTranscriptionRoute);
app.register(generateAiCompletionRoute);

app.listen({
  port: PORT,
}).then(() => console.log(`Http server running http://127.0.0.1:${PORT}`));