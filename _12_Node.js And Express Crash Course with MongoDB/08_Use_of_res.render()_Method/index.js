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
        <h3>Main Page</h3>
        <h2>Learning Express.js res.render() Method</h2>
        <p>This method is used to render a view template and send the rendered HTML as a response to the client. with the help of ejs (Embedded JavaScript) templating engine.</p>
        <p>Some Rule to follow: </p>
        <ol>
            <li>Install ejs using "<code>npm i ejs</code>"</li>
            <li>Set view engine using "<code>app.set('view engine', 'ejs')</code>"</li>
            <li>Create a folder named "<code>views</code>" in root directory</li>
            <li>Create a file named "<code>index.ejs</code>" inside views folder</li>
            <li>Use "<code>res.render('index', {data})</code>" to render the ejs file with data</li>
        </ol>
        <nav>
            <ul>
                <li><a href="/contact">Contact</a></li>
            </ul>
        </nav>
        <p>Welcome to our website! Use the links above to navigate.</p>
    `;
    res.send(html);
})

app.set('view engine', 'ejs')


app.get('/contact', (req, res) => {
    res.render('contact');
})

