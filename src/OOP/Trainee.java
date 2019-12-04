package OOP;

import java.util.Date;

public class Trainee {  //create the class
	
	private int age;  //private variables can only be accessed inside this class
	private String name;
	private Date dob;
	
	public int getAge() {
		return this.age;
		
	}
	void setAge(int age) {
		if (age > 0 && age < 130) {
			this.age = age;
		}
	}
	
	public String getName() {
		return this.name;
		
	}
	void setName(String name) {
			this.name = name;
		}
	
	
	public Trainee(int age, String name) { // this is the constructor
		this.age = age;
		this.name = name;
	}
	public Trainee() {    //creates new constructor without any variables
	
	}
	
	public void printDetails() {
		System.out.println("Age: " + this.age);
		System.out.println("Name: " + this.name);
	}
	
	
	public void breathe() {
		System.out.println("#sigh#");
		
	}

}
