let firstName = "John";
let lastName = "Doe";

function fullName(firstName,lastName){
    return `${firstName} ${lastName}`;
}

let userdetails = `My name is ${fullName(firstName,lastName)}`;
console.log(userdetails);
