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
    private final int ONE_HOUR = 1;

    /**
     * Custom constructor. This is better because we guarantee property
     * initialization.
     *
     * @param minFee - lowest charge for minimum hours
     * @param minHours - hours for the minimum charged
     * @parm hourlyFee - hourly fee charged between min and max charge
     */
    public ThriftyFeeCalculator(double minFee,
            double minHours, double hourlyFee) {
        setMinFee(minFee);
        setMinHours(minHours);
        setHourlyFee(hourlyFee);
    }

    /**
     *
     * @return minFee the minimum fee charged
     */
    public final double getMinFee() {
        return minFee;
    }

    /**
     *
     * @return minHours the minimum hours
     */
    public final double getMinHours() {
        return minHours;
    }

    /**
     *
     * @return hourlyFee the hourly fee between charged between min and max
     */
    public final double getHourlyFee() {
        return hourlyFee;
    }

    /**
     *
     * @param minFee set the minimum fee
     */
    public final void setMinFee(double minFee) {
        if (minFee < 0 || minFee > 5000) {
            throw new IllegalArgumentException("Minimum Fee invalid.");
        }
        this.minFee = minFee;
    }

    /**
     *
     * @param minHours set the minumum hours charged
     */
    public final void setMinHours(double minHours) {
        if (minHours < 0 || minHours > 500) {
            throw new IllegalArgumentException("Minimum Hours invalid.");
        }
        this.minHours = minHours;
    }

    /**
     * set the hourly fee charged
     *
     * @param hourlyFee
     */
    public final void setHourlyFee(double hourlyFee) {
        if (hourlyFee < 0 || hourlyFee > 500) {
            throw new IllegalArgumentException("Hourly Fee invalid.");
        }

        this.hourlyFee = hourlyFee;
    }

    /* Custom implementation of Inteface. Therefore, this method
     * is polymorphic (common) to all fees charged and can be used in the
     * high-level class. This method will calculate the parking garage
     * fee
     */
    @Override
    //public double calcFeeAmt(LineItem item) {
    public double calcFeeAmt(double hours) {
        double feeAmt;
        int hoursCharged;
        hoursCharged = (int) hours;
        if (hoursCharged < hours) {
            hoursCharged += ONE_HOUR;
        }
        if (hoursCharged <= minHours) {
            feeAmt = minFee;
        } else {
            feeAmt = minFee + ((hoursCharged - minHours) * hourlyFee);
        }

        return feeAmt;

    }

}
