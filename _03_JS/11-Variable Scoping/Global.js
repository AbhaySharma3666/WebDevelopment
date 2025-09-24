// Global Scope : 

var age = 15;

console.log(age) ;

if (true ){
   console.log(age);
} 

for (let i=0; i<5; i++){
    console.log(age);
}

function sayHello() {
    console.log("hii",age);
}

sayHello();

// Global Scope with let and const:

let score = 100;
const fname = "dfdf";

console.log(score);
console.log(fname);

if (true) {
    console.log(score);
    console.log(fname);
}

for (let i = 0; i < 3; i++) {
    console.log(score);
    console.log(fname);
}

function displayInfo() {
    console.log("Score:", score);
    console.log("Name:", fname);
}

displayInfo();
