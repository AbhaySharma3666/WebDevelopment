package _13_Type_Of_Relationship;

class Address{
    public String city, state, country;
    Address(String city, String state, String country){
        this.city = city;
        this.state = state;
        this.country = country;
    }
}

class Emp{
    public int emp_id;
    public String emp_name;
    Address a;
    Emp(int emp_id, String emp_name , Address a){
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.a = a;
    }
    public void show(){
        System.out.println("emp name: "+emp_name);
        System.out.println("emp id: "+emp_id);
        System.out.println("emp city: "+a.city);
        System.out.println("emp state: "+a.state);
        System.out.println("emp country: "+a.country);
        System.out.println();
    }
}
class student{
    public  int roll;
    public String name;
    Address a;
    student(int roll , String name,Address a){
        this.roll =roll;
        this.name=name;
        this.a=a;
    }
    public void show(){

        System.out.println("Name : "+ name);
        System.out.println("Roll No. : "+ roll);
        System.out.println("City : "+ a.city);
        System.out.println("State : "+ a.state);
        System.out.println("Country : "+ a.country);
        System.out.println();
    }
}
public class Association {
    public static void main(String[] args) {
        Address ao1 = new Address("Pune","Maharashtra","India");
        Address ao2 = new Address("Mumbai","Maharashtra","India");
        Address ao3 = new Address("Pune","Maharashtra","India");

        Emp eo1 = new Emp(1,"AAA",ao1);
        Emp eo2 = new Emp(2,"BBB",ao2);
        Emp eo3 = new Emp(3,"CCC",ao3);

        eo1.show();
        eo2.show();
        eo3.show();

        student s1 = new student(1,"Soni",ao1);
        student s2 = new student(2,"Rohan",ao2);
        System.out.println("Student Information");
        s1.show();;
        s2.show();
    }
}
