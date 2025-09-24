
let string1 =  "Namaste";
console.log(typeof(string1));      // string

let string2 = 'Namaste';
console.log(typeof(string2));      // string

let string3 = `Namaste`;
console.log(typeof(string3));      // string

console.log();
console.log(`Concatenating strings`);

let string4 = "Mobile";

let string5 = "Charger";

let finalSentence = string4 + " and " + string5 + "!";

console.log(finalSentence);

//Output : Mobile and Charger!



console.log();
console.log(`Concatenation using string interpolation using template literals(\`\`):`);
string1 = "Mobile";
string2 = "Charger";
finalSentence = `${string1} and ${string2}!`;
console.log(finalSentence);

//Output : Mobile and Charger!



console.log();
console.log(`Length method`);
let message = "Hello coders";
let messageLength = message.length;
console.log(messageLength);        // 12



console.log();
console.log(`Uppercase and Lowercase methods `);

message = "Hello coders";

let upperCaseMessage = message.toUpperCase();
console.log(upperCaseMessage);    // HELLO CODERS

let lowerCaseMessage = message.toLowerCase();
console.log(lowerCaseMessage);    // hello coders



console.log();
console.log(`Substring method `);

message = "Hello coders";

let substr1 = message.substring(2, 8);
console.log(substr1);          // llo co

let substr2 = message.substring(3);
console.log(substr2);         // lo coders



console.log();
console.log(`Split method `);

message = "Once upon a time";
let splittedArray = message.split(" ");
console.log(splittedArray);

/*
Output
[ 'Once', 'upon', 'a', 'time' ]
*/



console.log();
console.log(`Join method`)
let array = ["India", "is", "the", "best"];

let message1 = array.join(" ");
console.log(message1);

//Output : India is the best

let message2 = array.join();
console.log(message2);

//Output : India,is,the,best

