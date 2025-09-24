package package1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Capital {

	@Id
	private int c_id;
	private String c_name;
	
	@OneToOne
	private State s;
	
	
	public State getS() {
		return s;
	}
	public void setS(State s) {
		this.s = s;
	}
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	
	
}
