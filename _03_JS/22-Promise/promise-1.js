<<<<<<< HEAD
let taskDone =true;
let pr = new Promise(function(resolve,reject){
    if(taskDone){
        resolve("Task completed successfully");
    }else{
        reject("Task failed");
    }
})
console.log(pr);


// function 
function prom1(task){
    return new Promise(function(resolve,reject){
        console.log("Work is in Progress!!!");
        setTimeout(() => {
            if(task){
                resolve("Task completed successfully");
            }else{
                reject("Task failed");
            }
        }, 3000);
    });
}
let onSuccess = (result)=>{
    console.log(result);
}
let onFailure = (error)=>{
    console.log(error);
}
console.log(prom1(false));
prom1(true).then(onSuccess).catch(onFailure);
=======
let taskDone =true;
let pr = new Promise(function(resolve,reject){
    if(taskDone){
        resolve("Task completed successfully");
    }else{
        reject("Task failed");
    }
})
console.log(pr);


// function 
function prom1(task){
    return new Promise(function(resolve,reject){
        console.log("Work is in Progress!!!");
        setTimeout(() => {
            if(task){
                resolve("Task completed successfully");
            }else{
                reject("Task failed");
            }
        }, 3000);
    });
}
let onSuccess = (result)=>{
    console.log(result);
}
let onFailure = (error)=>{
    console.log(error);
}
console.log(prom1(false));
prom1(true).then(onSuccess).catch(onFailure);
>>>>>>> 35387576b9a0b809457b398be6486ca5e6dbc9f1
