
/**
 * A program to demonstrate what we've learned so far, styled as a Health Check program.
 * 
 * @author Hannah Clarke
 * @version 1.0 : 10/3/2022
 */
public class Person
{
	double cmHeight = 171;
	double kgWeight = 70;
	char gender = 'f';
	boolean smoker = false;
	int weeklyAlcholUnits = 10;
	final int RWAL = 21;   //RWAL - Recommended Weekly Alcohol Limit
	int restPulse = 80;
	boolean desirable = false;

	
	public void checkPulse()
	{
	   boolean healthyPulse;
	   healthyPulse = ((restPulse > 30) && (restPulse < 180));
	   System.out.print("Healthy pulse = ");
	   System.out.println(healthyPulse);
	}
	
	public void checkForAbuse()
	{
	      boolean abuser ;
	      abuser = ((weeklyAlcholUnits > RWAL) || (smoker) );
	      System.out.print("Checking for abuse -- ");
	      System.out.println(abuser);
	
	}
	
	public void checkDesirability()
	{
		if ((cmHeight < 150) && (kgWeight > 100) && smoker && (weeklyAlcholUnits > RWAL))
		{
			desirable = true;
		}
	}

	
	public void displayDetails()
	{
	   System.out.print("Person's Details"
		   + "\n\t" + "Height: " + cmHeight + "cm"
		   + "\n\t" + "Weight: " + kgWeight + "kg"
		);
	   
	   if (gender == 'f')
	   {
		   System.out.println("\n\t" + "Gender: Female");
	   } 
	   else
	   {
		   System.out.println("\n\t" + "Gender: Male");
	   }
	   
	   System.out.print("\t" + "Smoker?: " + smoker
			   + "\n\t" + "Actual Weekly Alcohol Units: " + weeklyAlcholUnits + " units"
			   + "\n\t" + "Recommended Weekly Alcohol Limit: " + RWAL + " units"
			   + "\n\t" + "Resting Pulse: " + restPulse + " bpm"
			   + "\n\t" + "Desirable?: " + desirable
			);
	   
	}
	
}
