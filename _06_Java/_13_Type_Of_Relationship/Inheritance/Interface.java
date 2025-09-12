package _13_Type_Of_Relationship.Inheritance;


//  interface -----(extends)----- another interface
//  interface ------(implements)----class

// _13_Type_Of_Relationship.Inheritance.Interface defining a contract with two abstract methods
interface Contract {
    public void hello1();  // abstract method
    public void hello2();  // abstract method
}

// Concrete class that fully implements the _13_Type_Of_Relationship.Inheritance.Contract interface
class Third_Party implements Contract {
    // Must implement all methods from the _13_Type_Of_Relationship.Inheritance.Contract interface

    @Override
    public void hello1() {
        System.out.println("Hello from hello1 in _13_Type_Of_Relationship.Inheritance.Third_Party\n");
    }

    @Override
    public void hello2() {
        System.out.println("Hello from hello2 in _13_Type_Of_Relationship.Inheritance.Third_Party");
    }
}

// Abstract class that partially implements the _13_Type_Of_Relationship.Inheritance.Contract interface
abstract class Third_Party2 implements Contract {
    // Implements only one method from the interface
    // Therefore, the class must be declared abstract

    @Override
    public void hello1() {
        System.out.println("Partial implementation: hello1 in _13_Type_Of_Relationship.Inheritance.Third_Party2\n");
    }

    // Additional method specific to this abstract class
    public void otherMethod() {
        System.out.println("I am another method inside the abstract class");
    }
}

// Concrete subclass that completes the implementation of the interface
class subParty extends Third_Party2 {
    // Implements the remaining method from the _13_Type_Of_Relationship.Inheritance.Contract interface

    @Override
    public void hello2() {
        System.out.println("hello2 implemented in _13_Type_Of_Relationship.Inheritance.subParty\n");
    }
}

// Main class to test the implementations
public class Interface {
    public static void main(String[] args) {
        // Using fully implemented class
        Third_Party obj = new Third_Party();
        obj.hello1();
        obj.hello2();

        // Using anonymous class to complete abstract class implementation
        Contract obj2 = new Third_Party2() {
            @Override
            public void hello2() {
                System.out.println("hello2 implemented in anonymous class");
            }
        };
        obj2.hello1();
        obj2.hello2();

        // Using subclass of abstract class
        subParty obj3 = new subParty();
        obj3.hello1();
        obj3.hello2();
        obj3.otherMethod();  // calling method from abstract class
    }
}