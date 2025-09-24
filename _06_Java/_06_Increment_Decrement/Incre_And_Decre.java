<<<<<<< HEAD
package _06_Increment_Decrement;

public class Incre_And_Decre {
    // Filename: IncrementDecrementDemo.java


        public static void main(String[] args) {

            // Initializing variables
            int a = 5;
            int b = 10;

            // Post-increment: value is used first, then incremented
            System.out.println("Post-increment a (a++): " + (a++));  // prints 5, then a becomes 6
            System.out.println("After post-increment, a = " + a);     // prints 6

            // Pre-increment: value is incremented first, then used
            System.out.println("Pre-increment a (++a): " + (++a));   // a becomes 7, then prints 7

            // Post-decrement: value is used first, then decremented
            System.out.println("Post-decrement b (b--): " + (b--));  // prints 10, then b becomes 9
            System.out.println("After post-decrement, b = " + b);     // prints 9

            // Pre-decrement: value is decremented first, then used
            System.out.println("Pre-decrement b (--b): " + (--b));   // b becomes 8, then prints 8

            // Combining increment/decrement with expressions
            int result = ++a + b--;  // a becomes 8, b used as 8, result = 8 + 8 = 16, then b becomes 7
            System.out.println("Result of expression (++a + b--): " + result);
            System.out.println("Final values => a = " + a + ", b = " + b);
        }

}
=======
package _06_Increment_Decrement;

public class Incre_And_Decre {
    // Filename: IncrementDecrementDemo.java


        public static void main(String[] args) {

            // Initializing variables
            int a = 5;
            int b = 10;

            // Post-increment: value is used first, then incremented
            System.out.println("Post-increment a (a++): " + (a++));  // prints 5, then a becomes 6
            System.out.println("After post-increment, a = " + a);     // prints 6

            // Pre-increment: value is incremented first, then used
            System.out.println("Pre-increment a (++a): " + (++a));   // a becomes 7, then prints 7

            // Post-decrement: value is used first, then decremented
            System.out.println("Post-decrement b (b--): " + (b--));  // prints 10, then b becomes 9
            System.out.println("After post-decrement, b = " + b);     // prints 9

            // Pre-decrement: value is decremented first, then used
            System.out.println("Pre-decrement b (--b): " + (--b));   // b becomes 8, then prints 8

            // Combining increment/decrement with expressions
            int result = ++a + b--;  // a becomes 8, b used as 8, result = 8 + 8 = 16, then b becomes 7
            System.out.println("Result of expression (++a + b--): " + result);
            System.out.println("Final values => a = " + a + ", b = " + b);
        }

}
>>>>>>> 35387576b9a0b809457b398be6486ca5e6dbc9f1
