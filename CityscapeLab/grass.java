import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

/**
 * Write a description of class building1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
    
    public void draw(Graphics2D g2){
            Rectangle2D.Double grass = new Rectangle2D.Double(0,500,2500,2500);
            g2.draw(grass);
            g2.setPaint(Color.green);
            g2.fill(grass);
    }
}
