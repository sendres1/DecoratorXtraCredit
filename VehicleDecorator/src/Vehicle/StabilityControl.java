package Vehicle;

/**
 * A Decorator implementation. Notice that a decorator has a Vehicle 
 * component -- that's the secret to how a decorator works -- it combines 
 * data from the component with data from itself. In this example it gets
 * the cost by adding its own, plus that of the vehicle. And it gets its
 * description by combining its own with that of the vehicle.
 * 
 * @author Head First Design Patterns
 */
public class StabilityControl extends VehicleDecorator {
    // Component to decorate
    Vehicle vehicle;

    public StabilityControl(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String description() {
        // combined descrition
        return vehicle.description() + ", Stability Control";
    }

    @Override 
    public double cost () {
        // combined cost
        return 500.00 + vehicle.cost();
    }

//    @Override
//    public String getDescription() {
//        return vehicle.description() + ", Stability Control:";
//    }

}
