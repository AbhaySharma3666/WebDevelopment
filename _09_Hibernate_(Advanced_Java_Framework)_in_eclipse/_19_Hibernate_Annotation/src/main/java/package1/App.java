package package1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        Employee eo = new Employee();
        eo.setFname("Kumar2");
        eo.setLname("Nishant2");
        eo.setUname("SN22");
        
        Address ao = new Address();
        ao.setCity("bhilai222");
        ao.setState("Chhattisgarh22");
        ao.setCountry("India22");

        eo.setAddress(ao);
        
        // Build session factory only once in real apps
        SessionFactory sf = new Configuration().configure().buildSessionFactory();

        // Use try-with-resources to auto-close session
        try (Session session = sf.openSession()) {
            session.beginTransaction();
            session.save(eo);
            session.getTransaction().commit();
            System.out.println("Employee saved successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sf.close(); // Close factory to release all pooled connections
        }
    }
}
