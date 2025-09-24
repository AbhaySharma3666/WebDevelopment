package _17_Threading;

public class _04_Change_Thread_Name {
    public static void main(String[] args) {
    //  Always default thread name is -> main
        System.out.println("Default thread name of main is : "+Thread.currentThread().getName());
    //  we can change the thread name
        Thread.currentThread().setName("Main-Thread");
        System.out.println("Default thread name of main is : "+Thread.currentThread().getName());

        System.out.println();

        X x = new X();
        Y y = new Y();
        Z z = new Z();

        x.changename();    // Always default thread name is -> Thread-0
        y.changename();    // Always default thread name is -> Thread-1
        z.changename();    // Always default thread name is -> Thread-2
    }
}
class X{
    public void changename(){
        System.out.println("Default thread name of X is : "+Thread.currentThread().getName());
        //  we can change the thread name
        Thread.currentThread().setName("Thread-X");
        System.out.println("Default thread name of X is : "+Thread.currentThread().getName());
    }
}
class Y{
    public void changename(){
        System.out.println();
        System.out.println("Default thread name of Y is : "+Thread.currentThread().getName());
        //  we can change the thread name
        Thread.currentThread().setName("Thread-Y");
        System.out.println("Default thread name of Y is : "+Thread.currentThread().getName());
    }
}
class Z{
    public void changename(){
        System.out.println();
        System.out.println("Default thread name of Z is : "+Thread.currentThread().getName());
        //  we can change the thread name
        Thread.currentThread().setName("Thread-XZ");
        System.out.println("Default thread name of Z is : "+Thread.currentThread().getName());
    }
}
