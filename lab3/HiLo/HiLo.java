/*
 * @author Tommy Yuan
 * The purpose is to practise the use of if statement.
 * 
 * */


import java.util.*;

public class HiLo {
    
     int random;
    
    public void generateNumber() 
    {
       //The following lines generate and output a random number between 1 and 10
        random = (int)(Math.random()*10)+1;
    }
    
   //Write the guess() method below 
   public void guess()
   {
	   //Use scanner to accept a user input 
	   //Create a new scanner object to receive user input
	      Scanner sc=new Scanner(System.in);
	      // initialise with a number random could not be
	      int guess = -1;
	      
	      do {
		      System.out.println("Enter your guess: ");
		      guess = sc.nextInt();
		      
		      //write your code below
		      if (guess < random)
		      {
		    	  System.out.println("Low");
		      }
		      if (guess == random )
		      {
		    	  System.out.println("Hit");
		      }
		      else if (guess > random) 
		      {
		    	  System.out.println("High");  
		      }
		      
	      } while (guess != random);
	      // Just checking:
	      System.out.println("The answer is = " + random);

	   
   }
   
    
}
 