/*
      Function Call Stack:
      The function call stack is a stack data structure that stores the execution context of the function.
      It is used to manage the execution of functions.
      It is a LIFO (Last In First Out) data structure.

      Example:

*/ 

function add(a, b) {
    console.log(a + b);
}

function multiply(a, b) {
   console.log(a * b);
   add(a, b);
}

multiply(5, 10);

console.log("--------------------------------");
function greetMe(greet, fullname){
   console.log("hello",fullname);
   greet();
}

function greet(){
   console.log("how are you");
}

greetMe(greet, "Mayank");

console.log("--------------------------------");
function solve(number){
   return function(number){
      return number * number;
   }
}

const ans = solve(5);
console.log(ans(5));

console.log("--------------------------------");

const myArray = [
   function(a,b){
      return a + b;
   },
   function(a,b){
      return a * b;
   },
   function(a,b){
      return a - b;
   },
   function(a,b){
      return a / b;
   }
]

let ans1 =  myArray[0];
console.log(ans1(5,10));

