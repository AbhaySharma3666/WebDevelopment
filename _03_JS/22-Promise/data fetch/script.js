function promise(){
    return new Promise((resolve, reject) => {
        console.log('Fetching Json Data From Server !!!');
        setTimeout(() =>{
            let URL="https://jsonplaceholder.typicode.com/users";
            $.get(URL,function(data){
            console.log(data);
        }).fail((error)=>{
            console.log('Failed to fetch Json Data!');
            
        })
        }, 3000);
    })
}

promise().then((data) => {
    console.log('Data fetched successfully:', data);
}).catch((error) => {
    console.log('Error fetching data:', error);
});