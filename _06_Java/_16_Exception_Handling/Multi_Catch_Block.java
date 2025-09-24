<<<<<<< HEAD
package _16_Exception_Handling;

public class Multi_Catch_Block {
    public static void main(String[] args) {
//        Multiple catch Blocks (Exception Ladder)

        try {
            String str = null;
            System.out.println(str.length());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error.");
        } catch (NullPointerException e) {
            System.out.println("Null pointer error.");
        } catch (Exception e) {
            System.out.println("General exception.");
        }
    }
}
=======
package _16_Exception_Handling;

public class Multi_Catch_Block {
    public static void main(String[] args) {
//        Multiple catch Blocks (Exception Ladder)

        try {
            String str = null;
            System.out.println(str.length());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error.");
        } catch (NullPointerException e) {
            System.out.println("Null pointer error.");
        } catch (Exception e) {
            System.out.println("General exception.");
        }
    }
}
>>>>>>> 35387576b9a0b809457b398be6486ca5e6dbc9f1
