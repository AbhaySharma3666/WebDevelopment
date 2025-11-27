package com.springSTS;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("getData")
	public List<Employee> getAll(){
		return this.employeeService.getAllEmployee();
	}
	
	@GetMapping("getData/{id}")
	public Employee getSinglEmployee(@PathVariable("id") int id) {
		return this.employeeService.getEmployeeById(id);
	}
	
	@PostMapping("getData")
	public Employee addEmployee(@RequestBody Employee employee) {
		Employee e = this.employeeService.addEmployee(employee);
		System.out.println(e);
		return e;
 	}
	
	@DeleteMapping("getData/{employeeId}")
	public void deleteData(@PathVariable("employeeId") int employeeId) {
		this.employeeService.deleteEmployee(employeeId);
	}
	
	@PutMapping("getData/{employeeId}")
	public Employee updatEmployee(@RequestBody Employee employee, @PathVariable("employeeId") int employeeId) {
		this.employeeService.updateEmployee(employee, employeeId);
		return employee;
	}
}
