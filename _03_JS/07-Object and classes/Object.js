<<<<<<< HEAD
/*
    - object always stores key-value pairs in the curly braces
*/

let obj = {

    firstName : "Mayank",
    lastName : "Pandey",
    age : 21,
    hobbies : ["reading", "writing", "painting"],
    message : function(){
        console.log("Hi my name is " + this.firstName);
    }
};
console.log(obj);
obj.message();
console.log(typeof(obj));
console.log(obj.firstName);
console.log(obj.age);
=======
/*
    - object always stores key-value pairs in the curly braces
*/

let obj = {

    firstName : "Mayank",
    lastName : "Pandey",
    age : 21,
    hobbies : ["reading", "writing", "painting"],
    message : function(){
        console.log("Hi my name is " + this.firstName);
    }
};
console.log(obj);
obj.message();
console.log(typeof(obj));
console.log(obj.firstName);
console.log(obj.age);
>>>>>>> 35387576b9a0b809457b398be6486ca5e6dbc9f1
console.log(obj.hobbies[0]);