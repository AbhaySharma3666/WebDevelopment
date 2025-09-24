<<<<<<< HEAD
package _17_Threading;

// By using Runnable

public class _07_Method_2_createThread {
    public static void main(String[] args) {
        N1 n1 = new N1();
        N2 n2 = new N2();

        Thread t1 = new Thread(n1);
        Thread t2 = new Thread(n2);

        t1.start();
        t2.start();

    }
}
class N1 implements Runnable{
    public void run(){
        for (int i=1 ; i<=5 ; i++){
            System.out.println("N1.." + i);
        }
    }
}
class N2 implements Runnable{
    public void run(){
        for (int i=1 ; i<=5 ; i++){
            System.out.println("N2.." + i);
        }
    }
}
=======
package _17_Threading;

// By using Runnable

public class _07_Method_2_createThread {
    public static void main(String[] args) {
        N1 n1 = new N1();
        N2 n2 = new N2();

        Thread t1 = new Thread(n1);
        Thread t2 = new Thread(n2);

        t1.start();
        t2.start();

    }
}
class N1 implements Runnable{
    public void run(){
        for (int i=1 ; i<=5 ; i++){
            System.out.println("N1.." + i);
        }
    }
}
class N2 implements Runnable{
    public void run(){
        for (int i=1 ; i<=5 ; i++){
            System.out.println("N2.." + i);
        }
    }
}
>>>>>>> 35387576b9a0b809457b398be6486ca5e6dbc9f1
