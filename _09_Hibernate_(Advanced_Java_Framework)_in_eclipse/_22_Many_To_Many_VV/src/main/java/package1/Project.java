package package1;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	
	@Id
	private int Project_id;
	private String Project_name;
	
	@ManyToMany
	private List<Employee> empl;
	
	
	
	
	public List<Employee> getEmpl() {
		return empl;
	}
	public void setEmpl(List<Employee> empl) {
		this.empl = empl;
	}
	public int getProject_id() {
		return Project_id;
	}
	public void setProject_id(int project_id) {
		Project_id = project_id;
	}
	public String getProject_name() {
		return Project_name;
	}
	public void setProject_name(String project_name) {
		Project_name = project_name;
	}
	
	
	
}
