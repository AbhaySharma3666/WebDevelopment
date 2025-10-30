package package1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        State s1 = new State();
        s1.setS_id(11);
        s1.setS_name("Maharashtra");
        
        
        Capital c1 = new Capital();
        c1.setC_id(45);
        c1.setC_name("Mumbai");
        
        s1.setC(c1);
        c1.setS(s1);
        
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session s = sf.openSession();
        s.beginTransaction();
        s.save(s1);
        s.save(c1);
        s.getTransaction().commit();
        System.out.println("Successfully Created..");
     }
}
