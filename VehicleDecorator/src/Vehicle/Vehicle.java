package Vehicle;

/**
 * The super class of all vehicle implementations.
 * 
 * @author Steven Endres
 */
public abstract class Vehicle {
    private final String description = "Vehicle";

//   
    
    // vehicles and decorators will implement this differently
    public abstract String description();
    
    // vehicles and decorators will implement this differently
    public abstract double cost ();
}
