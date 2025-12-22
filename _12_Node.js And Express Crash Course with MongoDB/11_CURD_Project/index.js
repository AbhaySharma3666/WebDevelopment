const express = require('express')
const app = express()
const connectDB = require('./config/database')
const userRouter = require('./Routes/user.router')

// port configuration
const PORT = process.env.PORT || 3030
app.listen(PORT, (req, res)=>{
    console.log('====================================');
    console.log(`Server is running on http://localhost:${PORT}`);
    console.log('====================================');
}) 

// database connection
connectDB();

// middlewares
app.set('view engine', 'ejs')
app.use(express.urlencoded({extended: true}))

// routes
app.use(userRouter)
