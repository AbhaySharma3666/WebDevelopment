
/*
  # useRef in React — Key Points
   1. Stores a Mutable Value
    - Holds a value that persists across renders without causing re-renders.
    - Syntax: const myRef = useRef(initialValue);

   2. Accesses DOM Elements
    - Directly references a DOM node (like an input or div).
    - Example: <input ref={inputRef} /> → inputRef.current.focus();

   3. Remembers Previous Values
    - Can track previous state or props without triggering updates.
    - Example: prevCount.current = count;

   4. Doesn’t Trigger Re-render
    - Updating .current doesn’t re-render the component.
    - Ideal for timers, intervals, or cached values.

   5. Useful for Timers and Intervals
    - Store setTimeout or setInterval IDs to clear them later.
    - Example: timerRef.current = setTimeout(() => {}, 1000);

   6. Great for Form Validation
    - Focus on invalid fields, scroll to error sections, etc.

   7. Works Well with useEffect
    - Often paired with useEffect for lifecycle-like behavior.

   8. Alternative to State for Non-UI Data
    - Use when you need to store data but don’t want re-renders.

*/

import React, { useRef, useState } from "react";

function App() {
  const h1Ref = useRef(null);
  const inputRef = useRef(null);
  const boxRef = useRef(null);

  const [boxActive, setBoxActive] = useState(false); // toggle state for box

  // Change heading color
  const changeColor = () => {
    if (h1Ref.current) {
      h1Ref.current.style.transition = "color 0.5s ease";
      h1Ref.current.style.color = "green";
    }
  };

  // Change heading text
  const changeText = () => {
    if (h1Ref.current) {
      h1Ref.current.innerText = "Hi everyone... 👋";
    }
  };

  // Focus input
  const focusInput = () => {
    inputRef.current?.focus();
  };

  // Scroll to the box
  const scrollToBox = () => {
    boxRef.current?.scrollIntoView({ behavior: "smooth" });
  };

  // Toggle animate & style the box
  const changeBoxStyle = () => {
    if (boxRef.current) {
      if (!boxActive) {
        boxRef.current.style.backgroundColor = "lightblue";
        boxRef.current.style.transform = "scale(1.1)";
        boxRef.current.style.transition = "all 0.5s ease-in-out";
      } else {
        boxRef.current.style.backgroundColor = "salmon";
        boxRef.current.style.transform = "scale(1)";
      }
      setBoxActive(!boxActive);
    }
  };

  // Reset everything
  const resetAll = () => {
    if (h1Ref.current) {
      h1Ref.current.style.color = "black";
      h1Ref.current.innerText = "We are learning useRef Hook in ReactJs";
    }
    if (inputRef.current) {
      inputRef.current.value = "";
    }
    if (boxRef.current) {
      boxRef.current.style.backgroundColor = "salmon";
      boxRef.current.style.transform = "scale(1)";
    }
    setBoxActive(false);
  };

  return (
    <div style={{ padding: "20px", fontFamily: "Poppins, sans-serif" }}>
      {/* Heading */}
      <h1 ref={h1Ref}>We are learning useRef Hook in ReactJs</h1>
      <div style={{ display: "flex", gap: "10px", marginBottom: "20px" }}>
        <button onClick={changeColor}>Change Color</button>
        <button onClick={changeText}>Change Text</button>
      </div>

      {/* Input */}
      <input ref={inputRef} type="text" placeholder="Type something..." />
      <button style={{ marginLeft: "10px" }} onClick={focusInput}>
        Focus Input
      </button>

      <hr style={{ margin: "20px 0" }} />

      {/* Scroll + Box */}
      <div style={{ display: "flex", gap: "10px", marginBottom: "20px" }}>
        <button onClick={scrollToBox}>Scroll to Box</button>
        <button onClick={changeBoxStyle}>
          {boxActive ? "Reset Box Style" : "Style the Box"}
        </button>
        <button onClick={resetAll} style={{ backgroundColor: "#ef4444", color: "white" }}>
          Reset All
        </button>
      </div>

      <div
        ref={boxRef}
        style={{
          marginTop: "100vh",
          width: "200px",
          height: "100px",
          backgroundColor: "salmon",
          display: "flex",
          alignItems: "center",
          justifyContent: "center",
          borderRadius: "1rem",
          transition: "all 0.5s ease-in-out",
        }}
      >
        🎯 Target Box
      </div>
    </div>
  );
}


export default App
