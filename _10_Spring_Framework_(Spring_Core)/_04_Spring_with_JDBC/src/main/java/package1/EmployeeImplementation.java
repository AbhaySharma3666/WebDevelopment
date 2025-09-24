package package1;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeImplementation implements EmployeeDao{

	private JdbcTemplate jTemplate;
	
	public JdbcTemplate getjTemplate() {
		return jTemplate;
	}

	public void setjTemplate(JdbcTemplate jTemplate) {
		this.jTemplate = jTemplate;
	}

	@Override
	public String toString() {
		return "EmployeeImplementation [jTemplate=" + jTemplate + "]";
	}

	public EmployeeImplementation(JdbcTemplate jTemplate) {
		super();
		this.jTemplate = jTemplate;
	}

	public EmployeeImplementation() {
		super();
	}

	@Override
	public int insert(Employee employee) {
		String q = "INSERT INTO employeetable (id, name, city) VALUES (?, ?, ?)";
        int result = this.jTemplate.update(q, employee.getEmpid(), employee.getName(), employee.getCity());
		return result;
	}

	@Override
	public int edit(Employee employee) {
		String q = "UPDATE employeetable set name=?, city=? where id=?";
		int result = this.jTemplate.update(q,employee.getName(), employee.getCity(),employee.getEmpid());
		return result;
	}

	@Override
	public int delete(int id) {
		String q = "delete from employeetable where id=?";
		int result = this.jTemplate.update(q,id);
		return result;
	}

	@Override
	public Employee getEmployee(int id) {
		String q = "select * from employeetable where id=?";
		RowMapper<Employee> rowmap = new RowMapperClass();
		Employee employee = this.jTemplate.queryForObject(q, rowmap, id);
		return employee;
	}

	@Override
	public List<Employee> getAllEmployees() {
		String q = "select * from employeetable";
		List<Employee> query = this.jTemplate.query(q,new RowMapperClass());
		return query;
	}
	
}
