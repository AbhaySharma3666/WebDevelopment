package com.springSTS;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

//	@GetMapping("/")
//	public Employee data() {
//		Employee e1 = new Employee();
//		e1.setId(1);
//		e1.setName("Abhay");
//		e1.setCity("Durg");
//		
//		return e1;
//	}
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/")
	public List<Employee> empdata(){
		return this.employeeService.getAllEmployee();
	}
}
