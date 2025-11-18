package com.springSTS;

import java.util.ArrayList;
import java.util.List;

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
}
