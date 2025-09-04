package _05_Type_Cast;

/*
    Autoboxing is the automatic conversion of a primitive type into its corresponding wrapper class.
        Example: Converting int → Integer

    Unboxing is the reverse—automatically converting a wrapper class object back into a primitive type.
        Example: Converting Integer → int

 */

import java.util.ArrayList;

public class primitive_To_Wrapper {
    public static void main(String[] args) {
        // Autoboxing: primitive to wrapper
        int num = 50;
        Integer boxedNum = num;  // int -> Integer
        System.out.println("Autoboxed Integer: " + boxedNum);

        // Unboxing: wrapper to primitive
        Integer wrapperObj = 100;
        int unboxedNum = wrapperObj;  // Integer -> int
        System.out.println("Unboxed int: " + unboxedNum);

        // Using with Collections (which require objects, not primitives)
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);     // Autoboxing int -> Integer
        int first = numbers.get(0); // Unboxing Integer -> int
        System.out.println("First value from list: " + first);
    }
}
