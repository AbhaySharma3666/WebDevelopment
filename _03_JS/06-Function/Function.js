/*Syntax :- 

function functionName(parameter1, parameter2, ...) {
    // Function body
    // Code to be executed
    return value; // Optional
} */

console.log("---------another way to write function----------");

// function Definition
function sayMyword(){
    console.log("Hiii...");
}
// function call
sayMyword();

console.log("---------another way to write function----------");

function count(){
    for(let i=1 ; i<=5 ; i++){
        console.log(i);
    }
}
count();

console.log("--------another way to variable function------------");

let multi = function(num1, num2){
    return num1 * num2;
}
console.log(multi(10, 20));


