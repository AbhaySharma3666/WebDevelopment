<<<<<<< HEAD
package _16_Exception_Handling;

public class Nested_Try_catch {
    public static void main(String[] args) {

//        Nested try-catch

        try {
            System.out.println("Outer try block");
            try {
                int[] arr = new int[3];
                arr[5] = 10;  // ArrayIndexOutOfBoundsException
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch: Array index out of bounds.");
            }
        } catch (Exception e) {
            System.out.println("Outer catch: General exception.");
        }
    }
}
=======
package _16_Exception_Handling;

public class Nested_Try_catch {
    public static void main(String[] args) {

//        Nested try-catch

        try {
            System.out.println("Outer try block");
            try {
                int[] arr = new int[3];
                arr[5] = 10;  // ArrayIndexOutOfBoundsException
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch: Array index out of bounds.");
            }
        } catch (Exception e) {
            System.out.println("Outer catch: General exception.");
        }
    }
}
>>>>>>> 35387576b9a0b809457b398be6486ca5e6dbc9f1
