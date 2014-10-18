import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

/**
 * This basically just makes a green box on the bottom of the screen that is the "grass"
 * 
 * @author (Adam Arato) 
 * @version (2)
 */
public class grass
{
    private double xfar;
    private double yfar;
    private int height;
    public grass(int x, int y)
    {
        xfar = x;
        yfar = y;
    }
    /**
     * It makes a grass at the bottom of the screen.
     *
     * @pre        a jframe
     * @post    a it makes the grass for the city
     * @param    this is the size of the window
     * @return    no return value
     */
    public void draw(Graphics2D g2){
            Rectangle2D.Double grass = new Rectangle2D.Double(0,500,2500,2500);
            g2.draw(grass);
            g2.setPaint(Color.green);
            g2.fill(grass);
    }
}
