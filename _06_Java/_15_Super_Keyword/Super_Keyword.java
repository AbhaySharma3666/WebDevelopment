<<<<<<< HEAD
package _15_Super_Keyword;

class A {
    private int x;

    A(int x){
        this.x=x;
    }
    public int getX() { return x; };

    public void showX(){
        System.out.println("Value of x is " + getX());
    }
}
class B extends A{
    private int x, y;
    B(int x, int y){
        super(x);
        this.y=y;
    }
    public int getY() { return y; };

    public void showY(){
        System.out.println("Value of y is " + getY());
    }
}
class C extends B{
    private int x, y, z;
    C(int x, int y, int z){
        super(x,y);
        this.z = z;
    }
    public int getZ() { return z; };

    public void showZ(){
        System.out.println("Value of z is " + getZ());
    }
    public void sum(){
        int s = getX() + getY() + getZ();
        System.out.println("Sum is : " + s);
    }
}

public class Super_Keyword {
    public static void main(String[] args) {
        C c = new C(10, 20, 30);
        c.showX();
        c.showY();
        c.showZ();
        c.sum();
    }
}
=======
package _15_Super_Keyword;

class A {
    private int x;

    A(int x){
        this.x=x;
    }
    public int getX() { return x; };

    public void showX(){
        System.out.println("Value of x is " + getX());
    }
}
class B extends A{
    private int x, y;
    B(int x, int y){
        super(x);
        this.y=y;
    }
    public int getY() { return y; };

    public void showY(){
        System.out.println("Value of y is " + getY());
    }
}
class C extends B{
    private int x, y, z;
    C(int x, int y, int z){
        super(x,y);
        this.z = z;
    }
    public int getZ() { return z; };

    public void showZ(){
        System.out.println("Value of z is " + getZ());
    }
    public void sum(){
        int s = getX() + getY() + getZ();
        System.out.println("Sum is : " + s);
    }
}

public class Super_Keyword {
    public static void main(String[] args) {
        C c = new C(10, 20, 30);
        c.showX();
        c.showY();
        c.showZ();
        c.sum();
    }
}
>>>>>>> 35387576b9a0b809457b398be6486ca5e6dbc9f1
