const prompt = require('prompt-sync')();
let Username = prompt("Enter your name: ");
if (Username) {
    console.log("Hello, " + Username + "!");
} else {
    console.log("Hello, Guest!");
}

// Run the code in a browser to see the prompt dialog.
// Note: The prompt function is not available in Node.js, it is a browser-specific feature.
//for run this code in terminal use readline-sync package. Some step to run this code in terminal
// 1. npm init -y  (this will create a package.json file)
// 2. npm install prompt-sync  (this will install the prompt-sync package)
// 3. Write the code in a file const prompt = require('prompt-sync')();

// prompt data type is string

let age = prompt("Enter your age: ");
if (age) {
    console.log("You are " + age + " years old.");
    console.log("Data type :-"+typeof age); // This will show 'string'
}

let num1 = parseFloat(prompt("Enter first number: "));
let num2 = parseFloat(prompt("Enter second number: "));
if (!isNaN(num1) && !isNaN(num2)) {
    let sum = num1 + num2;
    console.log("The sum of " + num1 + " and " + num2 + " is: " + sum);
    console.log("Data type of sum is: " + typeof sum); // This will show 'number'
}
