<<<<<<< HEAD


function changeText(event) {
    console.log(event); // event object
    console.log(event.target); // target element that triggered the event
    let fpara = document.getElementById("fpara");
    fpara.textContent = "Hello Abhay"
}

let fpara = document.getElementById("fpara");

fpara.addEventListener("click", changeText);  

// fpara.removeEventListener("click", changeText); // to remove the event listener
=======


function changeText(event) {
    console.log(event); // event object
    console.log(event.target); // target element that triggered the event
    let fpara = document.getElementById("fpara");
    fpara.textContent = "Hello Abhay"
}

let fpara = document.getElementById("fpara");

fpara.addEventListener("click", changeText);  

// fpara.removeEventListener("click", changeText); // to remove the event listener
>>>>>>> 35387576b9a0b809457b398be6486ca5e6dbc9f1
