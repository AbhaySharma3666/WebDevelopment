package package1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext ac = new ClassPathXmlApplicationContext("package1/config.xml");
        Student student = ac.getBean("student",Student.class);
        System.out.println(student);
        ac.registerShutdownHook();
    }
}
