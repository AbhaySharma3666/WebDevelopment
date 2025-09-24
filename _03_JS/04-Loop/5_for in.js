// syntax
// for (let key in object) {
//     // code to execute
// }


let obj = {
   name: 'John',
   age: 20,
   city: 'New York',
   country: 'USA',
   hobbies: ['reading', 'writing', 'coding']
};

for(let key in obj){
    console.log(key,':', obj[key]);
}
