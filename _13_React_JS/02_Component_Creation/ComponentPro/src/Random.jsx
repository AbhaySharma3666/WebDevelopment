function MyRandom(){
    let number = Math.random()*1000;
    return <h2 style={{color: "green"}}>Random Number is : {Math.round(number)}</h2>
}
export default MyRandom;