import { useState } from 'react'


function App() {
  const [name, setName] = useState('')
  const [email, setEmail] = useState('')
  const [city, setCity] = useState('')
  const [Skills,setSkill] = useState([])
  const [gender, setGender] = useState('')
  const [state, setState] = useState('')

  const handleName = (e) => {
    setName(e.target.value);
  }
  const handleEmail = (e) => {
    setEmail(e.target.value);
  }
  const handleCity = (e) => {
    setCity(e.target.value);
  }
  const handleSkills = (event)=>{
    if (event.target.checked) {
      setSkill([...Skills, event.target.value]);
    }
    else {
      setSkill([...Skills.filter((item)=> item!=event.target.value)]);
    }
  }
  const handleGender = (e) => {
    setGender(e.target.value);
  }
  const handleState = (e) => {
    setState(e.target.value);
  }

  const ClearText = () => {
    setName('');
    setEmail('');
    setCity('');
    setGender('');
    setState('');
    setSkill([]);
  }
  return (
    <>
      <h1>Two Way Binding</h1>
      <form action="">
        <input type="text" value={name} onChange={handleName} placeholder='enter name' />
        <br />
        <input type="text" value={email} onChange={handleEmail} placeholder='enter email' />
        <br />
        <input type="text" value={city} onChange={handleCity} placeholder='enter city' />
        <br />
        State : 
        <select value={state} onChange={handleState}>
          <option value="">Select State</option>
          <option value="Maharashtra">Maharashtra</option>
          <option value="Karnataka">Karnataka</option>
          <option value="Tamil Nadu">Tamil Nadu</option>
          <option value="Gujarat">Gujarat</option>
          <option value="Rajasthan">Rajasthan</option>
          <option value="West Bengal">West Bengal</option>
          <option value="Uttar Pradesh">Uttar Pradesh</option>
        </select>
        <br />
        
        Gender : 
        <input type="radio" name="gender" id="male" value="Male" checked={gender === 'Male'} onChange={handleGender}/>
        <label htmlFor="male">Male</label>
        <input type="radio" name="gender" id="female" value="Female" checked={gender === 'Female'} onChange={handleGender}/>
        <label htmlFor="female">Female</label>
        <br />

        Skills : 
        <input type="checkbox" name="java" id="java" value="Java" onChange={handleSkills}/>
        <label htmlFor="java">Java</label>

        <input type="checkbox" name="php" id="php" value="PHP" onChange={handleSkills}/>
        <label htmlFor="php">PHP</label>

        <input type="checkbox" name="react" id="react" value="React" onChange={handleSkills}/>
        <label htmlFor="react">React</label>

        <input type="checkbox" name="python" id="python" value="Python" onChange={handleSkills}/>
        <label htmlFor="python">Python</label>

        <input type="checkbox" name="html/css" id="html/css" value="HTML/CSS" onChange={handleSkills}/>
        <label htmlFor="html/css">Html/Css</label>

        <input type="checkbox" name="js" id="js" value="JavaScript" onChange={handleSkills}/>
        <label htmlFor="js">JS</label>
        <br />

        <h4>{name}</h4>
        <h4>{email}</h4>
        <h4>{city}</h4>
        <h4>{state}</h4>
        <h4>{gender}</h4>
        <h4>{Skills.toString()}</h4>
        <br />

        <button onClick={ClearText}>Clear</button>
      </form>

    </>
  )
}

export default App
