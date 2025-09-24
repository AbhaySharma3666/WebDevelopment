
let p1 = new Promise((resolve, reject)=>{
    setTimeout(()=>{
        console.log('1st Promise has been resolved');
        resolve(10);
    }, 2000);
    
});

let p2 = new Promise((resolve, reject)=>{
    setTimeout(()=>{
        console.log('2nd Promise has been resolved');
        resolve(20);
    }, 2000);
    
});

let p3 = new Promise((resolve, reject)=>{
    setTimeout(()=>{
        console.log('3rd Promise has been resolved');
        resolve(30);
    }, 2000);
    
});

// all the conditions must be true otherwise it will go to catch block or reject
Promise.all([p1, p2, p3]).then((results)=>{
    console.log('All Promises have been resolved');
    console.log('Results:', results);
}).catch((error)=>{
    console.log('Error from one of the Promises:', error);
});