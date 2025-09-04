package _05_Type_Cast;

/*  Type casting means converting a variable from one data type to another. Java supports:
        - Widening Casting (Automatic)
              Converts a smaller type to a larger type size. No data loss.
              byte → short → int → long → float → double

        - Narrowing Casting (Manual)
              Converts a larger type to a smaller type size. Requires explicit casting and may cause data loss.

*/

public class typeCast {
    public static void main(String[] args) {
        //  Implicit  Casting (Automatic)
        int myInt = 100;
        double myDouble = myInt;  // int to double

        System.out.println("Widened double: " + myDouble);  // Outputs 100.0

        //  Explicit  Casting (Manual,Narrowing)
        double originalDouble = 123.456;
        int narrowedInt = (int) originalDouble;  // double to int

        System.out.println("Narrowed int: " + narrowedInt);  // Outputs 123 (decimal truncated)
    }

}
