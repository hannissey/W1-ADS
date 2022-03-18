
/**
 * A class which demonstrates the usage of float and int data types,
 * and how Java can perform calculations using variables and output the result
 * 
 * @author Hannah Clarke 
 * @version 1.0 : 10/3/2022
 */
public class Amazing
{
   //Put your data type declarations below. Here is an example
    float x = 2.5f;
    float y = -1.5f;
    int m = 18;
    int n = 4;
     

//Put the code for your calculations in this method.   
   void doCalculations()
   {
	   System.out.print("The calculations in the source code are automatically calculated and output by the program."
			   + "\nFor example, the line below here contains a sum: x + n * y - (x + n) * y"
			   + "\nBecause there is a value stored in each variable, Java will use these values to formulate the sum: "
			   + "2.5 + 4 * -1.5 - (2.5 + 4) * 1.5 "
			   + "and then calculate the answer which is: "
			   );
	   System.out.println(x + n * y - (x + n) * y);
	   System.out.print("\nThe answer to m / n + m % n is: ");
	   System.out.println(m / n + m % n);
	   System.out.print("\nThe answer to 5 * x - n / 5 is: ");
	   System.out.println(5 * x - n / 5);
       
   }//End of doCalculations
}
