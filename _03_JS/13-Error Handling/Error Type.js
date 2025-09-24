// compile time error

    // syntax error
    // console.log("Hello World;

    // logical error
    // 2 + 2 = 5

// Runtime error

    // Reference error
    // console.log(x);



// try-catch block
try{
    console.log("try block starts here");
    console.log(x);
    console.log("try block end here")
}
catch(error){
    //define krte h, error k sath aap kya krna chahte h
    //retry logic
    //fallback mechanism
    //logging 
    console.log("I am inside the catch block");
    console.log("Your error is here",error);
}
finally{
    console.log("I will everytime, as I am finally block");
}

