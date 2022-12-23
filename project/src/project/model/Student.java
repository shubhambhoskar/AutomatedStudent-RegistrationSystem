package project.model;
/**
 * 
 * @author Shubham
 *This is the Student class . While creating the object it ask for the parameter to take from the user.
 */
public class Student {

	private int roll;
	private String name;
	private String address;
	private String email;
	private String password;
	
	/**
	 * Zero argument Constructor
	 */
	public Student() {
		
	}
	
	
	public Student(int roll, String name, String address, String email, String password) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.email = email;
		this.password = password;
	}
/**
 * These are getter setter methods
 * 
 */
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
/**
 * This is the toString method. It will represent the object as a string.   
 */
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", address=" + address + ", email=" + email + ", password="
				+ password + "]";
	}
}
