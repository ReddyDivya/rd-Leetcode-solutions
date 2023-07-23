//Write a function createHelloWorld. It should return a new function that always returns "Hello World".

var createHelloWorld = function() {
    //...args - Rest Arguments
    // returning an arrow function
    return (...args) =>  "Hello World";
};

const output = createHelloWorld();
output(); // "Hello World"
