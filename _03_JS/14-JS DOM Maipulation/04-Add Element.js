// Add Element
// 1. Create a new element by using document.createElement()
            let newElement = document.createElement("span");
            newElement.textContent = "Add new Element";
            let bodytags = document.body;

// 2. .appendChild() method to add the new element to the DOM at the end of the parent element
            bodytags.appendChild(newElement);

// 3. .insert AdjacentElement() method to add the new element to the DOM at a specific position
//     (A) beforebegin: Before the target element
            let newElement2 = document.createElement("span");
            newElement2.textContent = "Add new Element 2 beforebegin";
            mydiv.insertAdjacentElement("beforebegin", newElement2);

//     (B) afterbegin: Inside the target element, before its first child
            let newElement3 = document.createElement("span");
            newElement3.textContent = "Add new Element3 afterbegin";
            mydiv.insertAdjacentElement("afterbegin", newElement3);

//     (C) beforeend: Inside the target element, after its last child
            let newElement4 = document.createElement("span");
            newElement4.textContent = "Add new Element 4 beforeend";
            mydiv.insertAdjacentElement("beforeend", newElement4);

//     (D) afterend: After the target element
            let newElement5 = document.createElement("span");
            newElement5.textContent = "Add new Element 5 afterend";
            mydiv.insertAdjacentElement("afterend", newElement5);


