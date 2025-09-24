<<<<<<< HEAD
// Filter function
let arr2 = [1,2,3,4,5];
console.log('Array before filter :',arr2);
let evenarray = arr2.filter((number) => {
   return number%2==0;
});
console.log('Array after filter :',evenarray);

let arr3 = [1,3,34,'Abhay','adiaw'];
console.log('Array before filter :',arr3);
let filteredArray = arr3.filter((element) => {
   return typeof(element) === 'string';
});
console.log('Array after filter :',filteredArray);


let age = [25,14,89,4,6,78,45,23,12];
console.log('Array before filter :',age);
let greaterThan18 = age.filter(function(value) {
   return value > 18;
});
console.log('Array after filter age>18 :',greaterThan18);

console.log();

let marks = [12,23,34,45,67,44,32,4]
console.log('print through foreach loop :',marks);
console.log();
marks.forEach(function(value){
   console.log(value);
=======
// Filter function
let arr2 = [1,2,3,4,5];
console.log('Array before filter :',arr2);
let evenarray = arr2.filter((number) => {
   return number%2==0;
});
console.log('Array after filter :',evenarray);

let arr3 = [1,3,34,'Abhay','adiaw'];
console.log('Array before filter :',arr3);
let filteredArray = arr3.filter((element) => {
   return typeof(element) === 'string';
});
console.log('Array after filter :',filteredArray);


let age = [25,14,89,4,6,78,45,23,12];
console.log('Array before filter :',age);
let greaterThan18 = age.filter(function(value) {
   return value > 18;
});
console.log('Array after filter age>18 :',greaterThan18);

console.log();

let marks = [12,23,34,45,67,44,32,4]
console.log('print through foreach loop :',marks);
console.log();
marks.forEach(function(value){
   console.log(value);
>>>>>>> 35387576b9a0b809457b398be6486ca5e6dbc9f1
})