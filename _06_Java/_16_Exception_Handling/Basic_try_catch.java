package _16_Exception_Handling;

public class Basic_try_catch {
    public static void main(String[] args) {

        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }
        System.out.println("running");
    }
}
