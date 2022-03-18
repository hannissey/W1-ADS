

public class TestHilo {

	public static void main(String[] args) {
		System.out.println("Guess The Number Game!" + "\nThe number is between 1 and 10.");
		HiLo h=new HiLo();
		h.generateNumber();
		h.guess();

	}

}
