
/**
 * Exciting demonstrates the declaration and initialisation of variables of different scalar data types.
 * It shows how Java can perform calculations and save the result to a variable, which can then be printed to the screen.
 * Finally, there is also usage of the special escape characters, such as \n and \t to make the output easy to read.
 * 
 * @author Hannah Clarke
 * @version 1.0
 */
public class Exciting
{
    //Put your declarations for a) beneath here 
     double z;
     int count = 0;
     float cost = 3.45f;
     char choice = 'X';
     boolean goodChoice = true;
     short lowest = 5; 

    //Put your declarations and initialisations to b) beneath here 
     double roomTemp = 21.0;
     int jackpot = 27;
     long chinaPop = 1448675310;
     boolean gameOver = true;
     long planetDistance = 1400000000;
     char grade = 'A';
     
    
    
   public void doit()
   {
     double x = 3.0;
     double y = 4.0;
     z = 2.0 * y + x/4.0 - (x + y ) ;
   }    
   
   public void displayDetails() 
   {
	   System.out.print("z= ");
	   System.out.println (z);
	   
	   
	   //display the details for the variables you declared in a)
	   System.out.print("The variables declared in Part A are displayed here: "
		   + "\n\n\t" + "The double variable z is " + z
		   + "\n\t" + "The integer variable count is " + count
		   + "\n\t" + "The float variable cost is " + cost
		   + "\n\t" + "The char variable choice is " + choice
		   + "\n\t" + "The boolean variable goodChoice is " + goodChoice
		   + "\n\t" + "The short variable lowest is " + lowest
	   );
	   System.out.println();

   }
   
   public void displayDetailsB()
   {   
	   //display the details for the variables you declared in b)
	   System.out.print("The variables declared in Part B are displayed here: "
			   + "\n\n\t" + "The temperature in a room is " + roomTemp
			   + "\n\t" + "The number of the jackpot bonus ball is " + jackpot
			   + "\n\t" + "The population of China as of 2020 is " + chinaPop
			   + "\n\t" + "To check whether a game is finished or not displays " + gameOver
			   + "\n\t" + "A variable to hold interplanetary distances displays " + planetDistance
			   + "\n\t" + "A variable to hold an A-level grade displays " + grade
		   );	   
   }
    
}

	   
    
 