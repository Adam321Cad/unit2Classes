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
public class sky
{
    private double xfar;
    private double yfar;
    private int day;
    public sky(int x, int y,int t)
    {
        xfar = x;
        yfar = y;
        day = t;
    }
    
    public void draw(Graphics2D g2){
            Rectangle2D.Double sky = new Rectangle2D.Double(0,0,xfar+200,yfar+200);
            g2.draw(sky);
            if (day == 1){
            g2.setPaint(Color.cyan);
        }else{
            g2.setPaint(Color.black);
        }
            g2.fill(sky);
           
        Ellipse2D.Double sun = new Ellipse2D.Double(100,100,75 , 75);
        if (day == 1){
        g2.setPaint(Color.yellow);
        }else {
        g2.setPaint(Color.white);
        }
            g2.fill(sun);
            g2.draw(sun);
}
}
