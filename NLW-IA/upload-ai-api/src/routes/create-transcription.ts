import { FastifyInstance } from "fastify";
import { prisma } from "../lib/prisma";
import { z } from 'zod';
import { createReadStream } from 'node:fs';

import { openai } from '../lib/openai';

export async function createTranscriptionRoute(app: FastifyInstance) {
  app.post('/videos/:idVideo/transcription', async (req, reply) => {
    const paramSchema = z.object({
      idVideo: z.string().uuid(),
    });
    const bodySchema = z.object({
      prompt: z.string(),
    });
    const { idVideo } = paramSchema.parse(req.params);
    const { prompt } = bodySchema.parse(req.body);
    console.log(idVideo, prompt);

    const video = await prisma.video.findUniqueOrThrow({
      where: { id: idVideo },
    });

    const videoPath = video.path;
    const audioReadStream = createReadStream(videoPath);
    const response = await openai.audio.transcriptions.create({
      file: audioReadStream,
      model: 'whisper-1',
      language: 'pt',
      response_format: 'json',
      temperature: 0,
      prompt,
    });

    await prisma.video.update({
      where: { id: idVideo },
      data: {
        transcription: response.text,
      },
    });

    return response.text;
  });
}