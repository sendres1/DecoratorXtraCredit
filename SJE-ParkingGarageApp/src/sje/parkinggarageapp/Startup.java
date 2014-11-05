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
      
        FeeStrategy bestStrategy = new BestValueFeeCalculator(2, 3, 10, 24, .50);
        Garage bestGarage = new Garage("Best Value Parking Garage",
                "Plankinton Street", "Milwaukee Wi", "53111", bestStrategy);

        ReceiptOutputStrategy consoleReceipt = new ConsoleReceiptOutput(bestGarage.getGarageName());

        bestGarage.setReceiptOutputStrategy(consoleReceipt);

        ATM atmM = new ATM(bestGarage);

        Car car1 = new Car();
        atmM.checkinCar(car1,.5);
        atmM.checkoutCar(car1);
        Car car2 = new Car();
        atmM.checkinCar(car2, 2.00);
        atmM.checkoutCar(car2);
        Car car3 = new Car();
        atmM.checkinCar(car3, 3.00);
        atmM.checkoutCar(car3);
        Car car4 = new Car();
        atmM.checkinCar(car4, 4.50);
        atmM.checkoutCar(car4);
        Car car5 = new Car();
        atmM.checkinCar(car5, 19.00);
        atmM.checkoutCar(car5);
        Car car6 = new Car();
        atmM.checkinCar(car6,19.75);
        atmM.checkoutCar(car6);

        FeeStrategy thriftyStrategy = new ThriftyFeeCalculator(1.5, 2.0, .75);
        Garage thriftyGarage = new Garage("Thrifty",
                "Main Street", "Milwaukee Wi", "53112", thriftyStrategy);
        ReceiptOutputStrategy guiReceipt = new GuiReceiptOutput(thriftyGarage.getGarageName());
        thriftyGarage.setReceiptOutputStrategy(guiReceipt);
        ATM atmM2 = new ATM(thriftyGarage);

        Car car1t = new Car();
        atmM2.checkinCar(car1t, .5);
        atmM2.checkoutCar(car1t);
        Car car2t = new Car();
        atmM2.checkinCar(car2t,2.00);
        atmM2.checkoutCar(car2t);
        Car car3t = new Car();
        atmM2.checkinCar(car3t, 3.00);
        atmM2.checkoutCar(car3t);
        Car car4t = new Car();
        atmM2.checkinCar(car4t, 4.50);
        atmM2.checkoutCar(car4t);
        Car car5t = new Car();
        atmM2.checkinCar(car5t,19.00);
        atmM2.checkoutCar(car5t);
        Car car6t = new Car();
        atmM2.checkinCar(car6t,19.75);
        atmM2.checkoutCar(car6t);

    }

}
