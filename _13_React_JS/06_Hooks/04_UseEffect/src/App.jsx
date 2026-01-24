

import { use, useEffect, useState } from 'react';
import './App.css'

function App() {
  const [data, setData] = useState(0);
  const [counter, setCounter] = useState(0);

  useEffect(()=>{
    hello1();
  },[data])
  function hello1(){
    console.log("We are learning useEffect() ..!");
  }

  useEffect(()=>{
    hello2();
  },[counter])
  function hello2(){
    console.log("Hello2 function.....");
    
  }


 
  
  return (
    <>
      <h2>useEffect......</h2>
      <button onClick={()=>{setData(data+1)}}>Click Data {data} </button>
      <button onClick={()=>{setCounter(counter+1)}}>Click Counter {counter} </button>
    </>
  )
}

export default App
