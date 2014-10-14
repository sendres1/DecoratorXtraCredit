package sje.parkinggarageapp;

//import java.text.NumberFormat;
//import java.util.Arrays;

/**
 * Just a start and test class for this program. You may modify this class in
 * any way you see fit.
 *
 * @author sendres1
 * @version 1.100
 */
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //DataAccessStrategy db = new FakeDatabase();

        Garage bestGarage = new Garage("Best Value Parking Garage",
                "Plankinton Street", "Milwaukee Wi", "53111");
        FeeStrategy bestStrategy = new BestValueFeeCalculator(2,3,10,24,.50);
        // Customer customer = db.getCustomerByID(1); //new Customer(1,"Endres" );

//        ATM atm1 = new ATM(garage);
        ATM atm1 = new ATM(bestGarage, bestStrategy);
        //  atm1.newReceipt();
      //  FeeStrategy feeStrategy = new ThriftyFeeCalculator(1.5, 2, 0.75);
       // Store store, int custId, DataAccessStrategy db
//        atm1.addSale(fd.getProductByID("A"), 100);
        //      public void addSale(String prodId, int qty, DataAccessStrategy db){

        atm1.addSale(.5);
        atm1.addSale(2.01);
        atm1.addSale(3.00);
        atm1.addSale(3.01);
        atm1.addSale(3.5);
        atm1.addSale(3.99);
        atm1.addSale(4.0);
        atm1.addSale(6.00);
        atm1.addSale(16.00);
        atm1.addSale(16.5);
        atm1.addSale(17.0);
        atm1.addSale(19.00);
        atm1.addSale(19.50);

        Garage thriftyGarage = new Garage("Thrifty",
                "Main Street", "Milwaukee Wi", "53112");
        //   Customer c2 = db.getCustomerByID(2); //new Customer(1,"Endres" );
        FeeStrategy thriftyStrategy = new ThriftyFeeCalculator(1.5,2.0,.75);

        ATM atm2 = new ATM(thriftyGarage, thriftyStrategy);
        //  atm2.newReceipt();
        atm2.addSale(.5);
        atm2.addSale(1.5);
        atm2.addSale(2.0);
        atm2.addSale(2.01);
        atm2.addSale(3.00);
        atm2.addSale(3.01);
        atm2.addSale(3.5);
        atm2.addSale(3.99);
        atm2.addSale(4.0);
        atm2.addSale(6.00);
        atm2.addSale(16.00);
        atm2.addSale(16.5);
        atm2.addSale(17.0);
        atm2.addSale(19.00);
        atm2.addSale(19.50);

    }

}
