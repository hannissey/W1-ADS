
public class TestSavingsAccount {

	public static void main(String[] args) {
		/* Create SavingsAccount object and 
		 * call the methods
		 */
		SavingsAccount account1 = new SavingsAccount();
		
		account1.initialiseAccountDetails();
		account1.deposit();
		account1.printStatement();
		account1.withdraw();
		account1.printStatement();	
	}
}