import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

/**
 * Sets up the basic biulding with nightday versons of buildings and windows.
 * 
 * @author Adam Arato 
 * @version 1
 */
public class building1
{
    private double xfar;
    private double yfar;
    private int buildingx;
    private int buildingy;
    private int width;
    private int height;
    private int day;
    public building1(int x, int y, int bx, int by, int w, int h,int t)
    {
        xfar = x/2;
        yfar = y/2;
        buildingx = bx;
        buildingy = by;
        width = w;
        height = h;
        day = t;
    }
    
    
    /**
     * This method can make a simple building with windows. This will take care of the night and day changes in the apearance of the buildings.
     *
     *
     * @pre        It assumes that 7 parametears are sent into it. it also assumes that graphics and a jframe is made.and implemented.
     *            
     * @post    postconditions for the method
     *            This method will make a building with windows. the colors will change depending on the time of day.
     * @param    i need the demetions of the window as the x and y respectivly, then the building placement, x and y respectivly
     * the width and height of the building along with the time of day.
     * @return    no return value
     */
    public void draw(Graphics2D g2){
        int win = 10;
        int loop = (height/140);
        Rectangle2D.Double First = new Rectangle2D.Double(xfar-buildingx,yfar-buildingy ,width, height);
        g2.draw(First);
        g2.setPaint(Color.gray);
        g2.fill(First);
        for(int i=0; i<loop; i++){
            
            Rectangle2D.Double Window1 = new Rectangle2D.Double(xfar-(buildingx-25),yfar-(buildingy-win),50,100);
            g2.draw(Window1);
            win = win + 120;
            if (day == 1){
                g2.setPaint(Color.white);
            }else{
            g2.setPaint(Color.yellow);}
            g2.fill(Window1);
    }
     win = 10;
    for(int j=0; j<loop; j++){
            Rectangle2D.Double Window1 = new Rectangle2D.Double(((xfar-buildingx)+width)-75,yfar-(buildingy-win),50,100);
            g2.draw(Window1);
            win = win + 120;
            if (day == 1){
                g2.setPaint(Color.white);
            }else{
            g2.setPaint(Color.yellow);
        }
            g2.fill(Window1);
        
        
    }
    
    

    }
 

}

