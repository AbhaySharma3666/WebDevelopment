/*
Spread operator
   The quickest way to create a clone of an object is to use spread operator.

   The spread operator can be used for shallow object cloning. Here's how we can clone an object using the spread operator: 
   
      */

   
const person = {
  name: 'Mayank',
  age: 21
};

const clonedPerson = {...person};

console.log(clonedPerson); 

// Output : { name: 'Mayank', age: 21 }