package _12_Constructor_And_Overloading;

// Method Overloading => same method name with Different Parameter

class A{
    public void hello(){
        System.out.println("no parameter ! here");
    }
    public void hello(int x){
        System.out.println("1 parameter ! here i.e : x= "+x);
    }
    public void hello(int x, int y){
        System.out.println("1 parameter ! here i.e : x= "+x+" , y= "+y);
    }
    public void hello(int x, int y, double z){
        System.out.println("1 parameter ! here i.e : x= "+x+" , y= "+y+" , z= "+z);
    }
}
public class Method_Overloading {
    public static void main(String[] args) {
        A a = new A();
        a.hello();
        a.hello(21);
        a.hello(21, 85);
        a.hello(21,85,65.63);

    }
}
