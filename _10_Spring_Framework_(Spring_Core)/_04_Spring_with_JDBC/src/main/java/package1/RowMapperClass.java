package package1;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class RowMapperClass implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Employee employee = new Employee();
		employee.setEmpid(rs.getInt(1));
		employee.setName(rs.getString(2));
		employee.setCity(rs.getString(3));
		return employee;
	}

}
