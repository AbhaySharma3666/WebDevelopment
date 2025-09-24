package package1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Laptop {

	@Id
	private int lapy_id;
	private String lapy_name;
	
	@ManyToOne
	private Employee emp;
	
	
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	public int getLapy_id() {
		return lapy_id;
	}
	public void setLapy_id(int lapy_id) {
		this.lapy_id = lapy_id;
	}
	public String getLapy_name() {
		return lapy_name;
	}
	public void setLapy_name(String lapy_name) {
		this.lapy_name = lapy_name;
	}
	
}
