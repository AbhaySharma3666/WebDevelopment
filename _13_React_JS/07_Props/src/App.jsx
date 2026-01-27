import './App.css'
import Home from './Home';
import ShowCity from './ShowCity';

function App() {
  let sudentDetails1 = {
    name : "Rahul",
    age : 23,
    email : "rahul@gmail.com",
    phone : 6548864564
  };
  let sudentDetails2 = {
    name : "Sonu",
    age : 25,
    email : "sonu@gmail.com",
    phone : 699864564
  };
  let sudentDetails3 = {
    name : "Titains",
    age : 24,
    email : "tt@gmail.com",
    phone : 65458864564
  };
  let sudentDetails4 = {
    name : "Amit",
    age : 20,
    email : "amit@gmail.com",
    phone : 5148464564
  };
  let cities = ["Delhi","Mumbai","Pune","Banglore","Hydrabad","Goa"];

  return (
    <>
      <Home student = {sudentDetails1} />
      <Home student = {sudentDetails2} />
      <Home student = {sudentDetails3} />
      <Home student = {sudentDetails4} />
      
      <ShowCity city={cities} />
      <ShowCity city={cities[2]} />
      <ShowCity city={cities[4]} />
      <ShowCity city={cities[1]} />
    </>
  )
}

export default App
