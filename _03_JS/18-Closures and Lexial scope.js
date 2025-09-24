// Lexial scope:- 
// 1. Lexical scope is the scope that is defined by the location of the variable declaration within the source code.

// Closure:-
// 1. A closure is a function that has access to the parent scope, even after the parent function has closed.

// 2. A closure is created when a function is defined inside another function, and the inner function has access to the outer function's variables.
// 3. Closures are used to create private variables and functions, and to maintain state in asynchronous programming.


function outerfunction() {
    let name = 'John Doe';
    function innerFunction(){
        console.log(name);
    }
    return innerFunction;
}
let inner = outerfunction();
inner();
