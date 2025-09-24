<<<<<<< HEAD
// if Statement
let age = 18;
if (age >= 18) {
    console.log("You are an adult!");
}


// if-else Statement 
age = 15;
if (age >= 18) {
    console.log("You are an adult!");
} else {
    console.log("You are a minor!");
}


// if-else-if-else Statement
let score = 75;
if (score > 90) {
    console.log("Grade: A");
} else if (score > 80) {
    console.log("Grade: B");
} else {
    console.log("Grade: C");
}


// Switch Statement 

let day = "Monday";
let day1 = "Saturday";
switch (day1) {
    case "Monday":
        console.log("Start of the work week!");
        break;
    case "Friday":
        console.log("Almost weekend!");
        break;
    case "Saturday":
        console.log("sat");
    case "Sunday":
        console.log("It's the weekend!");
        break;
    default:
        console.log("Midweek vibes.");
}

// Another way of using Switch Statement

let alphabet = 'a';
switch (alphabet) {
    case 'a':
    case 'e':
    case 'i':
    case 'o':
    case 'u':
        console.log("It's a vowel.");
        break;
    default:
        console.log("It's a consonant.");
}


let number1 = 10;
let number2 = 20;

let sum = number1 + number2;

=======
// if Statement
let age = 18;
if (age >= 18) {
    console.log("You are an adult!");
}


// if-else Statement 
age = 15;
if (age >= 18) {
    console.log("You are an adult!");
} else {
    console.log("You are a minor!");
}


// if-else-if-else Statement
let score = 75;
if (score > 90) {
    console.log("Grade: A");
} else if (score > 80) {
    console.log("Grade: B");
} else {
    console.log("Grade: C");
}


// Switch Statement 

let day = "Monday";
let day1 = "Saturday";
switch (day1) {
    case "Monday":
        console.log("Start of the work week!");
        break;
    case "Friday":
        console.log("Almost weekend!");
        break;
    case "Saturday":
        console.log("sat");
    case "Sunday":
        console.log("It's the weekend!");
        break;
    default:
        console.log("Midweek vibes.");
}

// Another way of using Switch Statement

let alphabet = 'a';
switch (alphabet) {
    case 'a':
    case 'e':
    case 'i':
    case 'o':
    case 'u':
        console.log("It's a vowel.");
        break;
    default:
        console.log("It's a consonant.");
}


let number1 = 10;
let number2 = 20;

let sum = number1 + number2;

>>>>>>> 35387576b9a0b809457b398be6486ca5e6dbc9f1
console.log(`The sum of ${number1} + ${number2} is equal to ${sum}`);