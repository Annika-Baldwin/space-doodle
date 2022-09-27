/**
 * Doodle.java
 * Assignment: Project: 3 Café Wall part A
 * Purpose: This assignment focuses on for loops, parameters, and graphics,  
 *   as well as using the DrawingPanel, Graphics and Color classes.
 *
 * @version 02/25/21
 */

import java.awt.*;

public class Doodle {

   //draws a spaceship
   public static void main(String[] args) {
      DrawingPanel panel = new DrawingPanel(400, 400);
      Color DARKBLUE = new Color(0, 0, 100);
      panel.setBackground(DARKBLUE);
      Graphics g = panel.getGraphics();
      g.setColor(Color.CYAN);
      g.fillOval(100, 125, 200, 150);
      g.setColor(Color.WHITE);
      g.drawLine(225, 250, 300, 400);
      g.drawLine(175, 250, 100, 400);
      g.setColor(Color.GRAY);
      g.fillOval(50, 200, 300, 100);
      g.setColor(Color.YELLOW);
      for (int i = 0; i <= 5; i++) {
         g.fillOval(i * 50 + 65, 240, 20, 20);
      }
   }
}