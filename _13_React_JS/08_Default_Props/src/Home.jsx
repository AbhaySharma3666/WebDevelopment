import React from 'react'

function Home({name = "New User"}) {
    
  return (
    <>
        <h2 style={{
            color: "red",
            backgroundColor: "yellow",
            padding: "10px",
            borderRadius: "10px"
        }}>Hello... {name}</h2>
    </>
  )
}

export default Home