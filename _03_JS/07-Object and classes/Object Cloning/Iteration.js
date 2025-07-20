/*
Object cloning in JavaScript is a task primarily used when we want to duplicate an object's structure and values without directly referencing the original object. This is useful when we need to modify or manipulate the duplicated object independently from the original.
*/



// Iteration: Iterating through the properties of the source object and copying them to a new object. This method allows you to create a shallow copy of an object by manually copying each property.


const person = {
  firstName : "Mayank",
  age : 21,
  lastName : "Pandey",
};

let newPerson = {};
console.log(newPerson);      // {}

for(let key in person){
    newPerson[key] = person[key];
}

console.log(newPerson);
// Output : { firstName: 'Mayank', age: 21, lastName: 'Pandey' }