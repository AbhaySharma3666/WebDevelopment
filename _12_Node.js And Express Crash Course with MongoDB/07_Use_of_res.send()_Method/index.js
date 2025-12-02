const express = require('express');
const app = express();

const PORT = 3000;

app.listen(PORT, (req,res)=> {
    console.log(`server started at port ${PORT}`);
    console.log(`Connect Sucessfully at http://localhost:${PORT}`);
    // output : will be shown in terminal
})

app.get('/', (req, res) => {
    const html = `
        <h1>Main Page</h1>
        <nav>
            <ul>
                <li><a href="/normalText">Text</a></li>
                <li><a href="/array">Array Insert</a></li>
                <li><a href="/object">Object (Key-Value Pairs)</a></li>
                <li><a href="/variable_insertion">Variable Insertion</a></li>
            </ul>
        </nav>
        <p>Welcome to our website! Use the links above to navigate.</p>
    `;
    res.send(html);
})


app.get('/normalText', (req, res) => {
    res.send("<h3>Hello World</h3><p>Welcome to our website!</p>");
})

app.get('/array', (req, res) => {
    res.send(
        ["Goa","Delhi","Mumbai","Chennai","Kolkata","Banglore","Hydrabad"]
    );
})

app.get('/object', (req, res) => {
    res.send(
        {name: "John", age: 30, city: "New York"}
    );
})

app.get('/variable_insertion', (req, res) => {
    const user = [
        {
            name: "John",
            age: 30,
            city: "New York",
            address : {
                street: "5th Avenue",
                zip: "10001"
            }
        },
        {
            name: "Alice",
            age: 25,
            city: "California",
            address : {
                street: "Sunset Boulevard",
                zip: "90001",
                latitude: "34.0522 N",
                longitude: "118.2437 W"
            }
        }
    ]
    res.send(user);
})

// Note: To use res.render(), you need to set up a view engine like EJS, Pug, etc.
// This example does not include that setup, as it focuses on res.send() method.