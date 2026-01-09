import './App.css'
import { useState } from "react";

function App() {
  let [counter , setConter] = useState(1);

  const addValue = ()=> {
    setConter(counter + 1);
  }
  const subtractValue = ()=> {
    setConter(counter - 1);
  }

  return (
    <>
      <h2>Value is : {counter}</h2>    
      <button onClick={addValue} >Counter++</button>
      <button onClick={subtractValue}>Counter--</button>

    </>
  )
}

export default App
