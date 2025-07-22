// sum of all elements in array

let arr = [1,2,3,4,5];

function sumarray(arr){
   let sum = 0;
   // for(let index = 0; index < arr.length; index++){
   //    sum += arr[index];
   // }

   arr.forEach(value => {
      sum += value;
   });
   return sum;
}

let result = sumarray(arr);
console.log('Sum of all elements in array:',result);

var arr2 = [1,2,3,4,5,6,7,8,9,10];
console.log('Array :',arr2);
// using forEach print one by one
arr2.forEach(function(value,index){
   console.log('Index : ',index,' Value : ',value);
});


