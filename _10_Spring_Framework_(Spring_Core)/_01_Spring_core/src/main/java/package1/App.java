package package1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ac = new ClassPathXmlApplicationContext("package1/config.xml");
//        Student so =(Student) ac.getBean("s1");
//        System.out.println(so);
        Student student = (Student) ac.getBean("studentBean");
        System.out.println(student);
        
    }
}
