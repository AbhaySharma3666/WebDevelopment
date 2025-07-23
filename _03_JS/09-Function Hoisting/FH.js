/*
    Function Hoisting:

    Function hoisting is a concept in JavaScript that allows you to call a function before it has been declared. This is possible because the JavaScript interpreter moves all function declarations to the top of their scope before executing the code.

    In JavaScript, function declarations are moved to the top of their scope before the code is executed. This means that you can call a function before it has been declared.

    Example:

*/
console.log(add(5, 10));

    function add(a, b) {
        return a + b;
    }


    /*
        var keyword hoisting:

        var keyword is also hoisted but it is not initialized with a value. It is initialized with a value of undefined.

        Example:
    */
   console.log(x);
   var x = 10;

   // Output: undefined

   /*
    let and const keyword hoisting:

    let and const keyword are also hoisted but they are not initialized with a value. They are initialized with a value of undefined.

    Example:
    
   */
   console.log(z);
   let z = 10;

   // Output: undefined

