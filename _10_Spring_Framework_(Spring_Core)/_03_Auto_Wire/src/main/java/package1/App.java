package package1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ac = new ClassPathXmlApplicationContext("package1/config.xml");
//        Student s = ac.getBean("student",Student.class);
//        System.out.println(s);
        Employee e = ac.getBean("e1",Employee.class);
        System.out.println(e);
    }
}
