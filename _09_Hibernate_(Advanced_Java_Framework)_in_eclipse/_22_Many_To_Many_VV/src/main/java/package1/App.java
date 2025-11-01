package package1;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.setEmp_id(1);
        e1.setEmp_name("Abhay");

        Employee e2 = new Employee();
        e2.setEmp_id(2);
        e2.setEmp_name("Ravi");

        Project p1 = new Project();
        p1.setProject_id(101);
        p1.setProject_name("Bus Tracking System");

        Project p2 = new Project();
        p2.setProject_id(102);
        p2.setProject_name("AI Trading System");

        // Assign projects to employees
        List<Project> e1Projects = new ArrayList<>();
        e1Projects.add(p1);
        e1Projects.add(p2);
        e1.setprojectlist(e1Projects);

        List<Project> e2Projects = new ArrayList<>();
        e2Projects.add(p2);
        e2.setprojectlist(e2Projects);

        // Assign employees to projects
        List<Employee> p1Employees = new ArrayList<>();
        p1Employees.add(e1);
        p1.setEmpl(p1Employees);

        List<Employee> p2Employees = new ArrayList<>();
        p2Employees.add(e1);
        p2Employees.add(e2);
        p2.setEmpl(p2Employees);

        SessionFactory sFactory = new Configuration().configure().buildSessionFactory();
        Session session = sFactory.openSession();
        session.beginTransaction();

        session.save(e1);
        session.save(e2);
        session.save(p1);
        session.save(p2);

        session.getTransaction().commit();
        session.close();

        System.out.println("Successfully created");
    }
}
