package seris;

import java.io.Serializable;

public class Student implements Serializable {
	private String name;
	transient private String email;
	private String address;
	
	public Student(String name, String email, String address) {
		this.name=name;
		this.email=email;
		this.address=address;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	
	public void display() {
		System.out.println("Hello my name is "+ this.name);
		System.out.println("Hello my email is "+ this.email);
		System.out.println("Hello my address is "+ this.address);
		
	}
	
	
}
