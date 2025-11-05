package package1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("e1")
public class Employee {
	@Value("123")
	private int empid;
	@Value("Ravi")
	private String name;
	@Value("Raipur")
	private String city;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Employee:- \nempid=" + empid + "\nname=" + name + "\ncity=" + city;
	}
	public Employee(int empid, String name, String city) {
		super();
		this.empid = empid;
		this.name = name;
		this.city = city;
	}
	public Employee() {
		super();
	}
	
	
}
