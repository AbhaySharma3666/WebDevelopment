package _16_Exception_Handling;
/*
    What Are Checked Exceptions?
    Checked exceptions are exceptions that are checked at compile time. This means the Java compiler requires you to either:
        - Handle them using a try-catch block, or
        - Declare them using the throws keyword in the method signature.
    These exceptions typically represent external conditions that a program cannot control, such as:
        - File not found
        - Database connection failure
        - Network issues

    Flow Diagram: Checked Exception Handling
    Here's a simplified flow of how checked exceptions are handled:
        +---------------------+
        |  Start Program      |
        +---------------------+
                |
                v
        +---------------------+
        |  Call Method        |
        |  that may throw     |
        |  Checked Exception  |
        +---------------------+
                |
                v
        +-----------------------------+
        |  Is exception handled using |
        |  try-catch or throws?       |
        +-----------------------------+
        | Yes               |    No
            v                     v
        +----------------+   +--------------------------+
        | Handle or      |   | Compilation Error:       |
        | Propagate      |   | Must handle checked      |
        | Exception      |   | exception explicitly     |
        +----------------+   +---------------
                |
                v
        +---------------------+
        | Continue Execution  |
        +---------------------+

        To many exception in Checked Exception (Compile time) :-> IOException, InterruptedException, SQL Exception,
                                                                    ClassNotFoundException, FileNotFoundException

*/
import java.io.*;

import static java.lang.Thread.sleep;

class CE{
    public static void Checked(){
        try {
            FileReader file = new FileReader("example.txt");
            BufferedReader reader = new BufferedReader(file);
            System.out.println(reader.readLine());
            reader.close();
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }

    public static void Hello() throws Exception { // add throws Exception
        for (int i=1 ; i<=10 ; i++){            //                |
            if (i==5) {Thread.sleep(2000); }// fix this error we make the method to throws Exception
            System.out.print(i + " ");
        }
    }
}

public class Checked_Exception {
    public static void main(String[] args) throws Exception {
        CE ce = new CE();
        ce.Checked();
        ce.Hello();
    }
}
