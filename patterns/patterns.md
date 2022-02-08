# Singleton
Singletons are classes which can be instantiated once, and can be accessed globally.
On the singleton.js, one way to make sure that only one instance can be created, is by creting
 a variable called `instance`. In the constructor `instance` receive the reference of the instance 
when new instance is created.

### (Dis)advantages
> Share a single global instance throughout our application
- Restrict instantiation to just one instance could potentially save a lot of memory;
- Singleton are actually considered an anti-pattern, and can (should) be avoided in JS;
- Since we can't create new instances each time, all tests rely on the modification to the global
instance of the previous test;
- the order of the tests matter in this case;
- after the test, we need to rest the entire instance in order to reset the modifications made by tests;
- dependency hiding;

### Global behavior
- A singleton instance should be able to get referenced throughout the entire app;
- The common usecase for a Singleton is to  have some sort of global state throughout your app;
