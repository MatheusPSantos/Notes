import { InMemoryChallengeRepository } from "../../../test/repositories/in-memory-challenges-repository";
import { InMemoryStudentRepository } from "../../../test/repositories/in-memory-students-repository";
import { Challenge } from "../../domain/entities/challenge";
import { Student } from "../../domain/entities/student";
import { CreateChallengeSubmission } from "./create-challenge-submission";

describe("Create challenge submission use case", () => {
  it("should be able to create a new challenge submission", async () => {

    const studentsRepository = new InMemoryStudentRepository();
    const challengeRepository = new InMemoryChallengeRepository();

    const studen = Student.create({
      name: "Nome",
      email: "email@example.com"
    });

    const challenge = Challenge.create({
      title: "Challege 00",
      instructionsUrl: "http://teste.com"
    });

    studentsRepository.items.push(studen);
    challengeRepository.items.push(challenge);

    const sut = new CreateChallengeSubmission(
      studentsRepository,
      challengeRepository
    );


    const response = await sut.execute({
      studentId: studen.id,
      challengeId: challenge.id
    });

    expect(response).toBeTruthy();
  })
});