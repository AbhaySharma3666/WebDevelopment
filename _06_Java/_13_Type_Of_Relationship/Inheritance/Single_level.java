package _13_Type_Of_Relationship.Inheritance;

// Inheritance ude by extend keyword

class AA {
    public int i,j;
    private int x=34;
    protected int z=100;

    public void setX(int x){ this.x=x; };
    public int getX(){ return x; };

    public void showij(){
        System.out.println(i);
        System.out.println(j);
    }
}
class BB extends AA{
    public int k;
    public void showk(){
        System.out.println(k);
    }
    public void sum(){
        int s=i+j+k;
        System.out.println("sum is : "+s);
    }
}
class CC extends AA{
//    show error because x is private child class cant be use private properties of parent class
//    int priv = x;
    public void showx(){
//        System.out.println(x);
        System.out.print("by using setter and getter. ");
        System.out.println("x : "+ getX());
    }
    int pro = z;
//    in Protected properties of parent class is only access by child
    public void showz(){
        System.out.println("z = "+z);
    }


}


public class Single_level {
    public static void main(String[] args) {
        BB bb = new BB();
        bb.i=10;
        bb.j=20;
        bb.showij();
        bb.k=30;
        bb.showk();
        bb.sum();

        CC cc = new CC();
//        show error in showx() chils cant use parent private properties
        cc.showx();
        cc.showz();
    }
}
