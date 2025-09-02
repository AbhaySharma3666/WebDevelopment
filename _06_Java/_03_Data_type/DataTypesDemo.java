package _03_Data_type;

public class DataTypesDemo {
    public static void main(String[] args) {
        //  Primitive Data Types
        int myInt = 25;
        double myDouble = 12.99;
        boolean isJavaFun = true;
        char myChar = 'A';

        //  Non-Primitive (Reference) Data Types
        String myString = "Hello, Abhay!";
        int[] myArray = {1, 2, 3, 4};

        // 🖨️ Display values
        System.out.println("Integer: " + myInt);
        System.out.println("Double: " + myDouble);
        System.out.println("Boolean: " + isJavaFun);
        System.out.println("Character: " + myChar);
        System.out.println("String: " + myString);
        System.out.print("Array: ");
        for (int num : myArray) {
            System.out.print(num + " ");
        }
    }
}