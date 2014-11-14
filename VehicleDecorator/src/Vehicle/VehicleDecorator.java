package Vehicle;

/**
 * A decorator IS A Vehicle. But it needs a vehicle component to "decorate".
 * Note that this abstract class doesn't provide that, although it could.
 * 
 * @author Steven Endres
 */
public abstract class VehicleDecorator extends Vehicle {
    
    /*
     * Even though we are inheriting an implementation from
     * Vehicle, we need to MANDATE that this method gets overridden
     * by the decorator implementations so that the decorator adds to the 
     * description of the vehicle. Without this declaration, the sub classes
     * would not be required to do this.
     */
    public abstract String description();
}
