function prom1(x,y){
    return new Promise((resolve, reject) => {
        console.log('We are calculating , Plz wait!!');
        var z=x/y;
        setTimeout(() => {
            if(x,y){
                resolve(`Division is : ${z}`);
            }
            else{
                reject("Division by zero error");
            }
        }, 3000);
        
    });
}

prom1(10,0).then((result) => {
    console.log(result);
}).catch((error) => {
    console.log(error);
});