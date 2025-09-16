package _17_Threading;

// Single-threading means your program executes one task at a time, in a sequential flow.
// There’s only one thread—the main thread—which handles all operations from start to finish.


public class _01_Single_Threading {
    public static void main(String[] args) throws Exception {
        // creating object of class A,B,C
        A a = new A();
        B b = new B();
        C c = new C();
        a.show();
        b.show();
        c.show();

        SingleThreadDemo std = new SingleThreadDemo();
        std.ST();
    }
}
class A{
    public void show() throws Exception{
        for (int i=1 ; i<=5 ; i++) {
            if (i == 3){
                Thread.sleep(3000);
            }
            System.out.println("A = " + i);
        }
    }
}
class B{
    public void show() throws Exception{
        for (int i=6 ; i<=10 ; i++) {
            if (i == 8){
                Thread.sleep(3000);
            }
            System.out.println("B = " + i);
        }
    }
}
class C{
    public void show() throws Exception{

        for (int i=11 ; i<=15 ; i++) {
            if (i == 13){
                Thread.sleep(3000);
            }
            System.out.println("C = " + i);
        }
    }
}
class SingleThreadDemo {
    public void ST() throws Exception{
        taskOne(); // Runs first
        System.out.println("Waiting untill taskOne is completed");
        Thread.sleep(4000);
        taskTwo(); // Runs next
    }

    static void taskOne() {
        System.out.println("Task One is running");
    }

    static void taskTwo() {
        System.out.println("Task Two is running");
    }
}
