package Vehicle;

import java.text.NumberFormat;

/**
* Decorator pattern to 
 * handle vehicle sales with varying vehicles and options. This version
 * implements the Decorator Pattern and proves to be a huge improvement in
 * maintainability. No rigidity here ... you can add new options classes
 * or change existing ones without breaking code. You can add new vehicles
 * and not break code. (Note: prices are hard-coded in right now, but they
 * don't have to be ... they can come from a properties file or database.
 *
 * P.S. How would you implement a CashRegister class with this version,
 * without adding rigidity?
 *
 * @author Steven Endres
 */
public class Startup {

    /**
     * @param args the command line arguments - not used
     */
    public static void main(String[] args) {
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        
        // Liskov Substition !!
        Vehicle vehicle = new Car();
        
        // Car has not been decorated here.
        System.out.println(vehicle.description()
                + " " + nf.format(vehicle.cost()));

        Vehicle vehicle2 = new Truck();  
        
        // Now let's decorate Truck like this...
        vehicle2 = new Leather(vehicle2);
       vehicle2 = new StabilityControl(vehicle2); 
        vehicle2 = new V8(vehicle2);
        
        // Resulting vehicle has combined cost and description.
        System.out.println(vehicle2.description()
                + " " + nf.format(vehicle2.cost()));
    }

}
