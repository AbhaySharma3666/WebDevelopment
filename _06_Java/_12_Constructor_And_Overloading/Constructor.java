package _12_Constructor_And_Overloading;

/*
    - constructor call with create object
*/

class test {
    public void show() {
        System.out.println("its a simple method");
    }

    public test(){
        System.out.println("I am a Constructor with another class");
    }

    private test(int a){
        System.out.println("i am private contructor.");
    }
}

class Mac{
    public int emp_id;
    public String emp_name;
    // Parameterized constructor
    Mac(int emp_id,String emp_name){
        this.emp_id = emp_id;
        this.emp_name= emp_name;
    }

    // copy constructor
    Mac(Mac mo){
        this.emp_id = mo.emp_id;
        this.emp_name = mo.emp_name;
    }

    public void show(){
        System.out.println("Id is : "+ emp_id);
        System.out.println("Name is : "+ emp_name);
    }


}

public class Constructor {
    // non-Parameterized constructor
    private Constructor(){
        System.out.println("Its private constructor with in same class");
    }

    public static void main(String[] args) {
        test t = new test();
//        show error due to private constructor
//        test t1 = new test(2);

        new Constructor();

        System.out.println( );
        Mac m = new Mac(1,"Abhay");
        m.show();
        Mac m2 = new Mac(m);
        System.out.println("\nCopy constructor");
        System.out.println(m2.emp_id);
        System.out.println(m2.emp_name);
    }
}
