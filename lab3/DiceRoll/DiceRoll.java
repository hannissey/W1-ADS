import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class DiceRoll extends JPanel
{
    private int firstDice;		// to hold the value for the first dice
	private int secondDice;		// to hold the value for the second dice
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
		firstDice  = (int) (Math.random() * 6) + 1; // get a value for the first dice
		secondDice = (int) (Math.random() * 6) + 1; //get a value for the second dice

		// draw the dice squares
		g.setColor(Color.blue);
		g.fillRect(20, 20, 60, 60);
		g.setColor(Color.magenta);
		g.fillRect(120, 20, 60, 60);
		// put the values on the dice
		g.setColor(Color.white);
		g.drawString(" " + firstDice, 43, 54);
		g.drawString(" " + secondDice, 143, 54);
		// write the values under the dice
		g.setColor(Color.black);
		g.drawString("First dice = " + firstDice, 20, 100); 
		g.drawString("Second Dice = " + secondDice, 120, 100); // print out the dice values

//		// TASK 1
//		// print out a statement if user gets a win
//		boolean win = firstDice == secondDice;
//
//		if (win)
//		{
//			g.drawString("Win!", 20, 150);
//		}
//		else
//		{
//			g.drawString("Sorry, try again!", 20, 150);
//		}
//		
//		// TASK 2
//		// print out win if both dice are greater than 3
//		
//		if ((firstDice > 3) && (secondDice > 3))
//		{
//			g.drawString("Win!", 20, 150);
//		}
//		else
//		{
//			g.drawString("Sorry, try again!", 20, 150);
//		}
//		
//		// TASK 3
		// print out 'you win' if both dice show a 6
//		if ((firstDice == 6) || (secondDice == 6))
//		{
//			g.drawString("You win, roll again.", 20, 150);
//		}
//		else
//		{
//			g.drawString("You lost - try again.", 20, 150);
//		}
		
		// TASK 4
		// print out Bonus Throw is the sum of both die is 7
		if ((firstDice + secondDice) == 7)
		{
			g.drawString("Bonus throw - roll again.", 20, 150);
		}
		else
		{
			g.drawString("Sorry, try again!", 20, 150);
		}
		
   }
}


