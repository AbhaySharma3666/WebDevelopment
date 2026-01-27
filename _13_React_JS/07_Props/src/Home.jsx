import React from 'react'

function Home({student}) {
  return (
    <>
        <h2>Student Details</h2>
        <h4>Name : {student.name}</h4>
        <h4>Age : {student.age}</h4>
        <h4>Email : {student.email}</h4>
        <h4>Phone : {student.phone}</h4>
        <hr />

    </>
  )
}

export default Home