package Person;

import Person.Person;
import Person.PersonManager;

public class App {

	public static void main(String[] args) {
//		Creating manager
		PersonManager manager = new PersonManager();
//		Adding people to manager
		manager.addPerson(new Person("Barry", 25, "Plumber"));
		manager.addPerson(new Person("Allen", 52, "Architect"));
		manager.addPerson(new Person("John", 32, "Weapon"));
//		loops through and calls each Person's printDetails method
		manager.displayPeople();
//		Retrieve Person with name of Barry and call its printDetails method
		System.out.println(manager.findByName("Barry").getDetails());
	}

}