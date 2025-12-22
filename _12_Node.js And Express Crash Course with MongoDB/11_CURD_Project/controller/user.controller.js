const Contact = require('../models/curdExpress.model')

const getAllContacts = async(req, res)=>{
    const contacts = await Contact.find()
    // res.json(contacts)
    res.render('home',{contacts})
}

const getSingleContact = async(req, res)=>{
    const contact = await Contact.findOne({_id:req.params.id})
    res.render('show-contact',{contact})
}

const displayAddContactForm = (req, res)=>{
    res.render('add-contact')
}

const addNewContact = async(req, res)=>{
    await Contact.create(req.body)
    res.redirect('/')
}

const displayUpdateContactForm = async(req, res)=>{
    const contact = await Contact.findById(req.params.id)
    res.render('update-contact',{contact})
}

const updateContact = async(req, res)=>{
    await Contact.findByIdAndUpdate(req.params.id, req.body)
    res.redirect('/')
}

const deleteContact = async(req, res)=>{
    await Contact.findByIdAndDelete(req.params.id)
    res.redirect('/')
}

module.exports = {
    getAllContacts, 
    getSingleContact, 
    displayAddContactForm, 
    addNewContact, 
    displayUpdateContactForm, 
    updateContact, 
    deleteContact
}