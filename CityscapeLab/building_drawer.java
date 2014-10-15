import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.util.Random;

/**
 * Write a description of class buildingf here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class building_drawer extends JComponent
{
    
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