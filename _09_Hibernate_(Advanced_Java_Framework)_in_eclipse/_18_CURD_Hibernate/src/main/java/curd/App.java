package curd;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration();
        cfg.configure("configuration/hibernate.cfg.xml");
        
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tr = session.beginTransaction();
        
        // Insert data
//        Employee eo = new Employee();
//        eo.setEmo_fname("Sonu");
//        eo.setEmo_lname("Kumar");
//        eo.setEmo_city("Durg");
//        
//        try {
//			session.save(eo);
//			tr.commit();
//			System.out.println("Data stored...");
//		} catch (Exception e) {
//			tr.rollback();
//			e.printStackTrace();
//		}
        
        // Fetch data from database
//        try {
//        		Employee eo2 = session.get(Employee.class, 1);
//        		if (eo2 != null) {
//        			System.out.println("Id : " + eo2.getEmo_id());
//        			System.out.println("Fname : " + eo2.getEmo_fname());
//        			System.out.println("Lname : " + eo2.getEmo_lname());
//        			System.out.println("City : " + eo2.getEmo_city());
//			}
//        		else {
//					System.out.println("Data not found..");
//				}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
        
        
        // Update data
//        try {
//			Employee eo3 = session.get(Employee.class,2);
//			eo3.setEmo_city("Pune");
//			session.saveOrUpdate(eo3);
//			System.out.println("City updated");
//			tr.commit();
//		} catch (Exception e) {
//			tr.rollback();
//			e.printStackTrace();
//		}
        
        
        // Delete row
        try {
			Employee eo4 = new Employee();
			eo4.setEmo_id(2);
			session.delete(eo4);
			tr.commit();
			System.out.println("Data deleted successfully..");
		} catch (Exception e) {
			tr.rollback();
			e.printStackTrace();
			// TODO: handle exception
		}
        
        
        
        
        
    }
}
