import MyButton from "./MyButton";
import { Heading } from "./Heading";
import MyVariable from "./MyVariable";
import MyRandom from "./Random";

function App(){
  return <div>
    <h1>We are learning ReactJS</h1>
    <Heading />
    <Heading />
    <Heading />
    <Heading />
    <MyVariable />
    <MyRandom/>
    <MyButton/>
    <MyButton/>
    <MyButton/>
  </div>
}

export default App;