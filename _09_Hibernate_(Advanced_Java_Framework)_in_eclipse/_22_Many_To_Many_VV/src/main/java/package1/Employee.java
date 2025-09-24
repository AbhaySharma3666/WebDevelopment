package package1;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Employee {

	@Id
	private int Emp_id;
	private String Emp_name;
	
	@ManyToMany
	private List<Project> projectlist;
	
	
	public List<Project> getprojectlist() {
		return projectlist;
	}
	public void setprojectlist(List<Project> projectlist) {
		this.projectlist = projectlist;
	}
	public int getEmp_id() {
		return Emp_id;
	}
	public void setEmp_id(int emp_id) {
		Emp_id = emp_id;
	}
	public String getEmp_name() {
		return Emp_name;
	}
	public void setEmp_name(String emp_name) {
		Emp_name = emp_name;
	}
	
	
}
