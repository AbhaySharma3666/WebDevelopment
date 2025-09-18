package _19_string;

/*
    What is StringBuffer?
        StringBuffer is a mutable sequence of characters—unlike String, which is immutable.
        That means you can modify the contents of a StringBuffer object without creating a
        new one each time.

    Key Features
        - Thread-safe: All methods are synchronized, making it safe for use in multithreaded
                        environments.
        - Efficient for modifications: Ideal when you need to frequently change or build strings
                                        dynamically.
*/

public class stringBuffer {
    public static void main(String[] args) {
        // Creates an empty StringBuffer with default capacity (16 characters)
        StringBuffer sb1 = new StringBuffer();
        System.out.println(sb1.capacity()); // Output: 16

        // Creates a StringBuffer with initial content "java"
        // Capacity = default 16 + length of "java" (4) = 20
        StringBuffer sb2 = new StringBuffer("java");
        System.out.println(sb2.capacity()); // Output: 20

        // Another empty StringBuffer with default capacity
        StringBuffer sb3 = new StringBuffer();
        System.out.println(sb3.capacity()); // Output: 16

        // Appending "Hello" (5 characters) doesn't exceed default capacity
        sb3.append("Hello");
        System.out.println(sb3.capacity()); // Still 16 as it's within limit
    }
}