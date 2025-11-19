package com.springSTS;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

@Component
public class EmployeeService {
	
	private static List<Employee> list = new ArrayList<>();
	
	static {
		list.add(new Employee(1,"Ravi","Bhilai"));
		list.add(new Employee(2,"Golu","Raipur"));
		list.add(new Employee(3,"Sonu","Bhilai"));
		list.add(new Employee(4,"ladu","Raipur"));
		list.add(new Employee(5,"Moco","Bhilai"));
		list.add(new Employee(6,"UT","Bhopal"));
		list.add(new Employee(7,"lucky","Bhopal"));
		list.add(new Employee(8,"Vicky","Raipur"));
		list.add(new Employee(9,"Mega","Bhilai"));
		list.add(new Employee(10,"Indu","Raipur"));
		list.add(new Employee(11,"Navika","Raipur"));
		list.add(new Employee(12,"Shweta","Bhilai"));
	}
	
	public List<Employee> getAllEmployee() {
		return list;
	}
	
	public Employee getEmployeeById(int id) {
		Employee employee = null;
		employee = list.stream().filter(s->s.getId()==id).findFirst().get();
		return employee;
	}
	
	public Employee addEmployee(Employee e) {
		list.add(e);
		return e;
	}
	
	public void deleteEmployee(int id) {
		list = list.stream().filter(employee->employee.getId()!=id).collect(Collectors.toList());
	}
	
	public void updateEmployee(Employee employee, int employeeid) {
		list=list.stream().map(e->{
			if(e.getId()==employeeid) {
				e.setName(employee.getName());
				e.setCity(employee.getCity());
			}
			return e;
		}).collect(Collectors.toList());
	}
}
