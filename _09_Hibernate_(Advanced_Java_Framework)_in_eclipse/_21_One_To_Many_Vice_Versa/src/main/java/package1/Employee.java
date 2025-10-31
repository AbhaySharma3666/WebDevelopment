package package1;



import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Employee {
	
	@Id
	private int Emp_id;
	private String emp_name;
	
	@OneToMany
	private List<Laptop> lapts;
	
	
	
	public List<Laptop> getLapts() {
		return lapts;
	}
	public void setLapts(List<Laptop> lapts) {
		this.lapts = lapts;
	}
	public int getEmp_id() {
		return Emp_id;
	}
	public void setEmp_id(int emp_id) {
		Emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	
	

}
