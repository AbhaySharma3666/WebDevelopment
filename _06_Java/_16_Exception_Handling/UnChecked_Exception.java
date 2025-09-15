package _16_Exception_Handling;

/*
        What Are Unchecked Exceptions?
        Unchecked exceptions are not checked at compile time. This means:
            - The compiler does not require you to handle them explicitly.
            - They occur due to programming logic errors and typically indicate bugs.
        They are subclasses of:
            - RuntimeException
            - Error (though Error is usually not meant to be caught)
        Flow Diagram: Unchecked Exception Handling
                    +---------------------+
                    |  Start Program      |
                    +---------------------+
                              |
                              v
                    +---------------------+
                    |  Execute Code       |
                    +---------------------+
                              |
                              v
                    +-----------------------------+
                    |  Does an unchecked          |
                    |  exception occur?           |
                    +-----------------------------+
                         | Yes           | No
                         v               v
                    +----------------+   +---------------------+
                    | Program throws |   | Continue Execution  |
                    | RuntimeException|  +---------------------+
                    | or Error        |
                    +------------


 */


import java.util.Arrays;

class A {
    static public void divideError() {
        int x,y,z;
        x=20;
        y=0;
        //  we remove try and catch if any exception in your code then further code is not running
        try {
            z = x / y;
            System.out.println(z);
        }catch (Exception e){
            System.out.println(e);
            System.out.println(e.getMessage());
            System.out.println(Arrays.toString(e.getStackTrace()));
//            e.printStackTrace();
        }
        System.out.println("Further code running");
    }

    static public void arr() {
        int[] arr = {1, 2, 3};

        // This will throw ArrayIndexOutOfBoundsException
//        System.out.println(arr[5]);

        try{ System.out.println(arr[5]);}
        catch (Exception e){ System.out.println(e); }
        System.out.println("Further code running");
    }
}

public class UnChecked_Exception {
    public static void main(String[] args){
        A a = new A();
        a.divideError();

        a.arr();
    }
}
