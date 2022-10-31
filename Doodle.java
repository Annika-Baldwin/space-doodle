
/**
 * Doodle.java
 * Assignment: Learn Git: Create two issues
 * Purpose: learn how to use GitHub
 *
 * @version 10/31/22
 */
//test


import java.awt.*;
import java.util.Random;

public class Doodle {

private static void drawSpaceShip(int n) {
DrawingPanel panel = new DrawingPanel(2000, 2000);

Color DARKBLUE = new Color(0, 0, 100);
panel.setBackground(DARKBLUE);
Graphics g = panel.getGraphics();

Random rand = new Random();
int i = 0;

  while (i < n) {
     int xcoord = rand.nextInt(2000);
     int ycoord = rand.nextInt(2000);

     g.setColor(Color.CYAN);
     g.fillOval(xcoord, ycoord, 200, 150);
     g.setColor(Color.WHITE);
     g.drawLine(xcoord+20, ycoord, xcoord+95, ycoord+150);
     g.drawLine(xcoord-20, ycoord, xcoord-95, ycoord+150);
/**
 * Doodle.java
 * Assignment: Learn Git: Create two issues
 * Purpose: learn how to use GitHub
 *
 * @version 10/31/22
 */
//test


import java.awt.*;
import java.util.Random;

public class Doodle {

private static void drawSpaceShip(int n) {
DrawingPanel panel = new DrawingPanel(2000, 2000);

Color DARKBLUE = new Color(0, 0, 100);
panel.setBackground(DARKBLUE);
Graphics g = panel.getGraphics();

Random rand = new Random();
int i = 0;

  while (i < n) {
     int xcoord = rand.nextInt(2000);
     int ycoord = rand.nextInt(2000);

     g.setColor(Color.CYAN);
     g.fillOval(xcoord, ycoord, 200, 150);
     g.setColor(Color.WHITE);
     g.drawLine(xcoord+20, ycoord, xcoord+95, ycoord+150);
     g.drawLine(xcoord-20, ycoord, xcoord-95, ycoord+150);
     g.setColor(Color.GREEN);  //alien
      g.fillOval(xcoord + 175,ycoord + 150,50,50);
      g.drawLine(xcoord + 200,ycoord + 125,xcoord + 200, 175); //antenna
      g.drawLine(xcoord + 150,ycoord + 150,xcoord + 200, 175);
      g.drawLine(xcoord + 250,ycoord + 150,xcoord + 200, 175);
      g.setColor(Color.BLACK); //eyes
      g.fillOval(xcoord + 180,ycoord + 160,7,7);
      g.fillOval(xcoord + 196,ycoord + 152,7,7);
      g.fillOval(xcoord + 213,ycoord + 160,7,7);
     g.setColor(Color.GRAY);
     g.fillOval(xcoord, ycoord+80, 300, 100);
     g.setColor(Color.YELLOW);

     for (int j = 0; j <= 5; j++) {
        g.fillOval(j*60 + xcoord-120, ycoord+80, 20, 20);
     }
     i++;
    }
  }



//draws a spaceship
public static void main(String[] args) {
int n = 3;
Doodle.drawSpaceShip(n);
}

    
}

     g.setColor(Color.GRAY);
     g.fillOval(xcoord, ycoord+80, 300, 100);
     g.setColor(Color.YELLOW);

     for (int j = 0; j <= 5; j++) {
        g.fillOval(j*60 + xcoord-120, ycoord+80, 20, 20);
     }
     i++;
    }
  }



//draws a spaceship
public static void main(String[] args) {
int n = 3;
Doodle.drawSpaceShip(n);
}

    
}
