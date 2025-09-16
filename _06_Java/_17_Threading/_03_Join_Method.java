package _17_Threading;

/*
        What Is join() in Java?
        The join() method is used to pause the current thread until the thread on which join()
         was called has finished executing.

     Why Use It?
        - Ensures sequential execution in multithreaded programs.
        - Helps avoid race conditions when one thread depends on another’s result.

     Syntax Variants
       - public final void join() throws InterruptedException
       - public final void join(long millis) throws InterruptedException
       - public final void join(long millis, int nanos) throws InterruptedException



👨‍💻 Example
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread started: " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000); // Simulate work
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
        System.out.println("Thread finished: " + Thread.currentThread().getName());
    }
}

public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.start();
        t1.join(); // Wait for t1 to finish

        t2.start();
        t2.join(); // Wait for t2 to finish

        System.out.println("Main thread ends");
    }
}

 without using join method we assume our output is :-   but is wrong               correct output
                                                     Main Thread is stating    |  Main Thread is stating
                                                     aaa , bbb , ccc  (random) |  Main Thread is completed
                                                     Main Thread is completed  |  aaa , bbb , ccc  (random)

 with using join method we assume our output is :-
                                                   Main Thread is stating
                                                   aaa , bbb , ccc  (random)
                                                   Main Thread is completed


*/

public class _03_Join_Method {
    public static void main(String[] args) {
        System.out.println("Main Thread is stating");

        AAA aaa = new AAA();
        BBB bbb = new BBB();
        CCC ccc = new CCC();

        aaa.start();
        bbb.start();
        ccc.start();
        // output is random because all class executing parallel

        try{
            aaa.join();
            bbb.join();
            ccc.join();
        }catch (Exception e){
            System.out.println(e);
        }

        System.out.println("Main Thread is completed");
    }
}
class AAA extends Thread {
    public void run(){
        for (int i=1 ; i<=5 ; i++){
            System.out.println("AAA = "+i);
        }
    }
}
class BBB extends Thread {
    public void run(){
        for (int i=5 ; i<=10 ; i++) System.out.println("BBB = "+i);
    }
}
class CCC extends Thread {
    public void run(){
        for (int i=11 ; i<=15 ; i++) System.out.println("CCC = "+i);
    }
}
