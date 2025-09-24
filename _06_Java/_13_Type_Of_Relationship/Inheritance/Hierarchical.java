package _13_Type_Of_Relationship.Inheritance;

// Method Overriding : Same method name with same parameter
// Polymorphism : many form

// final keyword
// with class cant be override
// with method : cant be override
// with varible : you never change the value

class A1 {
    public void show (int x, int y){
        int z= x+y;
        System.out.println("Add is = " + z);
    }
}
class B1 extends A1{
    public void show (int x, int y){
        int z= x-y;
        System.out.println("Subtraction is = " + z);
    }
}
class C1 extends A1{
    public void show (int x, int y){
        int z= x*y;
        System.out.println("Multi is = " + z);
    }
}
class D1 extends A1{
    public void show (int x, int y){
        int z= x/y;
        System.out.println("Division is = " + z);
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        A1 a = new A1();
        B1 b = new B1();
        C1 c = new C1();
        D1 d = new D1();

        a.show(10,32);
        b.show(10,32);
        c.show(10,32);
        d.show(10,32);

        System.out.println();

//        Polymorphism
//        when hie rarchical and overriding then polymorphism is possible
        A1 ref;
        ref = a;
        ref.show(10,32);
        ref = b;
        ref.show(10,32);
        ref = c;
        ref.show(10,32);
        ref = d;
        ref.show(10,32);

//        another way
        System.out.println();
        A1 p[] = { new A1(), new B1(), new C1(), new D1() };
        for( A1 q:p){
            q.show(10,20);
        }
    }
}

