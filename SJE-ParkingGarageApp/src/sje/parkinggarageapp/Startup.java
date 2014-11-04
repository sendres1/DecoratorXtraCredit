package sje.parkinggarageapp;

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
        String mgs = "";

        FeeStrategy bestStrategy = new BestValueFeeCalculator(2, 3, 10, 24, .50);
         Garage bestGarage = new Garage("Best Value Parking Garage",
                "Plankinton Street", "Milwaukee Wi", "53111", bestStrategy);
         
        ReceiptOutputStrategy consoleReceipt = new ConsoleReceiptOutput(bestGarage.getGarageName());  
        
        bestGarage.setReceiptOutputStrategy(consoleReceipt);
    //    Garage bestGarage = new Garage("Best Value Parking Garage",
    //            "Plankinton Street", "Milwaukee Wi", "53111", bestStrategy, consoleReceipt);
        

        ATM atmOut = new ATM(bestGarage);

        Car car1 = new Car();
        car1.checkinCar(.5);
        atmOut.checkoutCar(car1);
        Car car2 = new Car();
        car2.checkinCar(2.00);
        atmOut.checkoutCar(car2);
        Car car3 = new Car();
        car3.checkinCar(3.00);
        atmOut.checkoutCar(car3);
        Car car4 = new Car();
        car4.checkinCar(4.50);
        atmOut.checkoutCar(car4);
        Car car5 = new Car();
        car5.checkinCar(19.00);
        atmOut.checkoutCar(car5);
        Car car6 = new Car();
        car6.checkinCar(19.75);
        atmOut.checkoutCar(car6);

        

        FeeStrategy thriftyStrategy = new ThriftyFeeCalculator(1.5, 2.0, .75);
        Garage thriftyGarage = new Garage("Thrifty",
                "Main Street", "Milwaukee Wi", "53112", thriftyStrategy);
        ReceiptOutputStrategy guiReceipt = new GuiReceiptOutput(thriftyGarage.getGarageName());
        thriftyGarage.setReceiptOutputStrategy(guiReceipt);
        ATM atmOut2 = new ATM(thriftyGarage);

        Car car1t = new Car();
        car1t.checkinCar(.5);
        atmOut2.checkoutCar(car1t);
        Car car2t = new Car();
        car2t.checkinCar(2.00);
        atmOut2.checkoutCar(car2t);
        Car car3t = new Car();
        car3t.checkinCar(3.00);
        atmOut2.checkoutCar(car3t);
        Car car4t = new Car();
        car4t.checkinCar(4.50);
        atmOut2.checkoutCar(car4t);
        Car car5t = new Car();
        car5t.checkinCar(19.00);
        atmOut2.checkoutCar(car5t);
        Car car6t = new Car();
        car6t.checkinCar(19.75);
        atmOut2.checkoutCar(car6t);

    }

}
