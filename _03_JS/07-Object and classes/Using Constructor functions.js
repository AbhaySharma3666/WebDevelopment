
function CreatePerson(){
    
    this.firstName = "Mayank",
    this.lastName = "Pandey",
    this.age = 21,
    this.hobbies = ["sleeping", "writing", "playing"]

}

let person = new CreatePerson();

console.log(person);
/* Output :
{
  firstName: 'Mayank',
  lastName: 'Pandey',
  age: 21,
  hobbies: [ 'sleeping', 'writing', 'playing' ]
}
*/