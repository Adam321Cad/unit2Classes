import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Write a description of class hbvfd here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CarComponent extends JComponent
{
    /** description of instance variable x (add comment for each instance variable) */

    /**
     * Default constructor for objects of class hbvfd
     */
    public void paintCOmponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        Car car1 = new Car(0, 0);
        int x = getWidth() - 60;
        int y = getHeight() - 30;
        
        Car car2 = new Car(x, y);
        
        car1.draw(g2);
        car2.draw(g2);
    }

}
