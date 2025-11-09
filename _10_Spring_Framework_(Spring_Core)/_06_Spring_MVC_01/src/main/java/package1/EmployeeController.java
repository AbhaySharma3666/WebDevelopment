package package1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {
	
	@RequestMapping("indexURL")
	public String hello() {
		System.out.println("Welcome to spring MVC...");
		return "index";
	}
	
	@RequestMapping("contact")
	public String contactUs() {
		System.out.println("Welcome to Contact US.. Page");
		return "ContactUs";
	}
}
