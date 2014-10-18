import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.util.Random;

/**
 * This glass sets up the cityviewer class
 * 
 * @author Adam Arato 
 * @version 1
 */
public class building_drawer extends JComponent
{
    /**
     * An example of a method - this method will draw out all of the components of the city.
     *
     * @pre        it is asumed that graphics is passed as a parameter and that building1 sky and grass all exist
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            itguarantees that everything will be set up and ready to draw on your jframe.
     * @param    it needs to be graphics object.
     * @return    no return
     */
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        int x = getWidth() - 60;
        int y = getHeight() - 30;
        Random r = new Random();
        int day = r.nextInt(2);
        //System.out.println(day);
        building1 build = new building1(x,y,250,250,200,500,day);
        building1 build2 = new building1(x,y,-100,50,250,300,day);
        sky s = new sky(x,y,day);
        grass grass = new grass(x,y);
        
        s.draw(g2);
        grass.draw(g2);
        build.draw(g2);
        build2.draw(g2);
        

}
}