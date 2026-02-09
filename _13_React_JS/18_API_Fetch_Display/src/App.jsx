import { useState } from "react";
import { useEffect } from "react";


function App() {

  const [userData, setuseData] = useState([])

  useEffect(() => {
    getAllData();
  }, [])

  async function getAllData() {
    const url = "https://jsonplaceholder.typicode.com/users"
    let data = await fetch(url);
    data = await data.json();

    setuseData(data);

  }
  console.log(userData);


  return (
    <>
      <h1>API</h1>
      {
        userData.map((user) => {
          return (
            <div key={user.id}>
              <ul>
                <li><strong>{user.id}</strong></li>
                <li>{user.name}</li>
                <li>{user.email}</li>
                <li>{user.address.city}, {user.address.street}</li>
              </ul>
              <hr />
            </div>
          )
        })
      }

    </>
  )
}

export default App
