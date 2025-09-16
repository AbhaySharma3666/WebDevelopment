package _17_Threading;

public class _06_Set_Priority {
    public static void main(String[] args) {
        T1 t1 = new T1();
        T2 t2 = new T2();

        // We also can set the priority by manually and the range of that is 1 to 10
        t1.setPriority(8);
        t2.setPriority(5);

        t1.start();
        t2.start();

        try{
            Thread.sleep(2000);
        }catch (Exception e){
            System.out.println(e);
        }

        t1.interrupt();
        t2.interrupt();
    }
}
class T1 extends Thread {
    public void run(){
        for (int i=1 ; ; i++ ) {
            System.out.println("T1.. " + i);
        }
    }
}

class T2 extends Thread {
    public void run() {
        for (int i = 1; ; i++) {
            System.out.println("T2.. " + i);
        }
    }
}


