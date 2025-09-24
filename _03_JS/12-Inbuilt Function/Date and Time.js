// Date and Time

let date = new Date();
console.log(date);


let date1 = new Date("2025-03-31");
console.log(date1);

let date2 = new Date(2003, 10, 9, 5, 30);  //year: number, monthIndex: number, date?: number, hours?: number, minutes?: number, seconds?: number, ms?: number
console.log(date2);

console.log(date2.getFullYear());
date2.setFullYear(1995);
console.log(date2);


