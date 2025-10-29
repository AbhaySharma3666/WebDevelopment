package package1;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Emp_Table") // Use this to set actual DB table name
public class Employee {

    @Id 
    @GeneratedValue
    private int Emp_id;

    @Column(name = "First_Name")
    private String fname;

    @Column(name = "Last_Name")
    private String lname;

    @Column(name = "User_Name")
    private String uname;

    @Embedded
    private Address address;
    
    
    
    public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	// Getters and Setters
    public int getEmp_id() {
        return Emp_id;
    }
    public void setEmp_id(int emp_id) {
        Emp_id = emp_id;
    }
    public String getFname() {
        return fname;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }
    public String getLname() {
        return lname;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }
    public String getUname() {
        return uname;
    }
    public void setUname(String uname) {
        this.uname = uname;
    }
}
