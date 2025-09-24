package curd;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id 
	@GeneratedValue
	private int emo_id;
	public int getEmo_id() {
		return emo_id;
	}
	public void setEmo_id(int emo_id) {
		this.emo_id = emo_id;
	}
	public String getEmo_fname() {
		return emo_fname;
	}
	public void setEmo_fname(String emo_fname) {
		this.emo_fname = emo_fname;
	}
	public String getEmo_lname() {
		return emo_lname;
	}
	public void setEmo_lname(String emo_lname) {
		this.emo_lname = emo_lname;
	}
	public String getEmo_city() {
		return emo_city;
	}
	public void setEmo_city(String emo_city) {
		this.emo_city = emo_city;
	}
	private String emo_fname;
	private String emo_lname;
	private String emo_city;
	
}
