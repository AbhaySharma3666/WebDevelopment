import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <div>
        <a href="https://vite.dev" target="_blank">
          <img src={viteLogo} className="logo" alt="Vite logo" />
        </a>
        <a href="https://react.dev" target="_blank">
          <img src={reactLogo} className="logo react" alt="React logo" />
        </a>
      </div>
      <h1>Vite + React</h1>
      <div className="card">
        <button onClick={() => setCount((count) => count + 1)}>
          count is {count}
        </button>
        <p>
          Edit <code>src/App.jsx</code> and save to test HMR
        </p>
      </div>
      <p className="read-the-docs">
        Click on the Vite and React logos to learn more
      </p>

      <div className="app">
      <h1>How to Create a React Project</h1>
      <div className="steps">
        <div className="step">
          <h2>Step 1: Install Node.js</h2>
          <p>Download and install Node.js from <a href="https://nodejs.org" target="_blank">nodejs.org</a></p>
        </div>
        
        <div className="step">
          <h2>Step 2: Create React App</h2>
          <p>Run one of these commands:</p>
          <code>npx create-react-app my-app</code>
          <p>or with Vite (faster):</p>
          <code>npm create vite@latest my-app -- --template react</code>
        </div>
        
        <div className="step">
          <h2>Step 3: Navigate to Project</h2>
          <code>cd my-app</code>
        </div>
        
        <div className="step">
          <h2>Step 4: Install Dependencies</h2>
          <code>npm install</code>
        </div>
        
        <div className="step">
          <h2>Step 5: Start Development Server</h2>
          <code>npm run dev</code>
          <p>(or <code>npm start</code> for create-react-app)</p>
        </div>
        
        <div className="step">
          <h2>Step 6: Open in Browser</h2>
          <p>Visit <code>http://localhost:3000</code> or <code>http://localhost:5173</code></p>
        </div>
      </div>
    </div>
    </>

    
  )
}

export default App
