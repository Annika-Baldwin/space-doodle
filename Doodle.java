/**
 * Doodle.java
 * Assignment: Project: 3 Café Wall part A
 * Purpose: This assignment focuses on for loops, parameters, and graphics,  
 *   as well as using the DrawingPanel, Graphics and Color classes.
 *
 * @version 02/25/21
 */

import java.awt.*;
import java.lang.math.Random;

public class Doodle {
   
   
   private static drawSpaceShip() {
      DrawingPanel panel = new DrawingPanel(2000, 2000);
      panel.setBackground(DARKBLUE);
      Graphics g = panel.getGraphics();
      
       Random rand = new Random();
 
      for (int i = 0; i < 3; i++) {
         int xcoord = rand.nextDouble();
         int ycoord = rand.nextDouble();
         
         Color DARKBLUE = new Color(0, 0, 100);
         g.setColor(Color.CYAN);
         g.fillOval(100*xcoord, 125*ycoord, 200, 150); //first two coords are location
         g.setColor(Color.WHITE);
         g.drawLine(225*xcoord, 250*ycoord, 300*xcoord, 400*ycoord); //pt1, pt2
         g.drawLine(175*xcoord, 250*ycoord, 100*xcoord, 400*ycoord);
         g.setColor(Color.GRAY);
         g.fillOval(50*xcoord, 200*ycoord, 300, 100);
         g.setColor(Color.YELLOW);
         
         for (int i = 0; i <= 5; i++) {
            g.fillOval((i * 50 + 65)*xcoord, 240*ycoord, 20, 20);
         }
      }
      
      
   }

   //draws a spaceship
   public static void main(String[] args) {
      Doodle.drawSpaceShip();
   }
}
