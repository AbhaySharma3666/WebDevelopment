console.log("Function Expression Example");
// Function Expression
const greet = function(name) {  // Function Expression
    console.log("Hello, " + name + "!");
};
greet("Alice");  // Calling the function with an argument


// Function Expression with return value    
const add = function(a, b) {
    return a + b;  // Returning the sum of a and b
};
const result = add(5, 10);  // Calling the function and storing the result
console.log("Sum:", result);  // Output the result of the addition
