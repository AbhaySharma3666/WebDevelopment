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
