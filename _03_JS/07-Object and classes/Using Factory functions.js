
function createPerson(){

    return {
        firstName : "Mayank",
        lastName : "Pandey",
        age : 21,
        hobbies : ["sleeping", "writing", "playing"]
    }
}

let person = createPerson();

console.log(person);
/* Output :
{
  firstName: 'Mayank',
  lastName: 'Pandey',
  age: 21,
  hobbies: [ 'sleeping', 'writing', 'playing' ]
}
*/