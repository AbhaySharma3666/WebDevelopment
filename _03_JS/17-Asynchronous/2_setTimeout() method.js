//  setTimeout() : The setTimeout() method is a built-in JavaScript function that allows us to schedule the execution of a function or the evaluation of an expression after a specified delay, measured in milliseconds. It provides a way to execute code asynchronously after a certain period, without blocking the execution of subsequent code.

//  Syntax: setTimeout(function, delay, arg1, arg2, ...)

// 1 : Simple Delay

function sayHello() {
  console.log("Hello after 2 seconds!");
}

setTimeout(sayHello, 2000); // Call sayHello after 2 seconds (2000 milliseconds)

console.log("This will be printed immediately.");


// 2 : Passing Arguments

function greet(name) {
    console.log("Hello, " + name + "!");
  }
  
  setTimeout(greet, 1000, "Alice"); // Call greet with "Alice" after 1 second
  

// 3 : Anonymous Function

setTimeout(function() {
    console.log("This function is executed after 3 seconds.");
  }, 3000);


//  clearTimeout() Method

const timeoutId = setTimeout(() => {
    console.log("This message won't be displayed");
}, 500);

clearTimeout(timeoutId); // Cancel the scheduled timeout