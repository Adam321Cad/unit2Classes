import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 * Write a description of class Target here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Target
{
    public void draw(Graphics2D g2){
        
    Ellipse2D.Double frontTire = new Ellipse2D.Double(20,20 ,100, 100);
    g2.draw(frontTire);
}
}
