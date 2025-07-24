// Block Scope with var:
{
    var x = 10;
    console.log(x); // 10
}
console.log(x); // 10 (var ignores block scope)

// Block Scope with let:
{
    let y = 20;
    console.log(y); // 20
}
// console.log(y); // ReferenceError: y is not defined

// Block Scope with const:
{
    const z = 30;
    console.log(z); // 30
    // z = 40; // TypeError: Assignment to constant variable
}
// console.log(z); // ReferenceError: z is not defined

// Nested Block Scope:
{
    let a = 50;
    {
        let a = 60; // Different variable due to block scope
        console.log(a); // 60
    }
    console.log(a); // 50
}
