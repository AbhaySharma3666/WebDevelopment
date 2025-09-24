package _17_Threading;

//  Demonstration of Synchronization with Table Printing
public class _09_Synchronization_1 {
    public static void main(String[] args) {
        // Shared Table object for both threads
        Table t = new Table();

        // Creating threads that will use the shared Table object
        TAB1 tab1 = new TAB1(t);
        TAB2 tab2 = new TAB2(t);

        // Starting both threads
        tab1.start();
        tab2.start();
    }
}

//  Class with synchronized method to print a multiplication table
class Table {
    // Synchronized method ensures only one thread can access this method at a time
    synchronized public void printtable(int n){
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }

        // Adding a slight delay to simulate work and make thread switching observable
        try {
            Thread.sleep(200);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

//  First thread that prints the multiplication table of 5
class TAB1 extends Thread {
    Table t;

    // Constructor to bind the shared Table instance
    TAB1(Table t){
        this.t = t;
    }

    public void run(){
        t.printtable(5); // Prints table of 5
        System.out.println(); // Adds a blank line for readability
    }
}

//  Second thread that prints the multiplication table of 50
class TAB2 extends Thread {
    Table t;

    // Constructor to bind the shared Table instance
    TAB2(Table t){
        this.t = t;
    }

    public void run(){
        t.printtable(50); // Prints table of 50
    }
}