const mongoose = require('mongoose');

const empSchema = new mongoose.Schema(
    {
        first_name: {
            type: String,
            required: true
        },
        last_name: {
            type: String,
            required: true
        },
        email: {
            type: String,
            required: true,
            unique: true
        },
        address: {
            type: String,
            required: true
        },
        gender: {
            type: String,
            required: true,
            enum: ['Male', 'Female', 'Other']
        }
    }
);

const Employee = mongoose.model('Employee', empSchema);
module.exports = Employee; 
