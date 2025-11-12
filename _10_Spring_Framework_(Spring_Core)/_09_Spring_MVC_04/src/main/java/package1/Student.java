package package1;

import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

public class Student {

    private String name;
    private String motherName;
    private String fatherName;
    private String gender;
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date dob;
    private String course;
    private String email;
    private Address address;  

    // Getters & Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getMotherName() {
        return motherName;
    }
    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getFatherName() {
        return fatherName;
    }
    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }
    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student "
        				+ "name=" + name + ", "
        				+ "motherName=" + motherName + ", "
        				+ "fatherName=" + fatherName + ", "
        				+ "gender=" + gender + ", "
        				+ "dob=" + dob + ", "
        				+ "course=" + course + ", "
        				+ "email=" + email + ", "
        				+ address ;
    }
}
