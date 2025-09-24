package _16_Exception_Handling;

import java.io.FileNotFoundException;

public class Catching_Multiple_Exceptions {
    public static void main(String[] args){
//        Catching Multiple Exceptions in One Block
        try {
            int[] arr = new int[2];
            arr[3] = 5;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught exception: " + e);
        }
    }
}
