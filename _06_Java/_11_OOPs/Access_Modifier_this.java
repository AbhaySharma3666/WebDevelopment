package _11_OOPs;

class Mac{
    private int x, y;
    public void setx(int a){
        x=a;
    }
    public void sety(int y){
//        y=y;  compiler not understand o/p - 0
        this.y=y;
    }
    public void show(){
        System.out.println("x is : "+x);
        System.out.println("y is : "+y);
    }
}

class info{
    private int id;
    private String name;
    private String city;

    public info(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    @Override
    public String toString(){
        return "Info [id= "+id+" , name= "+name+" , city= "+city+"]";
    }
}
public class Access_Modifier_this {
    public static void main(String[] args) {

        Mac m = new Mac();
//        m.x=10;
        m.setx(21); // access by setter method
        m.sety(43);
        m.show();

        info ifo = new info(1,"Abhay","Goa");
        System.out.println(ifo); // ifo.toString()

    }
}
