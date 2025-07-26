// Modifying / Update existing HTML DOM elements
// 1. innerHTML :- used to set or get the HTML content of an element.

           //Selecting the element with id "myPara"
        let getdata = document.getElementById("mypara")
           //Now retrieving innerHTML of the selected element
        getdata.innerHTML; // Output: "This is a paragraph."

        let setdata = document.getElementById("mypara")
           //Now setting innerHTML of the selected element
        setdata.innerHTML = "hello world!"; // Output: "hello world!"


// 2. innerText :- used to set or get the text content of an element, excluding HTML tags.
//                 innerText prints text as it appears on screen.
        let getdata1 = document.getElementById("mypara")
           //Now retrieving innerText of the selected element
        getdata1.innerText; // Output: "This is a paragraph."

        let setdata1 = document.getElementById("mypara")
           //Now setting innerText of the selected element
        setdata1.innerText = "hello world!"; // Output: "hello world!"


// 3. outerHTML :- used to set or get the HTML content of an element, including the element itself.
//                outerHTML prints the entire HTML element, including its tags.
        let getdata2 = document.getElementById("mypara")
           //Now retrieving outerHTML of the selected element
        getdata2.outerHTML; // Output: "<p id="mypara">This is a paragraph.</p>"

        let setdata2 = document.getElementById("mypara")
           //Now setting outerHTML of the selected element
        setdata2.outerHTML = "<h1>hello world!</h1>"; // Output: "<h1>hello world!</h1>"



// 4. textContent :- used to set or get the text content of an element, including HTML tags.
//                 textContent prints all text content, including child elements.
        let getdata3 = document.getElementById("mypara")
           //Now retrieving textContent of the selected element
        getdata3.textContent; // Output: "This is a paragraph."

        let setdata3 = document.getElementById("mypara")
           //Now setting textContent of the selected element
        setdata3.textContent = "hello world!"; // Output: "hello world!"

// Note: 
//      innerHTML and outerHTML can be used to add HTMLelements, 
//      while innerText and textContent are used to add text content only.

//      innerHTML vs. outerHTML:  innerHTML deals with the content inside the element, while outerHTML includes the element itself.

//      innerText vs. textContent: innerText retrieves only visible text, excluding child elements, while textContent retrieves all text content, including child elements.