// let i = 0;                           initialization
// while (i < 5) {
//   console.log(`Iteration: ${i}`);     logic
//   i++;                               updation  or  increment/decrement
// }


let i = 0;
while (i < 5) {
  console.log(`Iteration: ${i}`);
  i++;
}


console.log();
console.log("Infinite  Loop");

let count = 0;
while (true) {
  console.log(`Count: ${count}`);
  if (count === 10) break; // Exit condition
  count++;
}

console.log();
console.log(`Breaking Out of the Loop with break`);
let y = 1;
while (y <= 10) {
  console.log(`Number: ${y}`);
  if (y === 5) break; // Exit loop at 5
  y++;
}