package package1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class State {
	@Id 
	private int s_id;
	private String s_name;
	
	@OneToOne
	private Capital c;
	
	public Capital getC() {
		return c;
	}
	public void setC(Capital c) {
		this.c = c;
	}
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	
	
}
