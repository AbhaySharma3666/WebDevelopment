package _17_Threading;

public class _05_Get_Priority {
    public static void main(String[] args) {
        C1 c1 = new C1();
        C2 c2 = new C2();
        C3 c3 = new C3();

    //  By default, Priority of Min = 1 , Max = 10 , Normal = 5

        c1.setPriority(Thread.MIN_PRIORITY);
        c2.setPriority(Thread.NORM_PRIORITY);
        c3.setPriority(Thread.MAX_PRIORITY);

        c1.start();
        c2.start();
        c3.start();

    }
}
class C1 extends Thread {
    public void run(){
        System.out.println("Thread c1 priority is : "+ getPriority());
    }
}
class C2 extends Thread {
    public void run(){
        System.out.println("Thread c2 priority is : "+ getPriority());
    }
}
class C3 extends Thread {
    public void run(){
        System.out.println("Thread c3 priority is : "+ getPriority());
    }
}
