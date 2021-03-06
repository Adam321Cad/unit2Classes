import javax.swing.JFrame;

/**
 * Class that contains the main method for the program and creates the frame containing the component.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class CityscapeViewer
{
    /**
     * main method for the program which creates and configures the frame for the program
     *
     *
    /**
     * An example of a method - This method is what sets up the jframe and starts the loop to make the night day cycle
     *
     * 
     * @post    This is the method that runs the entire program. If done correctly will draw a building with a skyr I LEFT OFF DOCUMENTING HERE!!!
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public static void main(String[] args)
    throws InterruptedException
    {
        // create and configure the frame (window) for the program
        JFrame frame = new JFrame();
        
        frame.setSize(800 /* x */, 600 /* y */);
        frame.setTitle("Cityscape");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // a frame contains a single component; create the Cityscape component and add it to the frame
        //CityscapeComponent component = new CityscapeComponent();
        building_drawer component = new building_drawer();
        frame.add(component);
        
        // make the frame visible which will result in the paintComponent method being invoked on the
        //  component.
        frame.setVisible(true);
        while (true){
            component.repaint();
            Thread.sleep(1000);
    }

}
}

        
       // TargetPart component = new TargetPart();
       // frame.add(component);
        