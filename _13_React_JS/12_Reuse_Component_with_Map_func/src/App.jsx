import './App.css';
import DisplayEmail from './DisplayEmail';
import StudentInfo from './StudentInfo';

function App() {
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
    <h2>List Of Student Info</h2>
      {studentData.map((student) => (
        <StudentInfo key={student.roll} data={student} />
      ))}
      
       <h2>Student All Email </h2>
      {studentData.map((student) => (
        <DisplayEmail data={student} />
      ))}
    </>
  );
}

export default App;