const mongoose = require('mongoose')

const contactSchema = new mongoose.Schema(
    {
        first_name: { 
            type : String,
            required: true
        },
        last_name : {
            type : String,
            required: true
        },
        email : {
            type : String,
            required: true,
            unique: true
        },
        phone : {
            type : Number,
            required: true,
            unique: true
        },
        address :{
            type : String,
            required: true
        }
    }
)

const contact = mongoose.model('Contact', contactSchema)
module.exports = contact