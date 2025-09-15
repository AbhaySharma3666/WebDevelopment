package _16_Exception_Handling;

public class Try_Finally {
    public static void main(String[] args) {

        // try-finally without catch block
        try {
            System.out.println("Inside try block");
            throw new RuntimeException("Test");
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
