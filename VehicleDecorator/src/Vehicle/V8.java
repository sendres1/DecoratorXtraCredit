package Vehicle;

/**
 * A Decorator implementation. Notice that a decorator has a Vehicle 
 * component -- that's the secret to how a decorator works -- it combines 
 * data from the component with data from itself. In this example it gets
 * the cost by adding its own, plus that of the vehicle. And it gets its
 * description by combining its own with that of the vehicle.
 * 
 * @author Steven Endres
 */
public class V8 extends VehicleDecorator {
    // Component to decorate
    Vehicle vehicle;

    public V8(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String description() {
        // combined descrition
        return vehicle.description() + ", V-8 Engine";
    }

    @Override 
    public double cost () {
        // combined cost
        return 900.00 + vehicle.cost();
    }


}
