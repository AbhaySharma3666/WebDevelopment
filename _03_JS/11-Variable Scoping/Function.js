// Function Scope with var:
function test1() {
   var x = 10;
   console.log(x); // 10

   if (true) {
      var x = 20; // same variable
      console.log(x); // 20
   }

   console.log(x); // 20
}
test1();
console.log(x); // ReferenceError: x is not defined

// Function Scope with let:
function test2() {
   let y = 30;
   console.log(y); // 30

   if (true) {
      let y = 40; // different variable due to block scope
      console.log(y); // 40
   }

   console.log(y); // 30
}
test2();
console.log(y); // ReferenceError: y is not defined

// Function Scope with const:
function test3() {
   const z = 50;
   console.log(z); // 50

   if (true) {
      const z = 60; // different constant due to block scope
      console.log(z); // 60
   }

   console.log(z); // 50
   // z = 70; // This would cause an error as const cannot be reassigned
}
test3();
console.log(z); // ReferenceError: z is not defined