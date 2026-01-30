import React from 'react'

function Student() {
    const studentData = [
    {
        name: "John",
        email: "join@gmail.com",
        city: "New York",
        roll: 1
    },
    {
        name: "Aisha",
        email: "aisha.khan@example.com",
        city: "Mumbai",
        roll: 2
    },
    {
        name: "Carlos",
        email: "carlos.fernandez@example.com",
        city: "Madrid",
        roll: 3
    },
    {
        name: "Mei",
        email: "mei.chen@example.com",
        city: "Beijing",
        roll: 4
    },
    {
        name: "Liam",
        email: "liam.smith@example.com",
        city: "London",
        roll: 5
    },
    {
        name: "Fatima",
        email: "fatima.zahra@example.com",
        city: "Casablanca",
        roll: 6
    },
    {
        name: "Ivan",
        email: "ivan.petrov@example.com",
        city: "Moscow",
        roll: 7
    },
    {
        name: "Sophia",
        email: "sophia.martin@example.com",
        city: "Toronto",
        roll: 8
    },
    {
        name: "Tariq",
        email: "tariq.ali@example.com",
        city: "Dubai",
        roll: 9
    },
    {
        name: "Emily",
        email: "emily.jones@example.com",
        city: "Sydney",
        roll: 10
    },
    {
        name: "Raj",
        email: "raj.verma@example.com",
        city: "Delhi",
        roll: 11
    }
];
    return (
        <>
            <table border="3">
            <thead>
                <th>Roll</th>
                <th>Name</th>
                <th>Email</th>
                <th>City</th>
            </thead>
            <tbody>
                {studentData.map((student) => (
                    <tr>
                        <td>{student.roll}</td>
                        <td>{student.name}</td>
                        <td>{student.email}</td>
                        <td>{student.city}</td>
                    </tr>
                ))}
            </tbody>
            </table>
        </>
    )
}

export default Student