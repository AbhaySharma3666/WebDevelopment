/*
Dot Notation
   Dot notation in JavaScript is a way to access properties or methods of an object using a dot (.) followed by the property or method name.
*/
const person = {
  name: 'Mayank',
  age: 21,
  message: function() {
    console.log('Hellooooooo!');
  }
};

let myName = person.name;
console.log(myName);
let myAge = person.age;
console.log(myAge);
let message = person.message();

/* Output :
Mayank
21
Hellooooooo!
*/




/*
Bracket Notation
   Bracket notation in JavaScript is another way to access properties or methods of an object using square brackets ([]) with the property or method name enclosed within them.
*/


const person1 = {
  name: 'Ravi',
  age: 31,
  message: function() {
    console.log('Hiiiii');
  }
};

let myName1 = person["name"];
console.log(myName);
let myAge1 = person["age"];
console.log(myAge);
let message1 = person["message"]();

/* Output :
Mayank
21
Hellooooooo!
*/