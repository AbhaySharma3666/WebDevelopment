import React, { useState } from 'react'
import { Eye, EyeOff } from 'lucide-react'

function Password_Show_Hide() {
  const [showPass, setPass] = useState(false) // use boolean instead of string

  return (
    <div>
      <input 
        style={{padding: "10px", fontSize: "20px", borderRadius: "5px", border: "1px solid black"}} 
        type={showPass ? "text" : "password"} 
        placeholder='Enter password' 
      />
      <button 
        style={{marginLeft: "10px", padding: "10px", fontSize: "20px", borderRadius: "5px", border: "1px solid black"}}
        onClick={() => setPass(!showPass)}
      >
        {showPass ? <EyeOff /> : <Eye />}
      </button>
    </div>
  )
}

export default Password_Show_Hide