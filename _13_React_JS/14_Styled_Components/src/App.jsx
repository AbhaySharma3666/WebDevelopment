import styled from "styled-components";

function App() {
  // mandatory variable name start from capital word during styled-component
  // two way for apply css component
  const Heading1 = styled.h1`
    font-size: 2rem;
    color: red;
    background-color: black;
    padding: 1rem;
    margin: 1rem;
    border-radius: 2rem;
    border: 5px solid blue;
    text-align: center;
    width: 70%;
  `;

  const Heading2 = styled.h1(
    {
      fontSize: '2rem',
      color: 'orange',
      backgroundColor: 'rgba(32, 34, 33, 1)',
      padding: '1rem',
      margin: '1rem',
      borderRadius: '2rem',
      border: '5px solid red',
      textAlign: 'center',
      width: '70%',

    }
  );

  const Btn1 = styled.button`
    font-size: 1.5rem;
    color: red;
    background-color: black;
    padding: 1rem;
    margin: 1rem;
    border-radius: 2rem;
    border: 5px solid grey;
    cursor: pointer;
  `;

  const Btn2 = styled.button(() => ({
    fontSize: '1rem',
    padding: '0.75rem 1.5rem',
    backgroundColor: 'teal',
    color: 'white',
    border: 'none',
    borderRadius: '0.5rem',
    cursor: 'pointer',
    transition: 'transform 0.5s ease-in-out, background-color 0.3s ease-in-out',
    textTransform: 'uppercase',
    fontWeight: 'bold',
    letterSpacing: '1px',

    '&:hover': {
      backgroundColor: 'darkcyan',
      transform: 'translateY(-10px) rotate(360deg)',
    },
  }));




  return (
    <>
      <Heading1>Style Components in ReactJs (use backtick syntax)</Heading1>
      <Heading1>Style Components in ReactJs!! (use backtick syntax)</Heading1>
      <Heading2>Style Components in ReactJs!!!!! (using object syntax)</Heading2>
      <Heading2>Style Components in ReactJs!!!!! (using object syntax)</Heading2>
      <Btn1>Click Me</Btn1>
      <Btn2>Click Me</Btn2>

    </>
  )
}

export default App
