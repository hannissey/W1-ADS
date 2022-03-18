
/**
 * A program to demonstrate the Switch statement.
 * 
 * @author Hannah Clarke
 * @version 2 : 11/03/22
 */
public class Person
{
	double cmHeight;
	double kgWeight;
	boolean smoker = true;
	int weeklyAlcoholUnits = 50; // 1 pint = 2 units, 1 short = 1 unit)
	final int RWAL = 21;   //RWAL - Recommended Weekly Alcohol Limit
	int restPulse;
	int random = -1;

	public boolean checkPulse()
	{
	   boolean healthyPulse;
	   healthyPulse = ((restPulse > 30) && (restPulse < 180));
	   return healthyPulse;
	}
	
	public boolean checkAbuser()
	{
	      boolean abuser ;
	      abuser = ((weeklyAlcoholUnits > RWAL) || (smoker) );
	      return abuser;
	}
	
	public void displayProfile()
	{
	   System.out.println("………Health Profile……");
	   
	   System.out.println("Healthy pulse check = " + checkPulse());
	   System.out.print("Abusing Body = " + checkAbuser());
	   
	}
	
	//Put curseAndSwear method here
	public void curseAndSwear()
	{
		random = (int)(Math.random()*5)+1;
		// Checking correct numbers are output
		// System.out.println(random);
		
		switch (random)
		{
		case 1 : System.out.println("\"Goddamnit!\"");
		break;
		case 2 : System.out.println("\"Son of a werewolf!\"");
		break;
		case 3 : System.out.println("\"Bloomin' hell\"");
		break;
		case 4 : System.out.println("\"Oh crumpets.\"");
		break;
		case 5 : System.out.println("\"Blistering barnacles!\"");
		break;
		
		}
		
	}
	
	
}
