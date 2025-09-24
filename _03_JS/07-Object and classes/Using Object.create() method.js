
let personPrototype = {
    name : "Mayank"
};

let person = Object.create(personPrototype);

console.log(person);     // {}

person.firstName = "Mayank";
person.lastName = "Pandey";
person.age = 21;
person.hobbies = ["reading", "writing", "sleeping"];

console.log(person);

/* Output :
{
  firstName: 'Mayank',
  lastName: 'Pandey',
  age: 21,
  hobbies: [ 'reading', 'writing', 'sleeping' ]
}
*/