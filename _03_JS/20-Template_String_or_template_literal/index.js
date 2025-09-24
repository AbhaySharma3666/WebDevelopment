let fname = "John";
let city = "New York";
// old way
console.log("Hello "+fname + " City : " + city);
console.log("Hello",fname , "City :" , city);

// new way
console.log(`Hello ${fname} City : ${city}`);

let print1 = `Hello 
"${fname}" 
You stay in :"${city}"
Hope you are doing well.`;

console.log(print1);

