<<<<<<< HEAD
/* 
    var is function scoped
 When we declare a variable using var inside a function, we canot access the variable outside the function.
 
 */

function example() {
    var x = 10;
    console.log(x);
}

example();              // 10
console.log(x);       // Throws ReferenceError: x is not defined


/*
    Reassignment and Redefinition using var
    var keyword allows variables to be both reassigned and redefined within the same scope, unlike let which only allows reassignment. This behavior of var can sometimes lead to unexpected results and bugs in code if not used carefully.
*/


// Re definition using var
var x = 10;
console.log(x);    // Output : 10

var x = "Mayank";
=======
/* 
    var is function scoped
 When we declare a variable using var inside a function, we canot access the variable outside the function.
 
 */

function example() {
    var x = 10;
    console.log(x);
}

example();              // 10
console.log(x);       // Throws ReferenceError: x is not defined


/*
    Reassignment and Redefinition using var
    var keyword allows variables to be both reassigned and redefined within the same scope, unlike let which only allows reassignment. This behavior of var can sometimes lead to unexpected results and bugs in code if not used carefully.
*/


// Re definition using var
var x = 10;
console.log(x);    // Output : 10

var x = "Mayank";
>>>>>>> 35387576b9a0b809457b398be6486ca5e6dbc9f1
console.log(x);    // Output : Mayank