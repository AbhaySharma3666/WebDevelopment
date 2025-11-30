const express = require('express');
const app = express();

const port = 3000;
app.listen(port, (req,res)=> {
    console.log(`server started at port ${port}`);
    console.log(`Connect Sucessfully at http://localhost:${port}`);
    // output : will be shown in terminal
})

// Main page with navigation links
app.get('/', (req, res) => {
    const html = `
        <h1>Main Page</h1>
        <nav>
            <ul>
                <li><a href="/about">About</a></li>
                <li><a href="/contact">Contact</a></li>
                <li><a href="/services">Services</a></li>
                <li><a href="/blog">Blog</a></li>
                <li><a href="/userlogin/login">Login</a></li>
                <li><a href="/username/123/age/25">User Info</a></li>
                <li><a href="/username/search?name=express&age=5">Search</a></li>
            </ul>
        </nav>
        <p>Welcome to our website! Use the links above to navigate.</p>
    `;
    res.send(html);
})

// About page
app.get('/about', (req, res) => {
    res.send(`
        <h1>About Us</h1>
        <p>This is the about page.</p>
        <a href="/">Back to Home</a>
    `);
})

// Contact page
app.get('/contact', (req, res) => {
    res.send(`
        <h1>Contact Us</h1>
        <p>Get in touch with us!</p>
        <a href="/">Back to Home</a>
    `);
})

// Services page
app.get('/services', (req, res) => {
    res.send(`
        <h1>Our Services</h1>
        <p>Here are the services we offer.</p>
        <a href="/">Back to Home</a>
    `);
})

// Blog page
app.get('/blog', (req, res) => {
    res.send(`
        <h1>Blog</h1>
        <p>Read our latest blog posts.</p>
        <a href="/">Back to Home</a>
    `);
})

// login page
app.get('/login', (req, res) => {
    res.send(`
        <h1>Your in login page</h1>
        <p>Please enter your credentials to log in.</p>
        <a href="/">Back to Home</a>
    `);
})

// User Info page
app.get('/username/:userId/age/:userAge', (req, res) => {
    res.send(`
        <h1>User Info</h1>
        <p>User ID: ${req.params.userId}</p>
        <p>User Age: ${req.params.userAge}</p>
        <a href="/">Back to Home</a>
    `);
})

// using query parameters
app.get ('/search', (req, res) => {
    res.send(req.query);
});