/*
     Adding Property: 
     You can add new properties to an object using dot notation or bracket notation.
*/
const person = {
  firstName : "Mayank",
  age : 21
};

person.lastName = "Pandey";
person.isRunning = false;

console.log(person);


/* Output :
{ firstName: 'Mayank', age: 21, lastName: 'Pandey', isRunning: false }
*/


/*
     Deleting the properties: 
     You can delete the properties of an object using the delete keyword.
*/

delete person.isRunning;

console.log(person);
// Output :
// { firstName: 'Mayank', age: 21, lastName: 'Pandey' }



