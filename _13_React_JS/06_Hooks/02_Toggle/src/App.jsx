
import { useState } from 'react'
import './App.css'
import Home from './Home';

function App() {
  const [display, setDisplay] = useState(false);


  return (
    <>
      <h1>Toggle in React Js</h1>
      <button onClick={()=> setDisplay(!display)}>Show/Hide</button>    
      {display ? <Home /> : <h2>Nothing to show</h2>}
    </>
  )
}

export default App
