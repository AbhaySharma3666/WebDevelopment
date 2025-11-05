	package package1;
	
	import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
	
	public class Student {
		private String name;
		
		@Autowired  // automatic connect with [address , address2] throw error 
		@Qualifier("address2") // solve which one take 
		
		private Address address ;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Address getAddress() {
			return address;
		}
		public Student() {
			super();
		}
		public void setAddress(Address address) {
			this.address = address;
		}
		@Override
		public String toString() {
			return "Student :- \nname=" + name + "\naddress=" + address ;
		}
		
		
	}
