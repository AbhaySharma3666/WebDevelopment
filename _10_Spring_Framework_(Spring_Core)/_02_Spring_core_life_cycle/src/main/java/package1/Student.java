package package1;

public class Student {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}

	public Student(String name) {
		super();
		this.name = name;
	}

	public Student() {
		super();
	}
	public void init() {
		System.out.println("I'm in an init method");
	}
	public void destory() {
		System.out.println("I'm in destory method");
	}

	
	
}
