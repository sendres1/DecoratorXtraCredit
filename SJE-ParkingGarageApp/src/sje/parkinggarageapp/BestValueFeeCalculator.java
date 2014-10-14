package sje.parkinggarageapp;

/**
 *
 ** ThriftyFeeCalculator concrete class to return fee amount based on $a Min
 * charge, a max charge, and a per hour charge.
 *
 * * @author sendres1
 * @version 1.45
 */
public class BestValueFeeCalculator implements FeeStrategy {

    private double minFee = 2.00;
    private double minHours = 3;
    private double maxFee = 10.00;
    private double maxHours = 24;
    private double hourlyFee = 0.50;
    private int hoursCharged = 0;
    private final int ONE_HOUR = 1;

    @Override
    //public double calcFeeAmt(LineItem item) {
    public double calcFeeAmt(double hours) {
        double feeAmt;
        //double hour = hour;
        hoursCharged = (int) hours;
        if (hoursCharged < hours) {
            hoursCharged += ONE_HOUR;
        }
        //double hours = 0;
        //int quantity = item.getQty();

        if (hoursCharged <= minHours) {
            feeAmt = minFee;
        } else {
            feeAmt = minFee + ((hoursCharged - minHours) * hourlyFee);
        }
        if (feeAmt > maxFee) {
            feeAmt = maxFee;
        }
        //if (quantity > secondQtyBreak) {
        //    feeAmt = quantity * unitPrice * secondQtyDiscount;
        //} else if (quantity > firstQtyBreak) {
        //    feeAmt = quantity * unitPrice * firstQtyDiscount;
        //} else {
        //    feeAmt = 0;
        //}

        return feeAmt;

    }

   // public void setFirstQtyDiscount(double firstQtyDiscount) {
    //     if(firstQtyDiscount < 0) {
    //         throw new IllegalArgumentException();
    //     }
    //     this.firstQtyDiscount = firstQtyDiscount;
    // }
}
