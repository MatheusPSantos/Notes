// lets use the same example but this time, the counter is simply an object
// containing:
//count property
//increment method and decrement method
let count = 0;
const counter = {
  increment() {
    return ++count;
  },
  decrement() {
    return --count;
  }
};

Object.freeze(counter);
export { counter };