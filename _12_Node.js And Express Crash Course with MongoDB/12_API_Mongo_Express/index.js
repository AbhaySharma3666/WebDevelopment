const express = require('express');
const app = express();
const mongoose = require('mongoose');
const empRoutes = require('./routes/employee.route')

// Connecting to MongoDB
mongoose.connect('mongodb://127.0.0.1:27017/ApiDb1')
.then(() => {

})
.catch((err) => {
    console.error('Failed to connect to MongoDB', err);
});

// Middleware to parse JSON bodies
app.use(express.urlencoded({ extended: true }));
app.use(express.json());

// Employee routes
app.use('/api/emp', empRoutes);

// Connecting to server
const PORT = process.env.PORT || 3030;
app.listen(PORT, (req, res) => {
    console.log(`Server is running on http://localhost:${PORT}`);
});
