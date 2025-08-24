
let callFun=function(data,msg){
    return function(resolve, reject){
        setTimeout(()=>{
            console.log(`The ${msg} promisehas been resolved`);
            resolve(data);
            
        }, 3000);
    }
}

let p1 = new Promise(callFun(10, '1st Promise'));
let p2 = new Promise(callFun(20, '2nd Promise'));
let p3 = new Promise(callFun(30, '3rd Promise'));

// all the conditions must be true otherwise it will go to catch block or reject
Promise.all([p1, p2, p3]).then((results)=>{
    console.log('All Promises have been resolved');
    console.log('Results:', results);
}).catch((error)=>{
    console.log('Error from one of the Promises:', error);
});