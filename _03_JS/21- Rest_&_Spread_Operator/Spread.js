/*
  - The spread operator (...) allows an iterable (like an array or string) or object to be expanded in places where zero or more elements or key-value pairs are expected.

  // Use of spread operator
   - Coping Array(Shallow Copy)
   - Merging Array
   - Passing Elements as Arguments
   - Merging Objects
   - Converting String to Array
*/  

const arr1 = [1, 2, 3];
const arr2 = [...arr1]; // Shallow copy
console.log('Shallow Copy:',arr2); // Output: [1, 2, 3]

console.log('------------------------------------');

const arr3 = [4, 5, 6];
const arr4 = [6,7,8,54,75,88,23];
const mergedArray = [...arr3, ...arr4];
console.log('Merged Array:',mergedArray);

console.log('------------------------------------');

function sum(x,y,z){
    let s = x+y+z;
    console.log(`Sum: ${s}`);
}
const arr5 = [43,54,2,5,6,7,2,32];
sum(...arr5);

console.log('------------------------------------');

const userName = {fname:'John'};
const userEmail={email:'john@example.com'};
const mergedUser = {...userName, ...userEmail};
console.log('Merged User Object:',mergedUser);

console.log('------------------------------------');

const yo = 'Hello!Sharma';
const arr6 = [...yo];
const arr7 = {...yo};
console.log('String to Array:', arr6);
console.log('String to Object:', arr7);

console.log('------------------------------------');

