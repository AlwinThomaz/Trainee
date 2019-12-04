package Person;

public class Person {

	private String name;
	private int age;
	private String jobTitle;

	public Person() {
	}

	public Person(String name, int age, String jobTitle) {
		super();
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}

	public String getDetails() {
		return "Name: " + this.name + "\n" 
				+ "Age: " + this.age + "\n" 
				+ "Job Title: " + this.jobTitle;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

}