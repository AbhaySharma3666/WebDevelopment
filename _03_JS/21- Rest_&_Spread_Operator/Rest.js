<<<<<<< HEAD
// Rest operator
// Create a function that takes any number of arguments and returns their sum.

// Problem statement:parameter is 2 then we pass multiple parameters. But function take only first 2 parameters.

function sum(...args){
    let z=0;
    for(let i=0;i<args.length;i++){
        z+=args[i];
    }
    console.log('sum is ',z);
}

sum(1,2);
sum(1,2,4,5);
console.log();


// To solve that we can use the rest operator
  // - rest parameter must be last in parameter list
  // - rest parameter is used as an array
  // - denoted by ...
function sumRest(fname,...arguments){
    let sum = 0;
    console.log('fname is ',fname);
    for(let i in arguments){
        sum += arguments[i];
    }
    console.log('sum is ',sum);
}
sumRest('sharma',2,3);
sumRest('Verma',4);
=======
// Rest operator
// Create a function that takes any number of arguments and returns their sum.

// Problem statement:parameter is 2 then we pass multiple parameters. But function take only first 2 parameters.

function sum(...args){
    let z=0;
    for(let i=0;i<args.length;i++){
        z+=args[i];
    }
    console.log('sum is ',z);
}

sum(1,2);
sum(1,2,4,5);
console.log();


// To solve that we can use the rest operator
  // - rest parameter must be last in parameter list
  // - rest parameter is used as an array
  // - denoted by ...
function sumRest(fname,...arguments){
    let sum = 0;
    console.log('fname is ',fname);
    for(let i in arguments){
        sum += arguments[i];
    }
    console.log('sum is ',sum);
}
sumRest('sharma',2,3);
sumRest('Verma',4);
>>>>>>> 35387576b9a0b809457b398be6486ca5e6dbc9f1
sumRest('Anonymous',2,3,4,5);