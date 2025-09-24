package package1;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("package1/config.xml");

        EmployeeImplementation e = ac.getBean("empImp",EmployeeImplementation.class);
        
        Employee eo = new Employee();
        
        //insert
//        eo.setEmpid(124);
//        eo.setName("Max");
//        eo.setCity("Goa");
//        
//        int r = e.insert(eo);
//        System.out.println(r + "Data inserted successfully");
        
        
        // Update 
//        eo.setEmpid(12);
//        eo.setName("Anu");
//        eo.setCity("Mumbai");
//        int r = e.edit(eo);
//        System.out.println(r + " successfully update");
        
        
        //delete
//        int r = e.delete(12);
//        System.out.println(r + " successfully deleted");
        
        // single data
//        Employee r = e.getEmployee(124);
//        System.out.println("successfully fetch\n" + r);
        
        // all data fetch
        List<Employee> allData = e.getAllEmployees();
        for (Employee e1 : allData) {
        		System.out.println(e1);
        }
        
    }
}
