import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

/**
 * This class sets to baackground of the city.
 * 
 * @author (Adam Arato) 
 * @version (2)
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
    
    /**
     * This will make the sun and sky or the moon and night sky depending on the time of day
     *
     * @pre        A jframe and graphics2D
     *            
     * @post   you will have a sun or moon with a sky
     * @param    you need to input size of the window and the time of day.
     * @return    no return
     */
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
