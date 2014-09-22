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
    public void paintTarget(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        Target target1 = new Target();
        
        
        target1.draw(g2);
    }

}
