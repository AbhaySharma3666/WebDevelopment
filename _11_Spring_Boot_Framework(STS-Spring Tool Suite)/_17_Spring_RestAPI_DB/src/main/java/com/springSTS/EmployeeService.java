package com.springSTS;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	public List<Employee> getAllEmployee() {
		List<Employee> list = (List<Employee>) this.employeeRepo.findAll();
		return list;
	}
	
	public Employee getEmployeeById(int id) {
		Employee employee = null;
		employee = this.employeeRepo.findById(id);
		return employee;
	}
	
	public Employee addEmployee(Employee e) {
		Employee result = this.employeeRepo.save(e);
		return result;
	}
	
	public void deleteEmployee(int id) {
		this.employeeRepo.deleteById(id);
	}
	
	public void updateEmployee(Employee employee, int employeeid) {
		employee.setId(employeeid);
		this.employeeRepo.save(employee);
	}
}
