<<<<<<< HEAD
package _12_Constructor_And_Overloading;

// Constructor Overloading is a same constructor name with different parameter

class Mac1{
    private int x,y;
    private String name;

    Mac1(){
        x=10; y=20;
        name = "java";
    }
    Mac1(int x){
        this.x=x;
    }
    Mac1(int x, int y){
        this.x=x;
        this.y=x;
    }
    Mac1(int x, int y,String name){
        this.x=x;
        this.y=x;
        this.name=name;
    }
    void show(){
        System.out.println("x is : "+x);
        System.out.println("y is : "+y);
        System.out.println("name is : "+name);
    }
}

public class Constructor_Overloading {
    public static void main(String[] args) {
        Mac1 m1 = new Mac1();
        m1.show();
        System.out.println();
        Mac1 m2 = new Mac1(21);
        m2.show();
        System.out.println();
        Mac1 m3 = new Mac1(98,54);
        m3.show();
        System.out.println();
        Mac1 m4 = new Mac1(98,54,"overloading");
        m4.show();
    }
}
=======
package _12_Constructor_And_Overloading;

// Constructor Overloading is a same constructor name with different parameter

class Mac1{
    private int x,y;
    private String name;

    Mac1(){
        x=10; y=20;
        name = "java";
    }
    Mac1(int x){
        this.x=x;
    }
    Mac1(int x, int y){
        this.x=x;
        this.y=x;
    }
    Mac1(int x, int y,String name){
        this.x=x;
        this.y=x;
        this.name=name;
    }
    void show(){
        System.out.println("x is : "+x);
        System.out.println("y is : "+y);
        System.out.println("name is : "+name);
    }
}

public class Constructor_Overloading {
    public static void main(String[] args) {
        Mac1 m1 = new Mac1();
        m1.show();
        System.out.println();
        Mac1 m2 = new Mac1(21);
        m2.show();
        System.out.println();
        Mac1 m3 = new Mac1(98,54);
        m3.show();
        System.out.println();
        Mac1 m4 = new Mac1(98,54,"overloading");
        m4.show();
    }
}
>>>>>>> 35387576b9a0b809457b398be6486ca5e6dbc9f1
