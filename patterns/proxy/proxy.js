const person = {
  name: "João",
  age: 43,
  nationality: "Brazilian"
};

// creating a new instance of Proxy;

const personProxy = new Proxy(person, {});
// the second argument represents the handler
// in the handler we can define behavior based on the type interaction
// there are many methods that you can add to Proxy, like get and set
// Instead to interact with the person object, we will be interacting
// with the personProxy