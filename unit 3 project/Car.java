/**
 * The Car class models a car with a constant fuel efficeny and tracks how much fuel is left in its tank
 * 
 * @author (Adam Arato) 
 * @version (a version number or a date)
 */
public class Car
{
    /** The feul efficiency of this car measured in miles per gallon (mp) */
    private double fuelEfficiency;
    
    /**the fuel, measured in gallons, left in this car's tank*/
    private double fuelInTank;
    /**
     * constructor for car that specifies fuel efficiency
     */
    public Car(double efficiency)
    {
        // initialise instance variables
       // x = 0;
       this.fuelEfficiency = efficiency;
       this.fuelInTank = 0;
       
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
    public void addGas(double gallons)
    {
        // put your code here
        this.fuelInTank = this.fuelInTank +gallons;
        
    }
    

    /**
     * reduces the fuel in this car's tank based on the car's fuel efficiency andthe specified number of miles driven.
     *
     * @pre     preconditions for the method
     *          (what the method assumes about the method's parameters and class's state)
     * @post    the specified number of miles wil not consume more than the amount of fuel in this car's tank.
     * 
     * @param   miles the number of miles driven
     */
    
    /**
     * returns the nimber of gallons of gas remaining in this car's tank
     *
     * @return the number of gallons of gas remaining in this car's tank
     */
    public double getGasInTank()
    {
     return  this.fuelInTank;        // put your code here
        
    }
    
    public void drive(double miles)
    {
        double gallonsBurned = miles / this.fuelEfficiency;
        this.fuelInTank = this.fuelInTank - gallonsBurned;


    }
}