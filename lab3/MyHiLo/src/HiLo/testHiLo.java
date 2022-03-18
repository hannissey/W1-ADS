package HiLo;

public class testHiLo {

	public static void main(String[] args) {
		System.out.println("Guess The Number Game!" + "\nThe number is between 1 and 100.");
		hiLo h=new hiLo();
		h.generateNumber();
		//h.guess();
		h.startGuessing();
	}

}
