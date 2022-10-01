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
