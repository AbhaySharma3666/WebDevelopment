package package1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StudentController {

    // Show registration form
	@RequestMapping("/") 
	public String starting(Model m) {
		m.addAttribute("text","Main link :- '..../_09_Spring_MVC_04/'");
		return "initial";
	}
	
	// Show registration form
    @RequestMapping("/register")
    public String showForm(Model model) {
        model.addAttribute("student", new Student());
        return "studentregistration";   // studentregistration.jsp
    }

    // Handle form submission
    @RequestMapping(value="/showresult", method=RequestMethod.POST)
    public String submitForm(@ModelAttribute("student") Student student, BindingResult result) {
    	if (result.hasErrors()) {
			return "studentregistration";
			
		}
    	System.out.println(student);
        return "showresult"; 
    }
}
