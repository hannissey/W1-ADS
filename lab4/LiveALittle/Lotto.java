
/**
 * This program uses repetition to generate and display 6 random numbers for the National Lottery.
 * 
 * @author Hannah Clarke
 * @version 1 : 11/03/22
 */
public class Lotto
{
	
	//Put the luckyDip() method here
	public void luckyDip()
	{
		   int random;

		   System.out.println("*** Winning Numbers ***");
		   for (int i = 0; i < 6; i++)
		   {
			   random = (int)(Math.random()*49)+1;
			   System.out.println("Ball " + (i+1) + " = " + random);
		   }
	}


    //Test
	public static void main (String args[]) {
		Lotto l = new Lotto();
		l.luckyDip();
	}

	
}
