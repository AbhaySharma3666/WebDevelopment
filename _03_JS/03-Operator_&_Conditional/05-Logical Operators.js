// Declare variables
let x = 10;
let y = 5;

// Logical AND (&&)
// Returns true only if both conditions are true
console.log("(x > 5) && (y < 10): " + ((x > 5) && (y < 10))); // true

// Logical OR (||)
// Returns true if at least one condition is true
console.log("(x < 5) || (y < 10): " + ((x < 5) || (y < 10))); // true

// Logical NOT (!)
// Reverses the Boolean value
console.log("!(x > 5): " + (!(x > 5))); // false

// Combining multiple logical operators
console.log("((x > 5) && (y < 10)) || (x < y): " + (((x > 5) && (y < 10)) || (x < y))); // true
