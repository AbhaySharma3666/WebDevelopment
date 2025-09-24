package package1;

import java.util.List;

public interface EmployeeDao {
	public int insert(Employee employee);
	
	public int edit(Employee employee);
	
	public int delete(int id);
	
	public Employee getEmployee(int id);
	
	public List<Employee> getAllEmployees();
}
