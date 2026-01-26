import { styled } from 'styled-components';
import { useRef } from 'react';


function App() {
  const Container = styled.div`
    min-height: 100vh;
    background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
    padding: 20px;
    font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
  `;

  const FormContainer = styled.form`
    max-width: 600px;
    margin: 0 auto;
    padding: 40px;
    background: rgba(255, 255, 255, 0.95);
    border-radius: 20px;
    box-shadow: 0 20px 40px rgba(0,0,0,0.1);
    backdrop-filter: blur(10px);
    border: 1px solid rgba(255, 255, 255, 0.2);
  `;

  const Title = styled.h1`
    text-align: center;
    color: #333;
    margin-bottom: 30px;
    font-size: 2.5rem;
    font-weight: 300;
    background: linear-gradient(135deg, #667eea, #764ba2);
    -webkit-background-clip: text;
    -webkit-text-fill-color: transparent;
    background-clip: text;
  `;

  const InputGroup = styled.div`
    position: relative;
    margin: 20px 0;
  `;

  const Input = styled.input`
    width: 100%;
    padding: 15px 20px;
    border: 2px solid #e1e5e9;
    border-radius: 12px;
    font-size: 16px;
    background: #f8f9fa;
    transition: all 0.3s ease;
    box-sizing: border-box;
    &:focus {
      outline: none;
      border-color: #667eea;
      background: white;
      transform: translateY(-2px);
      box-shadow: 0 8px 25px rgba(102, 126, 234, 0.15);
    }
    &::placeholder {
      color: #adb5bd;
    }
  `;

  const Select = styled.select`
    width: 100%;
    padding: 15px 20px;
    border: 2px solid #e1e5e9;
    border-radius: 12px;
    font-size: 16px;
    background: #f8f9fa;
    transition: all 0.3s ease;
    box-sizing: border-box;
    cursor: pointer;
    &:focus {
      outline: none;
      border-color: #667eea;
      background: white;
      transform: translateY(-2px);
      box-shadow: 0 8px 25px rgba(102, 126, 234, 0.15);
    }
  `;

  const TextArea = styled.textarea`
    width: 100%;
    padding: 15px 20px;
    border: 2px solid #e1e5e9;
    border-radius: 12px;
    font-size: 16px;
    background: #f8f9fa;
    resize: vertical;
    min-height: 120px;
    transition: all 0.3s ease;
    box-sizing: border-box;
    font-family: inherit;
    &:focus {
      outline: none;
      border-color: #667eea;
      background: white;
      transform: translateY(-2px);
      box-shadow: 0 8px 25px rgba(102, 126, 234, 0.15);
    }
    &::placeholder {
      color: #adb5bd;
    }
  `;

  const Label = styled.label`
    display: block;
    margin: 25px 0 10px 0;
    font-weight: 600;
    color: #495057;
    font-size: 16px;
    letter-spacing: 0.5px;
  `;

  const RadioGroup = styled.div`
    display: flex;
    gap: 20px;
    margin: 15px 0;
    label {
      display: flex;
      align-items: center;
      cursor: pointer;
      font-weight: 500;
      color: #495057;
      margin: 0;
    }
    input[type="radio"] {
      margin-right: 8px;
      transform: scale(1.2);
      accent-color: #667eea;
    }
  `;

  const CheckboxGroup = styled.div`
    display: grid;
    grid-template-columns: repeat(auto-fit, minmax(150px, 1fr));
    gap: 15px;
    margin: 15px 0;
    label {
      display: flex;
      align-items: center;
      cursor: pointer;
      font-weight: 500;
      color: #495057;
      margin: 0;
      padding: 10px;
      border-radius: 8px;
      transition: background-color 0.2s ease;
      &:hover {
        background-color: #f8f9fa;
      }
    }
    input[type="checkbox"] {
      margin-right: 8px;
      transform: scale(1.2);
      accent-color: #667eea;
    }
  `;

  const MyButton = styled.button`
    background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
    color: white;
    padding: 18px 40px;
    margin: 30px 0 0 0;
    cursor: pointer;
    border: none;
    border-radius: 12px;
    font-size: 18px;
    font-weight: 600;
    width: 100%;
    transition: all 0.3s ease;
    text-transform: uppercase;
    letter-spacing: 1px;
    &:hover {
      transform: translateY(-3px);
      box-shadow: 0 15px 35px rgba(102, 126, 234, 0.3);
    }
    &:active {
      transform: translateY(-1px);
    }
  `;
  
  const userRef = useRef(null);
  const passRef = useRef(null);
  const emailRef = useRef(null);
  const ageRef = useRef(null);
  const countryRef = useRef(null);
  const experienceRef = useRef(null);
  const bioRef = useRef(null);
  const maleRef = useRef(null);
  const femaleRef = useRef(null);
  const javaRef = useRef(null);
  const reactRef = useRef(null);
  const pythonRef = useRef(null);
  const dbRef = useRef(null);

  const FormHandler = (e) => {
    e.preventDefault();
    const user = userRef.current.value;
    const pass = passRef.current.value;
    const email = emailRef.current.value;
    const age = ageRef.current.value;
    const country = countryRef.current.value;
    const experience = experienceRef.current.value;
    const bio = bioRef.current.value;
    let gender = maleRef.current.checked ? maleRef.current.value : femaleRef.current.value;

    let selectedSkills = [];
    if (javaRef.current.checked) {
      selectedSkills.push(javaRef.current.name);
    }
    if (reactRef.current.checked) {
      selectedSkills.push(reactRef.current.name);
    }
    if (pythonRef.current.checked) {
      selectedSkills.push(pythonRef.current.name);
    }
    if (dbRef.current.checked) {
      selectedSkills.push(dbRef.current.name);
    }

    alert(`
      Name: ${user}\n
      Email: ${email}\n
      Age: ${age}\n
      Country: ${country}\n
      Experience: ${experience}\n
      Bio: ${bio}\n
      Gender: ${gender}\n
      Skills: ${selectedSkills}
      `
    );
  }

  return (
    <Container>
      <FormContainer onSubmit={FormHandler}>
        <Title>User Registration</Title>
        
        <InputGroup>
          <Input type="text" ref={userRef} placeholder='👤 Enter your full name' />
        </InputGroup>
        
        <InputGroup>
          <Input type="email" ref={emailRef} placeholder='📧 Enter your email address' />
        </InputGroup>
        
        <InputGroup>
          <Input type="password" ref={passRef} placeholder='🔒 Create a password'/>
        </InputGroup>
        
        <InputGroup>
          <Input type="number" ref={ageRef} placeholder='🎂 Enter your age' min="18" max="100" />
        </InputGroup>
        
        <Label>🌍 Country:</Label>
        <InputGroup>
          <Select ref={countryRef}>
            <option value="">Select your country</option>
            <option value="USA">🇺🇸 United States</option>
            <option value="Canada">🇨🇦 Canada</option>
            <option value="UK">🇬🇧 United Kingdom</option>
            <option value="India">🇮🇳 India</option>
            <option value="Australia">🇦🇺 Australia</option>
          </Select>
        </InputGroup>
        
        <Label>💼 Experience Level:</Label>
        <InputGroup>
          <Select ref={experienceRef}>
            <option value="">Select your experience level</option>
            <option value="Beginner">🌱 Beginner</option>
            <option value="Intermediate">🚀 Intermediate</option>
            <option value="Advanced">⭐ Advanced</option>
            <option value="Expert">🏆 Expert</option>
          </Select>
        </InputGroup>
        
        <Label>👥 Gender:</Label>
        <RadioGroup>
          <label>
            <input type="radio" ref={maleRef} value="Male" name="gender"/>
            Male
          </label>
          <label>
            <input type="radio" ref={femaleRef} value="Female" name="gender"/>
            Female
          </label>
        </RadioGroup>
        
        <Label>💻 Technical Skills:</Label>
        <CheckboxGroup>
          <label>
            <input type="checkbox" name="Java" ref={javaRef}/>
            ☕ Java
          </label>
          <label>
            <input type="checkbox" name="React" ref={reactRef}/>
            ⚛️ React
          </label>
          <label>
            <input type="checkbox" name="Python" ref={pythonRef}/>
            🐍 Python
          </label>
          <label>
            <input type="checkbox" name="Database" ref={dbRef}/>
            🗄️ Database
          </label>
        </CheckboxGroup>
        
        <Label>📝 Tell us about yourself:</Label>
        <InputGroup>
          <TextArea ref={bioRef} placeholder='Share your story, interests, and goals...' />
        </InputGroup>
        
        <MyButton type='submit'>Create Account</MyButton>
      </FormContainer>
    </Container>
  )
}

export default App
