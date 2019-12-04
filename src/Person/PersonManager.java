package Person;

import java.util.ArrayList;
import java.util.List;

import Person.Person;

public class PersonManager {

	private List<Person> people = new ArrayList<>();

	public boolean addPerson(Person person) {
		return this.people.add(person);
	}
	
	public void displayPeople() {
		for (Person p : people) {
			System.out.println(p.getDetails());
		}
	}
	
	public Person findByName(String name) {
		for (Person p : this.people) {
			if (p.getName().equals(name)) {
				return p;
			}
		}
		return null;
	}
}
		
	

