// Default Parameter

function add(a, b = 10) {
    return a + b;
}

console.log(add(5)); // Output: 15
console.log(add(5, 20)); // Output: 25


function fname(
   name = "Abhay", 
   age = [20, 21, 22], 
   city = {cityName: "New York", country: "USA", pincode: 10001}
) {
    console.log(name, age, city);
}

fname(); // Output: Abhay [20, 21, 22] {cityName: "New York", country: "USA", pincode: 10001}
fname("John"); // Output: John [20, 21, 22] {cityName: "New York", country: "USA", pincode: 10001}
fname("John", 30, "India"); // Output: John 30 India

fname(null, null, null); // Output: null null null
fname(undefined, undefined, undefined); // Output: Abhay [20, 21, 22] {cityName: "New York", country: "USA", pincode: 10001}



// default parameter with arrow function

function getAge() {
    return 25;
}

function ill(fname, age = getAge()) {
   console.log(fname, age);
}
ill("Abhay"); // Output: Abhay 25
ill("Abhay", 30); // Output: Abhay 30


