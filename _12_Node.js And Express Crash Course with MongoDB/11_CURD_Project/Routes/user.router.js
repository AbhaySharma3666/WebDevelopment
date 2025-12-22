const express = require('express')
const router = express.Router()
const userController = require('../controller/user.controller')

router.get('/', userController.getAllContacts)

router.get('/show-contact/:id', userController.getSingleContact)

router.get('/add-contact', userController.displayAddContactForm)

router.post('/add-contact', userController.addNewContact)

router.get('/update-contact/:id', userController.displayUpdateContactForm)

router.post('/update-contact/:id', userController.updateContact)

router.get('/delete-contact/:id', userController.deleteContact)

module.exports = router