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
                <li><a href="/redirect/old-page">Old Page (Redirect)</a></li>
                <li><a href="/redirect/url">Go to Google</a></li>
                <li><a href="/redirect/url">Go to Google</a></li>
            </ul>
        </nav>
        <p>Welcome to our website! Use the links above to navigate.</p>
    `;
    res.send(html);
})



// redirect parameters
app.get('/old-page', (req, res) => {
    res.redirect('/new-page');
});

app.get('/new-page', (req, res) => {
    res.send(`
        <h1>New Page</h1>
        <p>This is the new page you were redirected to.</p>
        <a href="/">Back to Home</a>
    `);
});

app.get('/url', (req, res) => {
    res.redirect('https://www.google.com');
})