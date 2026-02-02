import React from 'react';

function DisplayEmail({ data }) {
    return (
        <>
        <div className="student-info">
            <h3>Email: {data.email}</h3>
        </div>
        </>
    );
}

export default DisplayEmail;