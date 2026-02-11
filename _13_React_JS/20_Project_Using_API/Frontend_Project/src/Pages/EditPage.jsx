import { useNavigate, useParams } from 'react-router-dom';
import React, { useEffect, useState } from 'react';

function EditPage() {
  const [student, setStudent] = useState({ id: '', name: '', email: '' });
  const { id: paramId } = useParams();
  const navigate = useNavigate();
  const url = `http://localhost:3000/students/${paramId}`;

  useEffect(() => {
    getDataById();
  }, [paramId]);

  //  Fetch data by ID and show in textboxes
  const getDataById = async () => {
    try {
      const response = await fetch(url);
      if (!response.ok) throw new Error('Failed to fetch data');
      const data = await response.json();
      setStudent({ id: data.id, name: data.name, email: data.email });
    } catch (error) {
      console.error('Error fetching student:', error);
      alert('Error fetching data. Please check your server.');
    }
  };

  //  Update data and navigate to DisplayPage after success
  const updateData = async (e) => {
    e.preventDefault();

    try {
      const response = await fetch(url, {
        method: 'PUT',
        headers: {
          'Content-Type': 'application/json',
        },
        body: JSON.stringify(student),
      });

      if (response.ok) {
        alert(' Data updated successfully!');
        navigate('/'); //  redirects to DisplayPage.jsx
      } else {
        alert(' Failed to update data.');
      }
    } catch (error) {
      console.error('Error updating student:', error);
      alert('Error updating data. Please check your connection.');
    }
  };

  //  Handle input field changes
  const handleChange = (e) => {
    const { name, value } = e.target;
    setStudent((prev) => ({ ...prev, [name]: value }));
  };

  return (
    <>
      <h2 className="text-center text-primary mt-4">Edit Student Details</h2>
      <form className="mx-auto w-50 mt-4" onSubmit={updateData}>
        <input
          type="text"
          name="id"
          value={student.id}
          className="form-control mb-3"
          placeholder="Student ID"
          onChange={handleChange}
          style={{ width: '300px' }}
          readOnly // prevents editing ID
        />

        <input
          type="text"
          name="name"
          value={student.name}
          className="form-control mb-3"
          placeholder="Enter Name"
          onChange={handleChange}
          style={{ width: '300px' }}
        />

        <input
          type="email"
          name="email"
          value={student.email}
          className="form-control mb-3"
          placeholder="Enter Email"
          onChange={handleChange}
          style={{ width: '300px' }}
        />

        <button type="submit" className="btn btn-primary mt-2">
          Update Data
        </button>
      </form>
    </>
  );
}

export default EditPage;
