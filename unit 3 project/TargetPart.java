import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Write a description of class hbvfd here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TargetPart extends JComponent
{
    /** description of instance variable x (add comment for each instance variable) */

    /**
     * Default constructor for objects of class hbvfd
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        int x = getWidth() - 60;
        int y = getHeight() - 30;
        Target target1 = new Target(x,y);
        
        target1.draw(g2);
    }

}
