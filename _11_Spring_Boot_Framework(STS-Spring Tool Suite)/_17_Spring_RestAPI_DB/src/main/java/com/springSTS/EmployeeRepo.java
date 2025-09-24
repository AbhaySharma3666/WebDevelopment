package com.springSTS;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepo extends CrudRepository<Employee, Integer>{
	
	public Employee findById(int id); 

}
