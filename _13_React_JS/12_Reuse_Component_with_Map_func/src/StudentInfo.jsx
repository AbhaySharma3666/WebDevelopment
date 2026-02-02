import React from 'react';

function StudentInfo({ data }) {
    return (
        <div className="student-info">
            <h3>Roll: {data.roll}</h3>
            <h3>Name: {data.name}</h3>
            <h3>Email: {data.email}</h3>
            <h3>City: {data.city}</h3>
            
        </div>
    );
}

export default StudentInfo;