package OOP;

public class App {

	public static void main(String[] args) { //when you do static you don't do OOP
		Trainee luke = new Trainee(21, "Luke");
		luke.setAge(21);
		luke.setName("Luke");
		//luke.name = "Luke";
		//luke.age = 21;
		luke.printDetails(); //not static - accessing this from a different class not within itself as 
		//normal static, where in static you only access it in that class nowhere else
		Trainee liam = new Trainee(24, "Liam");
		luke.setAge(24);
		luke.setName("Liam");
		//liam.age = 24;
		//liam.name = "Liam"; //dont need this here anymore due to constructor
		liam.printDetails();
		
	}
}
