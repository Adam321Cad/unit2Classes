import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

/**
 * Write a description of class Target here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Target
{
    
    private int xfar;
    private int yfar;
    
    public Target(int x, int y)
    {
        xfar = x/2;
        yfar = y/2;
    }
    
    public void draw(Graphics2D g2)
    {
        
    Ellipse2D.Double First = new Ellipse2D.Double(xfar-300,yfar-300 ,600 , 600);
    Ellipse2D.Double First2 = new Ellipse2D.Double(xfar-250,yfar-250 ,500, 500);
    Ellipse2D.Double second = new Ellipse2D.Double(xfar-200,yfar-200 ,400, 400);
    Ellipse2D.Double second2 = new Ellipse2D.Double(xfar-150,yfar-150 ,300, 300);
    Ellipse2D.Double third = new Ellipse2D.Double(xfar - 100,yfar-100 ,200, 200);
    //Ellipse2D.Double First = new Ellipse2D.Double(20,20 ,100, 100);
    g2.draw(First);
    g2.draw(second);
    g2.draw(third);
    g2.draw(First2);
    g2.draw(second2);
    g2.setPaint(Color.red);
    g2.fill(First);
    g2.setPaint(Color.white);
    g2.fill(second);
    g2.setPaint(Color.red);
    g2.fill(third);
    }
}
