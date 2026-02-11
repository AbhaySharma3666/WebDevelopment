import React, { useState } from 'react';

function AddNewData() {
  const [student, setStudent] = useState({ id: '', name: '', email: '' });

  //  Handle form input changes in one function
  const handleChange = (e) => {
    const { name, value } = e.target;
    setStudent((prev) => ({ ...prev, [name]: value }));
  };

  //  Add new student with validation
  const addStudent = async (e) => {
    e.preventDefault(); // prevent form reload

    // Basic validation
    if (!student.id || !student.name || !student.email) {
      alert('Please fill in all fields before submitting.');
      return;
    }

    try {
      const response = await fetch('http://localhost:3000/students', {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json',
        },
        body: JSON.stringify(student),
      });

      if (response.ok) {
        alert(' Data added successfully!');
        // Clear input fields after success
        setStudent({ id: '', name: '', email: '' });
      } else {
        alert(' Failed to add data. Please try again.');
      }
    } catch (error) {
      console.error('Error adding student:', error);
      alert('Error adding data. Check your server connection.');
    }
  };

  return (
    <>
      <h2 className="text-center text-primary mt-4">Add New Student</h2>
      <form className="mx-auto w-50 mt-4" onSubmit={addStudent}>
        <input
          type="text"
          name="id"
          value={student.id}
          className="form-control mb-3"
          placeholder="Enter Student ID"
          style={{ width: '300px' }}
          onChange={handleChange}
        />

        <input
          type="text"
          name="name"
          value={student.name}
          className="form-control mb-3"
          placeholder="Enter Name"
          style={{ width: '300px' }}
          onChange={handleChange}
        />

        <input
          type="email"
          name="email"
          value={student.email}
          className="form-control mb-3"
          placeholder="Enter Email"
          style={{ width: '300px' }}
          onChange={handleChange}
        />

        <button type="submit" className="btn btn-primary mt-2">
          Add New Data
        </button>
      </form>
    </>
  );
}

export default AddNewData;
