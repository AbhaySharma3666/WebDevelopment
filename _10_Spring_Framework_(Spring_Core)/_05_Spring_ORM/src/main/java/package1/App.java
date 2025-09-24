package package1;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ac = new ClassPathXmlApplicationContext("package1/config.xml");
        EmpDao empDao = ac.getBean("empdao",EmpDao.class);
        
//        Employee employee = new Employee(12,"Abhay","Durg");
//        
//        int result = empDao.insert(employee);
//        System.out.println(result + "Sucess!!!");
        
        BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
        boolean run = true;
        while(run) {
        		System.out.println("Press 1 To Add New Employee Data");
        		System.out.println("Press 2 To Display All Employee Data");
        		System.out.println("Press 3 To Display Single Employee Data");
        		System.out.println("Press 4 To Delete A Employee Data");
        		System.out.println("Press 5 To Exit");
        		System.out.println("===========================================");
        		try {
        			System.out.print("Press Choice : ");
        			int choice=Integer.parseInt(bReader.readLine());
        			switch (choice) {
					case 1:
						System.out.print("Enter Emp Id : ");
						int eId = Integer.parseInt(bReader.readLine());
						System.out.print("Enter Emp Name : ");
						String eName = bReader.readLine();
						System.out.print("Enter Emp City : ");
						String eCity = bReader.readLine();
						
						Employee employee = new Employee();
						employee.setEmp_id(eId);
						employee.setEmp_Name(eName);
						employee.setEmp_City(eCity);
						
						int r = empDao.insert(employee);
						System.out.println(r+" Employee Added!!");
						System.out.println("=================================");
						break;
						
					case 2:
						List<Employee> allData = empDao.getAllData();
						for(Employee e : allData) {
							System.out.println("Id : " + e.getEmp_id());
							System.out.println("Name : " + e.getEmp_Name());
							System.out.println("City : " + e.getEmp_City());
							System.out.println();
						}
						System.out.println("=========================");
						break;
						
					case 3:
						System.out.print("Enter Emp Id : ");
						int eId1 = Integer.parseInt(bReader.readLine());
						Employee singleData = empDao.getSingleData(eId1);
						System.out.println();
						System.out.println("Id : " + singleData.getEmp_id());
						System.out.println("Name : " + singleData.getEmp_Name());
						System.out.println("City : " + singleData.getEmp_City());
						System.out.println("===============================");
						break;
						
					case 4:
						System.out.print("Enter Emp Id : ");
						int eId2 = Integer.parseInt(bReader.readLine());
						empDao.deleteEmp(eId2);
						System.out.println("Delete successfully");
						System.out.println("=========================");
						break;
						
					case 5:
						System.exit(choice);
						break;

					default:
						System.out.println("Invalid choice.. try again.");
					}
        		}catch (Exception e) {
					System.out.println(e.getMessage());
			}
        }
    }
}
