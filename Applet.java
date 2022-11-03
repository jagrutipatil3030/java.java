import java.applet.Applet;
import java.awt.*;
 public class shape extends Applet
{
  public void paint(Graphics g)
  {
    g.drawRect(100,80,60,80);
    g.setColor(Color.red);
    g.fillRect(100,80,60,80);

    g.setColor(Color.pink);
    g.drawOval(200,300,100,100);
    g.fillOval(200,300,100,100);

    }
  }
