import { useState } from "react"


function App() {
  const [text,settext] = useState("")

  const handleInput = ({ target: { value } }) => {
    settext(value);
  }

  const handleClear = ()=>{
    settext("");
  }

  return (
    <>
    <h2>Two Way Binding</h2>
      <input type="text" value={text} onChange={handleInput} placeholder="Enter Your Name" />
      <br />
      <h3>{text}</h3>
      <button onClick={handleClear}>clear</button>

    </>
  )
}

export default App
