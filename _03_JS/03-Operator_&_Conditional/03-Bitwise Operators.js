// Declare two numbers
let a = 5;  // Binary: 0101
let b = 3;  // Binary: 0011

// Bitwise AND (&)
// Performs AND on each pair of bits
console.log("a & b: " + (a & b)); // Output: 1 (Binary: 0001)

// Bitwise OR (|)
// Performs OR on each pair of bits
console.log("a | b: " + (a | b)); // Output: 7 (Binary: 0111)

// Bitwise XOR (^)
// Performs XOR on each pair of bits
console.log("a ^ b: " + (a ^ b)); // Output: 6 (Binary: 0110)

// Bitwise NOT (~)
// Inverts each bit (1 becomes 0, 0 becomes 1)
console.log("~a: " + (~a)); // Output: -6 (Two's complement)

// Left shift (<<)
// Shifts the bits to the left by the specified number of positions
console.log("a << 1: " + (a << 1)); // Output: 10 (Binary: 1010)

// Right shift (>>)
// Shifts the bits to the right, preserving the sign
console.log("a >> 1: " + (a >> 1)); // Output: 2 (Binary: 0010)

// Unsigned right shift (>>>)
// Shifts the bits to the right, filling with zeros
console.log("a >>> 1: " + (a >>> 1)); // Output: 2 (Binary: 0010)node       