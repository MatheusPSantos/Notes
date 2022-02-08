import SuperCounter from "./supercounter.js";

test("incrementing 1 time should be 1", () => {
  SuperCounter.increment();
  expect(SuperCounter.getCount()).toBe(1);
});