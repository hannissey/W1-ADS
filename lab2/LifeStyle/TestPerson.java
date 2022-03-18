
public class TestPerson {

	public static void main(String[] args) {
		//create Person object here
		Person desirablePerson = new Person();
		
		// change all relevant attributes to meet desirability requirements
		desirablePerson.cmHeight = 100;
		desirablePerson.kgWeight = 150;
		desirablePerson.smoker = true;
		desirablePerson.weeklyAlcholUnits = 50;

		// checks if person meets requirements for desirability
		desirablePerson.checkDesirability();
		
		System.out.println("*********** Testing Desirablity *************");
		desirablePerson.displayDetails();
		// desirable should show as true
		
	}

}
