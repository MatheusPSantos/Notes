import { counter } from "./singleton2";

export default class SuperCounter {
  contructor() {
    this.count = 0;
  }
  increment() {
    counter.increment();
    return this.count += 100;
  }
  decrement() {
    counter.decrement();
    return this.count -= 100;
  }
}