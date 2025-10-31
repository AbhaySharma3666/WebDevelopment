package package1;

import java.util.List;
import java.util.ArrayList;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class App 
{
	
    public static void main( String[] args )
    {
        Employee e1 = new Employee();
        e1.setEmp_id(1);
        e1.setEmp_name("Abhay");
        
        Laptop lap1 = new Laptop();
        lap1.setLapy_id(101);
        lap1.setLapy_name("HP");
        
        Laptop lap2 = new Laptop();
        lap2.setLapy_id(102);
        lap2.setLapy_name("Apple");
        
        Laptop lap3 = new Laptop();
        lap3.setLapy_id(103);
        lap3.setLapy_name("Acer");
        
        Laptop lap4 = new Laptop();
        lap4.setLapy_id(104);
        lap4.setLapy_name("Dell");
        
        
        List<Laptop> list = new ArrayList<Laptop>();
        list.add(lap1);
        list.add(lap2);
        list.add(lap3);
        list.add(lap4);
        
        e1.setLapts(list);
        lap1.setEmp(e1);
        lap2.setEmp(e1);
        lap3.setEmp(e1);
        lap4.setEmp(e1);
        
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();
        session.save(e1);
        session.save(lap1);
        session.save(lap2);
        session.save(lap3);
        session.save(lap4);
        session.getTransaction().commit();
        System.out.println("success.");
    }
}
