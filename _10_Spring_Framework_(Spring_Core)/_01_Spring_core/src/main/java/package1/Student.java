package package1;

import java.util.List;
import java.util.Map;

public class Student {
	
	private int roll;
	private String name;
	private List<String> skills;
	private Map<String, String> courses;
	private Address address;
	private String email;
	private Long phone;
	
	public Student(String email, Long phone) {
		this.email = email;
		this.phone = phone;
	}
	
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student Details:\n" +
		           "Roll: " + roll + "\n" +
		           "Name: " + name + "\n" +
		           "Skills: " + skills + "\n" +
		           "Courses: " + courses + "\n" +
		           "Address:\n" + address + "\n" +
		           "Email : " + email + "\n" +
		           "Phone No. : " + phone;
	}
	public Student(int roll, String name, List<String> skills, Map<String, String> courses, Address address) {
		super();
		this.roll = roll;
		this.name = name;
		this.skills = skills;
		this.courses = courses;
		this.address = address;
	}
	public Student() {
		super();
	} 
	
	
	
}
