<<<<<<< HEAD
package _13_Type_Of_Relationship.Inheritance;

class AAA {
    public int x;
    public void showx(){
        System.out.println("x = "+ x);
    }

}
class BBB extends AAA{
    public int y;
    public void showy(){
        System.out.println("y = "+y);
    }
}
class CCC extends BBB{
    public int z;
    public void showy(){
        System.out.println("z = "+z);
    }
}
class DDD extends CCC{
    public void sum(){
        int s = x+y+z;
        System.out.println("sum of x,y,z = "+s);
    }
}

public class Multiple_level {
    public static void main(String[] args) {
        DDD d = new DDD();
        d.x=10;
        d.y=20;
        d.z=50;
        d.sum();
    }
}
=======
package _13_Type_Of_Relationship.Inheritance;

class AAA {
    public int x;
    public void showx(){
        System.out.println("x = "+ x);
    }

}
class BBB extends AAA{
    public int y;
    public void showy(){
        System.out.println("y = "+y);
    }
}
class CCC extends BBB{
    public int z;
    public void showy(){
        System.out.println("z = "+z);
    }
}
class DDD extends CCC{
    public void sum(){
        int s = x+y+z;
        System.out.println("sum of x,y,z = "+s);
    }
}

public class Multiple_level {
    public static void main(String[] args) {
        DDD d = new DDD();
        d.x=10;
        d.y=20;
        d.z=50;
        d.sum();
    }
}
>>>>>>> 35387576b9a0b809457b398be6486ca5e6dbc9f1
