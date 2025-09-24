package package1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Controller_Class {
	
    // Home page
	@RequestMapping("/") 
	public String starting(Model m) {
		m.addAttribute("text","Main link :- '..../_08_Spring_MVC_03/'");
		return "initial";
	}
	
    // Show form
	@RequestMapping("form") 
	public String showForm() {
		return "index";
	}

    // Handle form submission
	@RequestMapping(path = "/showresult", method = RequestMethod.POST)
	public String handleForm(
	        @RequestParam("firstName") String firstName,
	        @RequestParam("lastName") String lastName,
	        @RequestParam("motherName") String motherName,
	        @RequestParam("fatherName") String fatherName,
	        @RequestParam("gender") String gender,
	        @RequestParam("dob") String dob,
	        @RequestParam("email") String email,
	        @RequestParam("address") String address,
	        @RequestParam("state") String state,
	        @RequestParam("city") String city,
	        @RequestParam("pincode") String pinCode,
	        @RequestParam("course") String course,
	        Model model) 
	{
	    // Add all form values to model
		model.addAttribute("fullName", firstName + " " + lastName);
	    model.addAttribute("motherName", motherName);
	    model.addAttribute("fatherName", fatherName);
	    model.addAttribute("gender", gender);
	    model.addAttribute("dob", dob);
	    model.addAttribute("email", email);
	    model.addAttribute("address", address);
	    model.addAttribute("state", state);
	    model.addAttribute("city", city);
	    model.addAttribute("pinCode", pinCode);
	    model.addAttribute("course", course);

	    return "showResult";
	}
}
