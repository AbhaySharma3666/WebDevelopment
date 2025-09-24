<<<<<<< HEAD
package _16_Exception_Handling;

public class Try_Catch_Finally {
    public static void main(String[] args) {
        try {
            int data = 50 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught exception: " + e);
        } finally {
            System.out.println("Finally block executed.");
        }
        System.out.println("running....");
    }
}
=======
package _16_Exception_Handling;

public class Try_Catch_Finally {
    public static void main(String[] args) {
        try {
            int data = 50 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught exception: " + e);
        } finally {
            System.out.println("Finally block executed.");
        }
        System.out.println("running....");
    }
}
>>>>>>> 35387576b9a0b809457b398be6486ca5e6dbc9f1
