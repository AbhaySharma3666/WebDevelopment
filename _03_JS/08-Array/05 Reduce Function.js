// Reduce function

// array.reduce(callback(accumulator, currentValue), initialValue)
/*
callback: A function that executes on each element of the array, taking following arguments:
     accumulator: The accumulated value resulting from the reduction.
   currentValue: The current element being processed in the array.

initialValue (optional): An initial value for the accumulator. If not provided, the first element of the array will be used as the initial value, and iteration starts from the second element.*/
let arr1 = [1,2,3,4,5];
console.log('Array before reduce :',arr1);
let ansarray = arr1.reduce((acc,curr) => {
   return acc+curr;
},0);
console.log('Array after reduce (sum):',ansarray);

console.log();

let arr2 = [1,2,3,4,5];
console.log('Array before reduce :',arr2);
let ansarray2 = arr2.reduce((acc,curr) => {
   return acc*curr;
},1/*acc initial value*/);
console.log('Array after reduce (multiply):',ansarray2);

