package Vehicle;

/**
 * A Vehicle implementation.
 * 
 * @author Steven Endres
 */
public class Truck extends Vehicle {
    // private String description;
     
//    public Truck() {
//        description = "Truck";
//    }

    public String description(){
        return "Truck ";
    }
    // provided implementation 
    public double cost () {
        return 30000.00;
    }

}
