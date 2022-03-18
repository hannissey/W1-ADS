 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DrawingArea extends JPanel {
 
     // You only need to edit the method below.
    public void paintComponent(Graphics g) {
      super.paintComponent(g);
      
      // the size of the circle
      int size = 350;
      // the color (this is blue, believe it or not, play around with different values)
      int icol = 255;
      Color c = new Color(icol);
      g.setColor(c);      

      
      // You might want to introduce a loop somewhere here.
      for (int i = 0; i < 10; i++)
      {
    	  g.drawOval(200-size/2,200-size/2,size,size);
    	  size = size -20;
      }
      

      for (int i = 0; i < 10; i++)
      {
    	  int random1 = (int) (Math.random() * 500);
    	  int random2 = (int) (Math.random() * 1);
    	  
    	  int random3 = (int) (Math.random() * 400);
    	  int random4 = (int) (Math.random() * 1);
    	  
    	  g.drawOval(random1-size/4,random3-size/4,size,size);
    	  size = size -random1;
      }
      
      

      
    }// the end of the method....
}