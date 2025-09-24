<<<<<<< HEAD

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
=======

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
>>>>>>> 35387576b9a0b809457b398be6486ca5e6dbc9f1
*/