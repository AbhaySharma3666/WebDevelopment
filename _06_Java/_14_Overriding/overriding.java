<<<<<<< HEAD
package _14_Overriding;

// Overriding = same method name with same parameter

class A1 {
    public void show (int x, int y){
        int z= x+y;
        System.out.println("Add is =" + z);
    }
}
class B1 extends A1{
    public void show (int x, int y){
        int z= x-y;
        System.out.println("Subtraction is =" + z);
    }
}
class C1 extends A1{
    public void show (int x, int y){
        int z= x*y;
        System.out.println("Multi is =" + z);
    }
}
class D1 extends A1{
    public void show (int x, int y){
        int z= x/y;
        System.out.println("Division is =" + z);
    }
}

public class overriding {
    public static void main(String[] args) {
        A1 a = new A1();
        B1 b = new B1();
        C1 c = new C1();
        D1 d = new D1();

        a.show(10,32);
        b.show(10,32);
        c.show(10,32);
        d.show(10,32);
    }
}
=======
package _14_Overriding;

// Overriding = same method name with same parameter

class A1 {
    public void show (int x, int y){
        int z= x+y;
        System.out.println("Add is =" + z);
    }
}
class B1 extends A1{
    public void show (int x, int y){
        int z= x-y;
        System.out.println("Subtraction is =" + z);
    }
}
class C1 extends A1{
    public void show (int x, int y){
        int z= x*y;
        System.out.println("Multi is =" + z);
    }
}
class D1 extends A1{
    public void show (int x, int y){
        int z= x/y;
        System.out.println("Division is =" + z);
    }
}

public class overriding {
    public static void main(String[] args) {
        A1 a = new A1();
        B1 b = new B1();
        C1 c = new C1();
        D1 d = new D1();

        a.show(10,32);
        b.show(10,32);
        c.show(10,32);
        d.show(10,32);
    }
}
>>>>>>> 35387576b9a0b809457b398be6486ca5e6dbc9f1
