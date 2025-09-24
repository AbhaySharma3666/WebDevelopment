<<<<<<< HEAD
// Built in methods
let brr= new Array();
brr.push('Push','10','20','30','40','50');
console.log('Array after push :',brr);

console.log();

console.log('Length of array :',brr.length);

console.log('Element at index 2 :',brr.at(2));

console.log('Index of Push :',brr.indexOf('Push'));

console.log('last Index of Push :',brr.lastIndexOf('Push'));

brr.pop('love');
console.log('Array after pop 50 :',brr);

console.log();

brr.shift();// remove first element
console.log('Array after shift left:',brr);

console.log();

brr.unshift('unshift');// add element at first
console.log('Array after unshift right for add element:',brr);

console.log();

let slicedArr = brr.slice(3,4); // slice returns a new array, doesn't modify original
console.log('Array before slice :',brr); // print original array
console.log('Array after slice :', slicedArr); // print sliced array

console.log();

brr.splice(2,3,'Abhay');// remove element at index 2
console.log('Array after splice :',brr);

// brr.splice(start , end , 'add element); end tell remove index
brr.splice(2,3,'splice');
=======
// Built in methods
let brr= new Array();
brr.push('Push','10','20','30','40','50');
console.log('Array after push :',brr);

console.log();

console.log('Length of array :',brr.length);

console.log('Element at index 2 :',brr.at(2));

console.log('Index of Push :',brr.indexOf('Push'));

console.log('last Index of Push :',brr.lastIndexOf('Push'));

brr.pop('love');
console.log('Array after pop 50 :',brr);

console.log();

brr.shift();// remove first element
console.log('Array after shift left:',brr);

console.log();

brr.unshift('unshift');// add element at first
console.log('Array after unshift right for add element:',brr);

console.log();

let slicedArr = brr.slice(3,4); // slice returns a new array, doesn't modify original
console.log('Array before slice :',brr); // print original array
console.log('Array after slice :', slicedArr); // print sliced array

console.log();

brr.splice(2,3,'Abhay');// remove element at index 2
console.log('Array after splice :',brr);

// brr.splice(start , end , 'add element); end tell remove index
brr.splice(2,3,'splice');
>>>>>>> 35387576b9a0b809457b398be6486ca5e6dbc9f1
console.log('Array after splice :',brr);