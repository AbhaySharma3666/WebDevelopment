package _11_OOPs;

public class Class {

    public void add(int n1 , int n2){
        System.out.println("Add :- "+(n1+n2));
    }

    public void subt(int n1 , int n2){
        if (n1>n2) System.out.println("Subtract :- "+(n1-n2));
        else System.out.println("Subtract :- "+(n2-n1));
    }

    public void multi(int n1 , int n2){
        System.out.println("Multiple :- "+(n1*n2));
    }

}

class Introduction{
    public static void show(){
        System.out.println("hello.txt ..! i am another class name introduction");
    }
}
