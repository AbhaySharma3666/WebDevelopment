const express = require('express');
const mongoose = require('mongoose');
const path = require('path');
const app = express();
const User = require('./models/User')

app.set('view engine', 'ejs');
app.use(express.static(path.join(__dirname, 'public')));
app.use(express.urlencoded({ extended: true }));

const PORT = 3000;

app.listen(PORT, () => {
  console.log(`Server is running on http://localhost:${PORT}`);
});

/////// Connect to MongoDB //////
  // mongoose.connect('mongodb://127.0.0.1:27017/database_name')
mongoose.connect('mongodb://127.0.0.1:27017/usermdb',{
  useNewUrlParser: true,
  useUnifiedTopology:true
}).then(() => {console.log('Connected to MongoDB successfully...');})
  .catch((err) => {console.log('Failed to connect to MongoDB:', err);})

//////      Routing part   ////// 
app.get('/', (req, res) => {
  res.render('register');
});

app.post('/register', async(req, res) => {
  try {
    const { name, email, phone, dob, gender, address , country, city, state, postalcode } = req.body;
    const user = new User({name, email, phone, dob, gender, address , country, city, state, postalcode})
    await user.save();
    res.send('User registered successfully');

    console.log(`Name: ${name}`);
    console.log(`Email: ${email}`);
    console.log(`Phone: ${phone}`);
    console.log(`Date of Birth: ${dob}`);
    console.log(`Gender: ${gender}`);
    console.log(`Address: ${address}`);
    console.log(`Country: ${country}`);
    console.log(`City: ${city}`);
    console.log(`State: ${state}`);
    console.log(`Postal Code: ${postalcode}`);
  }
  catch (error) {
    res.status(500).send('Error registering user: ' + error.message);
  }

    // If this is an AJAX/fetch request, respond with JSON so client can show popup then redirect
    if (req.xhr || req.headers['x-requested-with'] === 'XMLHttpRequest') {
      return res.json({ success: true, redirect: '/login?registered=1' });
    }

    // fallback: normal form submit -> redirect to login
    res.redirect('/login?registered=1');
    // Here, you can add code to save the data to a database if needed
});


app.get('/login', (req, res) => {
  // pass success flag from query string to the view
  const success = req.query.success === '1';
  res.render('login', { success });
});

app.post('/login', (req, res) => {
  const { email, password } = req.body;
  console.log(`Email : ${email}`);
  console.log(`Password : ${password}`);

  // After handling authentication, redirect back with success flag.
  // Replace with real auth logic; currently always redirects as "successful".
  res.redirect('/login?success=1');
});


// Note: Ensure you have a 'public' directory for static files like CSS
// and a 'views' directory containing 'register.ejs' for the form template.