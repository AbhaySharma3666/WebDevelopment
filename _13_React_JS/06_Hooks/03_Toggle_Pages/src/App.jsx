import { useState } from "react"
import User from "./User"
import Admin from "./Admin"
import Password_Show_Hide from "./Password_Show_Hide"
import "./App.css"

function App() {
  const [role, setRole] = useState("User")

  return (
    <div style={{ padding: "20px", fontFamily: "sans-serif" }}>
      {role === "Admin" ? <Admin /> : <User />}

      <button onClick={() => setRole(role === "Admin" ? "User" : "Admin")}>
        Switch to {role === "Admin" ? "User" : "Admin"}
      </button>

      <br /><br />
      <Password_Show_Hide />
    </div>
  )
}

export default App