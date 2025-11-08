package package1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EmpTable")
public class Employee {
	@Id
	@Column(name = "EmpId")
	private int 	Emp_id;
	@Column(name = "EmpName")
	private String Emp_Name;
	@Column(name = "EmpCity")
	private String Emp_City;
	public int getEmp_id() {
		return Emp_id;
	}
	public void setEmp_id(int emp_id) {
		Emp_id = emp_id;
	}
	public String getEmp_Name() {
		return Emp_Name;
	}
	public void setEmp_Name(String emp_Name) {
		Emp_Name = emp_Name;
	}
	public String getEmp_City() {
		return Emp_City;
	}
	public void setEmp_City(String emp_City) {
		Emp_City = emp_City;
	}
	@Override
	public String toString() {
		return "Employee [Emp_id=" + Emp_id + ", Emp_Name=" + Emp_Name + ", Emp_City=" + Emp_City + "]";
	}
	public Employee(int emp_id, String emp_Name, String emp_City) {
		super();
		Emp_id = emp_id;
		Emp_Name = emp_Name;
		Emp_City = emp_City;
	}
	public Employee() {
		super();
	}
	
}
