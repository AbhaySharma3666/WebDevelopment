package _04_Type_Of_Variable;

public class VariableTypes {
    //  Instance variable: Belongs to the object. Each object has its own copy.
    int instanceVar = 10;

    //  Static variable: Belongs to the class. Shared by all objects of the class.
    static int staticVar = 20;

    void display() {
        //  Local variable: Declared inside a method. Only accessible within this method.
        int localVar = 5;

        // 🔎 Displaying the values of all variable types
        System.out.println("Local Variable: " + localVar);         // Local variable
        System.out.println("Instance Variable: " + instanceVar);   // Instance variable
        System.out.println("Static Variable: " + staticVar);       // Static variable
    }

    public static void main(String[] args) {
        //  Creating an object of the class
        VariableTypes obj = new VariableTypes();

        //  Calling display method using object
        obj.display();

        // Accessing static variable without object (using class name)
        System.out.println("Static Variable (accessed via class): " + VariableTypes.staticVar);
    }
}