import React, { useState } from 'react';

function Dynamic_CSS() {
  const [grid,setgrid] = useState("false");  
  const [textcolor, settextcolor] = useState("black");
  const [Divstyle, setDivStyle] = useState({
    width: "150px",
    height: "50px",
    padding: "20px",
    display: "flex",
    alignItems: "center",
    justifyContent: "center",
    backgroundColor: "red",
    fontSize : "20px",
    border: "1px solid black",
    transition: "all 0.5s ease-in-out"
  });


  const updateTheme = (bgcolor, textcolor) => {
    setDivStyle({ ...Divstyle, backgroundColor: bgcolor });
    settextcolor(textcolor);
  };

  return (
    <>
      <h3>We are learning dynamic styling.</h3>
      <button onClick={() => updateTheme("black", "red")}>Dark Theme</button>
      <button onClick={() => updateTheme("grey", "black")}>Default Theme</button>
      <button onClick={()=>setgrid(!grid)}>Toggle Display</button>
      <div style={{ display: grid ? "block" : "flex", flexWrap: "wrap", gap: "10px"}}>
        <div style={{ ...Divstyle, color: textcolor}}>
        <h3>Dynamic Style</h3>
      </div>
      <div style={{ ...Divstyle, color: textcolor}}>
        <h3>Dynamic Style</h3>
      </div>
      <div style={{ ...Divstyle, color: textcolor}}>
        <h3>Dynamic Style</h3>
      </div>
      <div style={{ ...Divstyle, color: textcolor}}>
        <h3>Dynamic Style</h3>
      </div>
      <div style={{ ...Divstyle, color: textcolor}}>
        <h3>Dynamic Style</h3>
      </div>
      <div style={{ ...Divstyle, color: textcolor}}>
        <h3>Dynamic Style</h3>
      </div>
      <div style={{ ...Divstyle, color: textcolor}}>
        <h3>Dynamic Style</h3>
      </div>
      <div style={{ ...Divstyle, color: textcolor}}>
        <h3>Dynamic Style</h3>
      </div>
      <div style={{ ...Divstyle, color: textcolor}}>
        <h3>Dynamic Style</h3>
      </div>
      <div style={{ ...Divstyle, color: textcolor}}>
        <h3>Dynamic Style</h3>
      </div>
      <div style={{ ...Divstyle, color: textcolor}}>
        <h3>Dynamic Style</h3>
      </div>
      <div style={{ ...Divstyle, color: textcolor}}>
        <h3>Dynamic Style</h3>
      </div>
      <div style={{ ...Divstyle, color: textcolor}}>
        <h3>Dynamic Style</h3>
      </div>
      </div>
    </>
  );
}

export default Dynamic_CSS;