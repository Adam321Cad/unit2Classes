

/**
 * Write a description of class wj6th5qrtgerw here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VendingMachine
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;
    private int cans;
    private int tokens;

    /**
     * Default constructor for objects of class wj6th5qrtgerw
     */
    public VendingMachine(int cans, int tokens)
    {
        // initialise instance variables
        x = 0;
        this.cans = cans;
        this.tokens = tokens;
    }
    
    public void FillVendor(int moreCans){
        this.cans = this.cans + moreCans;
    }
    
    public void Buy(int num){
        this.cans = this.cans - num;
        this.tokens = this.tokens + num;
    }
    
    public int numCans(){
        return this.cans;
    }
    
    public int numtokens(){
        return this.tokens;
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x+y;
    }

}
