<<<<<<< HEAD
package _19_string;

/*
    What is StringBuilder?
        StringBuilder is a mutable sequence of characters, just like StringBuffer,
        but it’s not synchronized. That makes it faster in single-threaded environments where
        thread safety isn’t a concern.

    Key Features
        - High performance: No synchronization overhead.
        - Efficient for frequent string modifications.
        - Same API as StringBuffer, so switching between them is easy.

 */

public class stringBuilder {
    public static void main(String[] args) {
        // Creates an empty StringBuffer with default capacity (16 characters)
        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1.capacity()); // Output: 16

        // Creates a StringBuffer with initial content "java"
        // Capacity = default 16 + length of "java" (4) = 20
        StringBuilder sb2 = new StringBuilder("java");
        System.out.println(sb2.capacity()); // Output: 20

        // Another empty StringBuffer with default capacity
        StringBuilder sb3 = new StringBuilder();
        System.out.println(sb3.capacity()); // Output: 16

        // Appending "Hello" (5 characters) doesn't exceed default capacity
        sb3.append("Hello");
        System.out.println(sb3.capacity()); // Still 16 as it's within limit
    }
}
=======
package _19_string;

/*
    What is StringBuilder?
        StringBuilder is a mutable sequence of characters, just like StringBuffer,
        but it’s not synchronized. That makes it faster in single-threaded environments where
        thread safety isn’t a concern.

    Key Features
        - High performance: No synchronization overhead.
        - Efficient for frequent string modifications.
        - Same API as StringBuffer, so switching between them is easy.

 */

public class stringBuilder {
    public static void main(String[] args) {
        // Creates an empty StringBuffer with default capacity (16 characters)
        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1.capacity()); // Output: 16

        // Creates a StringBuffer with initial content "java"
        // Capacity = default 16 + length of "java" (4) = 20
        StringBuilder sb2 = new StringBuilder("java");
        System.out.println(sb2.capacity()); // Output: 20

        // Another empty StringBuffer with default capacity
        StringBuilder sb3 = new StringBuilder();
        System.out.println(sb3.capacity()); // Output: 16

        // Appending "Hello" (5 characters) doesn't exceed default capacity
        sb3.append("Hello");
        System.out.println(sb3.capacity()); // Still 16 as it's within limit
    }
}
>>>>>>> 35387576b9a0b809457b398be6486ca5e6dbc9f1
