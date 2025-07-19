class Person {
   // Properties
   age = 20;   // public 
   #wt = 60;    // private (#)
   height = 5.5;
   gender = "male";

   // getter
   get featchWeight(){
      return this.#wt;
   }

   // setter
   set featchWeight(wt){
      this.#wt = wt;
   }

   // behavior
   walking(){
      console.log("I am walking");
   }
   running(){
      console.log("I am running");
   }
}


   let obj1 = new Person();
   console.log(obj1.age);
   // console.log(obj1.#wt);    private property cannot be accessed directly
   /*    to access private property we need to use getter and setter    */
   console.log(obj1.featchWeight);
   obj1.walking();
   obj1.running();

