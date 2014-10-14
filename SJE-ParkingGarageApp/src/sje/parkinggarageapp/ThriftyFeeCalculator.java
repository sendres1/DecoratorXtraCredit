package sje.parkinggarageapp;

/**
 *
 ** ThriftyFeeCalculator concrete class to return fee amount based on $a Min
 * charge, no max charge, and a per hour charge.
 *
 * * @author sendres1
 * @version 1.45
 */
public class ThriftyFeeCalculator implements FeeStrategy {

    private double minFee = 1.50;
    private double minHours = 2.0;
    private double hourlyFee = 0.75;
    private int hoursCharged = 0;
    private final int ONE_HOUR = 1;

    @Override
    //public double calcFeeAmt(LineItem item) {
    public double calcFeeAmt(double hours) {
        double feeAmt;
        hoursCharged = (int) hours;
        if (hoursCharged < hours) {
            hoursCharged += ONE_HOUR;
        }
        //get rid of hours;
        // double hours = 0;
        //int quantity = item.getQty();
        //double unitPrice = item.getProduct().getUnitPrice();
        if (hoursCharged <= minHours) {
            feeAmt = minFee;
        } else {
            feeAmt = minFee + ((hoursCharged - minHours) * hourlyFee);
        }

        return feeAmt;

    }

   // public void setFirstQtyDiscount(double firstQtyDiscount) {
    //     if(firstQtyDiscount < 0) {
    //         throw new IllegalArgumentException();
    //     }
    //     this.firstQtyDiscount = firstQtyDiscount;
    // }
}
