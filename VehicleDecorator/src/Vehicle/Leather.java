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
public class Leather extends VehicleDecorator {
    // Component to decorate
    Vehicle vehicle;

    public Leather(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

//    @Override
//    public String getDescription() {
//        // combined descrition
//        return vehicle.description() + ", Leather";
//    }

    @Override 
    public double cost () {
        // combined cost
        return 300.01 + vehicle.cost();
    }

    @Override
    public String description() {
        return vehicle.description() + "Leather";
    }

}
