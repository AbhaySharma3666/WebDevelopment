import { useState } from "react";
import { useEffect } from "react";

function App() {

  const [userData, setuseData] = useState([])
  const [dataType, setDataType] = useState('')

  useEffect(() => {
    getAllData();
  }, [])

  async function getAllData() {
    const url = "http://localhost:3000/users" //users, posts
    let data = await fetch(url);
    data = await data.json();

    setuseData(data);
    setDataType(url.includes('users') ? 'users' : 'posts');
  }
  console.log(userData);
  return (
    <>
      <h1>API</h1>
      {
        dataType === 'users' ? (
          userData.map((user) => (
            <div key={user.id} style={{ border: '1px solid #ccc', marginBottom: '10px', padding: '10px' }}>
              <ul>
                <li><strong>ID:</strong> {user.id}</li>
                <li><strong>Name:</strong> {user.name}</li>
                <li><strong>Email:</strong> {user.email}</li>
                <li><strong>Address:</strong> {user.address}</li>
                <li><strong>Phone:</strong> {user.phone}</li>
                <li><strong>Age:</strong> {user.age}</li>
                <li><strong>Occupation:</strong> {user.occupation}</li>
              </ul>
            </div>
          ))
        ) : (
          userData.map((post) => (
            <div key={post.id} style={{ border: '1px solid #ccc', marginBottom: '10px', padding: '10px' }}>
              <h3>{post.title}</h3>
              <p>{post.body}</p>
              <p><strong>User ID:</strong> {post.userId}</p>
              <p><strong>Likes:</strong> {post.likes} | <strong>Comments:</strong> {post.comments}</p>
              <p><strong>Created:</strong> {post.created_at}</p>
            </div>
          ))
        )
      }
    </>
  )
}

export default App
