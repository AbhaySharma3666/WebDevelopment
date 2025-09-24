<<<<<<< HEAD
// Event Loop
// The event loop is a mechanism that allows JavaScript to perform non-blocking I/O operations

// by using a single thread. It does this by offloading operations to the system kernel whenever possible.
// The event loop is a key part of the JavaScript runtime environment, enabling asynchronous programming.

// The event loop is responsible for executing the code, collecting and processing events, and executing queued sub-tasks.
// It continuously checks the call stack and the message queue, executing tasks from the queue when the stack is empty.

/*
How Does the Event Loop Work?
The 'Event Loop' consists of three parts :

-The Call Stack : Whenever a function is invoked, a corresponding frame (or execution context) is pushed onto the call stack. JavaScript executes functions in a synchronous, single-threaded manner, meaning only one operation can be processed at a time.

-The Browser : The Browser, or runtime environment (in the case of Node.js), provides the execution environment for JavaScript code. It includes the JavaScript engine (e.g., V8 in Chrome), which interprets and executes JavaScript code, as well as various APIs for interacting with the browser environment (e.g., DOM manipulation, timers).

-The Task Queue : Task Queue (also known as the Callback Queue or Message Queue) is where asynchronous tasks are queued for execution once the Call Stack is empty. Asynchronous tasks include events like DOM events, network requests, and timers (e.g., setTimeout(), setInterval()).*/

console.log('Start');

setTimeout(() => {
    console.log('Timeout 1');
}, 2000);
setTimeout(() => {
    console.log('Timeout 2');
}
, 4000);
console.log('End');
=======
// Event Loop
// The event loop is a mechanism that allows JavaScript to perform non-blocking I/O operations

// by using a single thread. It does this by offloading operations to the system kernel whenever possible.
// The event loop is a key part of the JavaScript runtime environment, enabling asynchronous programming.

// The event loop is responsible for executing the code, collecting and processing events, and executing queued sub-tasks.
// It continuously checks the call stack and the message queue, executing tasks from the queue when the stack is empty.

/*
How Does the Event Loop Work?
The 'Event Loop' consists of three parts :

-The Call Stack : Whenever a function is invoked, a corresponding frame (or execution context) is pushed onto the call stack. JavaScript executes functions in a synchronous, single-threaded manner, meaning only one operation can be processed at a time.

-The Browser : The Browser, or runtime environment (in the case of Node.js), provides the execution environment for JavaScript code. It includes the JavaScript engine (e.g., V8 in Chrome), which interprets and executes JavaScript code, as well as various APIs for interacting with the browser environment (e.g., DOM manipulation, timers).

-The Task Queue : Task Queue (also known as the Callback Queue or Message Queue) is where asynchronous tasks are queued for execution once the Call Stack is empty. Asynchronous tasks include events like DOM events, network requests, and timers (e.g., setTimeout(), setInterval()).*/

console.log('Start');

setTimeout(() => {
    console.log('Timeout 1');
}, 2000);
setTimeout(() => {
    console.log('Timeout 2');
}
, 4000);
console.log('End');
>>>>>>> 35387576b9a0b809457b398be6486ca5e6dbc9f1
// Output: 