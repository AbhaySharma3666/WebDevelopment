import { Link } from "react-router";

function User() {

    const userList = [
        {id:1, Name:"Abhay"},
        {id:2, Name:"Ravi"},
        {id:3, Name:"Ashok"},
        {id:4, Name:"Amit"},
    ];
  return (
    <>  
        <div >
            <h2>List of Users :</h2>
            <ul style={{marginLeft:40}}>
                {userList.map((user) => (
                    <li key={user.id}>
                        <Link to={`/users/${user.id}`}>{user.Name}</Link>
                    </li>
                ))}
            </ul>
        </div>
    
    </>
  )
}

export default User