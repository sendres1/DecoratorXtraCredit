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

        Garage bestGarage = new Garage("Best Value Parking Garage",
                "Plankinton Street", "Milwaukee Wi", "53111");
        FeeStrategy bestStrategy = new BestValueFeeCalculator(2, 3, 10, 24, .50);

        ATM atmOut = new ATM(bestGarage, bestStrategy);

        Car car1 = new Car();
        car1.carArrives(.5);
        atmOut.carLeaves(car1);
        Car car2 = new Car();
        car2.carArrives(2.00);
        atmOut.carLeaves(car2);
        Car car3 = new Car();
        car3.carArrives(3.00);
        atmOut.carLeaves(car3);
        Car car4 = new Car();
        car4.carArrives(4.50);
        atmOut.carLeaves(car4);
        Car car5 = new Car();
        car5.carArrives(19.00);
        atmOut.carLeaves(car5);
        Car car6 = new Car();
        car6.carArrives(19.75);
        atmOut.carLeaves(car6);

        Garage thriftyGarage = new Garage("Thrifty",
                "Main Street", "Milwaukee Wi", "53112");

        FeeStrategy thriftyStrategy = new ThriftyFeeCalculator(1.5, 2.0, .75);

        ATM atmOut2 = new ATM(thriftyGarage, thriftyStrategy);

        Car car1t = new Car();
        car1t.carArrives(.5);
        atmOut2.carLeaves(car1t);
        Car car2t = new Car();
        car2t.carArrives(2.00);
        atmOut2.carLeaves(car2t);
        Car car3t = new Car();
        car3t.carArrives(3.00);
        atmOut2.carLeaves(car3t);
        Car car4t = new Car();
        car4t.carArrives(4.50);
        atmOut2.carLeaves(car4t);
        Car car5t = new Car();
        car5t.carArrives(19.00);
        atmOut2.carLeaves(car5t);
        Car car6t = new Car();
        car6t.carArrives(19.75);
        atmOut2.carLeaves(car6t);

    }

}
