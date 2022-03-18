
/**
 * The ForLoopTest outputs a statement suffixed with the value of i, which is incremented with each iteration.
 * 1. Modify the class to print the numbers in reverse order....
 * 2. How could you modify the code above to start at 0 and stop at 9,
 *    rather than starting at 1 and stopping at 10?
 * @author Hannah Clarke 
 * @version 1 : 11/03/22
 */
public class ForLoopTest
{  
    public void displayNumbers()
    {
        
        for (int i=0;i<=9;i++)
        {
            System.out.println("the value of i is " +i);
        }
    }
    
    //Test in the same class as the class being tested
    public static void main(String args[])
    {
    	//Create ForLoopTest instance and call the method
        ForLoopTest f=new ForLoopTest();
    	f.displayNumbers();
    	
    }
}
