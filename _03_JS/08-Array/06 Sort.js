let arr1 = [8,7,6,9,45,53,2,1,23,89];

arr1.sort();
console.log('Array after sort :',arr1);


let arr = [4,54,232,7,45,7,46,73456,453,45,5,4,534,6,76,6];

arr.sort((a, b) => b - a);
console.log('Array after sort :',arr);


console.log('Array reverse :',arr.reverse());

console.log(arr1.indexOf(89)); // return index of element

let arr2 = [1,2,3,4,5,6,7,8,9,10];
let findElement = arr2.find((element) => {
   return element > 5;
}); 
console.log('Find element greater than 5:', findElement); // returns first element that satisfies condition

console.log();

let findIndex = arr2.findIndex((element) => {
   return element > 5;
});
console.log('Find index of element greater than 5:', findIndex); // returns index of first element that satisfies condition



