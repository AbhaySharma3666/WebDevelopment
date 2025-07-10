/*
    It is used to declare variables that are block-scoped, meaning they are only accessible within the block in which they are defined. 
*/


let x = 10;
if (true) {
    let y = 20;
    console.log(x); // Output: 10
    console.log(y); // Output: 20
}
console.log(x); // Output: 10
console.log(y); // Throws ReferenceError: y is not defined


/*
   Reassignment and Redefinition using let
    Variables declared with let can be reassigned, just like var, but they cannot be redeclared within the same block scope. This helps prevent accidental redeclaration of variables and can aid in writing more predictable and maintainable code.
*/


// Re assignment using 'let'

let m = 10;
console.log(m);    // Output : 10

x = "Mayank";
console.log(m);    // Output : Mayank


// Re definition using 'let'

// let w = 10;

// let w = "Mayank";
// console.log(w);    // Output : Error!