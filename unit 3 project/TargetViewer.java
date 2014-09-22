import javax.swing.JFrame;

/**
 * Write a description of class CarViewer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TargetViewer
{

    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(300, 400);
        frame.setTitle("two cars");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        TargetPart component = new TargetPart();
        frame.add(component);
        
        frame.setVisible(true);

}
}
