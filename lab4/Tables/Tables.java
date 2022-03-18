public class Tables  {
    
    public void generateTable()  
    {
      //Put the code for your times-table here
    	int timestable = 12;
    	// The outer loop
    	for (int row = 1; row <= timestable; row++)
    	{
    		for (int col = 1; col <= timestable; col++)
    		{
    			System.out.print((col * row) + " " );	
    		}
    	System.out.println();
    	}
    
    }
}
