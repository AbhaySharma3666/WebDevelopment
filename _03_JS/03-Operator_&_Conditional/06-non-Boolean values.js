    
/*    
    Truthy and Falsy Values
Non-Boolean values can be evaluated in a Boolean context, and they fall into two categories:
1.  Falsy Values: Values that are considered  when converted to Boolean.
        Examples: false, 0, ""(empty string), null, undefined, Nan 
        
2.  Truthy Values: All other values are considered .
        Examples: anythink which is not falsy.

*/        

// Logical OR (||) returns the first truthy value or the last falsy value
console.log(0 || "Hello");

// Logical AND (&&) returns the first falsy value or the last truthy value
console.log(true && "42");

// Combining operators
let result4 = null || false || "Truthy value"; // Output: "Truthy value"
console.log(result4);