
/**
 * 
 * @author Hannah Clarke
 * @version 1.0 : 10/03/2022
 */
public class boolOp
{
    //Put your data type declarations here - I have put bresult there to hold the results 
    // of your calculations (see the Boolbag example)
      boolean bresult;
      boolean finished = false;
      int m = 3;
      int n = 8;


/* Put the code for your calculations in this method.
 * The result of the expression should be calculated and assigned to 'bresult'
 */
   void a_boolOperation()
   {
	   System.out.print( "( n > m) && ( m < -2) is ");
	   System.out.println(( n > m) && ( m < -2)); 
	   System.out.print( "(m > 5) || ! (finished) is ");
	   System.out.println((m > 5) || ! (finished));
	   System.out.print( "!(n < 5) && !(finished) is ");
	   System.out.println(!(n < 5) && !(finished));
  
   }
    
	
}
