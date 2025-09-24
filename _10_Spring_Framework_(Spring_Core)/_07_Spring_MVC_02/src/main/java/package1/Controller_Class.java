package package1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controller_Class {
	
	@RequestMapping("/")
	public String starting(Model m) {
		m.addAttribute("text","In url '...._07_Spring_MVC_02/myurl");
		return "stater";
	}

	@RequestMapping("myurl")
	public String hello(Model m) {
		m.addAttribute("name","Spring Web World");
		m.addAttribute("Id", 101);
		
		List<String> city = new ArrayList<String>();
		city.add("Pune");
		city.add("Mumbai");
		city.add("Goa");
		city.add("Nagpur");
		city.add("Delhi");
		
		m.addAttribute("cities",city);
		return "index";
	}
	
	
}
