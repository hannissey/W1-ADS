
public class TestLifestyle {

	public static void main(String args[]) {
		//Create a lifestyle object 
		Person person1 = new Person();
		
		System.out.println("*********** Health Check *************");
		person1.displayDetails();
		System.out.println();
		person1.checkPulse();
		person1.checkForAbuse();
		

	}
	
}
