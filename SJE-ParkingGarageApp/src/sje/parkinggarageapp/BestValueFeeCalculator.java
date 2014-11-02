package sje.parkinggarageapp;

/**
 *
 * BestValueFeeCalculator concrete class to return fee amount based on $a Min
 * charge, a max charge, and a per hour charge. Any fractional hours are rounded
 * up an hour.
 *
 *
 * @author sendres1
 * @version 1.45
 */
public class BestValueFeeCalculator implements FeeStrategy {

    private double minFee = 2.00;
    private double minHours = 3;
    private double maxFee = 10.00;
    private double maxHours = 24;
    private double hourlyFee = 0.50;
    private final double maxMinHours = 8;     //minimum hours maximum
    private final double maxFeeAmount = 5000; //can't charge over 5000
    private final double maxHourlyFee = 500;  //can't charge over 500 hr
    private final int ONE_HOUR = 1;
    private final int MAX_HOURS_IN_DAY = 24;

    /**
     * Custom constructor. This is better because we guarantee property
     * initialization.
     *
     * @param minFee - lowest charge for minimum hours
     * @param minHours - hours for the minimum charged
     * @param maxFee - maximum fee charged
     * @param maxHours - maximum fee charged for any hours over max
     * @parmam hourlyFee - hourly fee charged between min and max charge
     */
    public BestValueFeeCalculator(double minFee,
            double minHours, double maxFee,
            double maxHours, double hourlyFee) {
        setMinFee(minFee);
        setMinHours(minHours);
        setMaxFee(maxFee);
        setMaxHours(maxHours);
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
     * @return maxFee the maximum fee charged
     */
    public final double getMaxFee() {
        return maxFee;
    }

    /**
     *
     * @return maxHours the maximum hours that can be charged
     */
    public final double getMaxHours() {
        return maxHours;
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
        if (minFee < 0 || minFee > maxFeeAmount) {
            throw new IllegalArgumentException("Minimum Fee invalid.");
        }
        this.minFee = minFee;
    }

    /**
     *
     * @param minHours set the minimum hours charged
     */
    public final void setMinHours(double minHours) {
        if (minHours < 0 || minHours > maxMinHours) {
            throw new IllegalArgumentException("Minimum Hours invalid.");
        }
        this.minHours = minHours;
    }

    /**
     *
     * @param maxFee set the maximum fee charged
     */
    public final void setMaxFee(double maxFee) {
        if (maxFee < 0 || maxFee > maxFeeAmount) {
            throw new IllegalArgumentException("Max Fee invalid.");
        }

        this.maxFee = maxFee;
    }

    /**
     *
     * @param maxHours set the maximum hours charged
     */
    public final void setMaxHours(double maxHours) {
        if (maxHours < 0 || maxHours > MAX_HOURS_IN_DAY) {
            throw new IllegalArgumentException("Max Hours invalid.");
        }

        this.maxHours = maxHours;
    }

    /**
     * set the hourly fee charged
     *
     * @param hourlyFee
     */
    public final void setHourlyFee(double hourlyFee) {
        if (hourlyFee < 0 || hourlyFee > maxHourlyFee) {
            throw new IllegalArgumentException("Hourly Fee invalid.");
        }

        this.hourlyFee = hourlyFee;
    }

    
    @Override
    /* Custom implementation of Inteface. Therefore, this method
     * is polymorphic (common) to all fees charged and can be used in the
     * high-level class. This method will calculate the parking garage
     * fee
     */
    public final double calcFeeAmt(double hours) {
        double feeAmt;
        int hoursCharged;
        // any fraction of an hour is an
        // additional hour
        hoursCharged = (int) hours;
        if (hoursCharged < hours) {
            hoursCharged += ONE_HOUR;
        }

        if (hoursCharged <= minHours) {
            feeAmt = minFee;
        } else {
            feeAmt = minFee + ((hoursCharged - minHours) * hourlyFee);
        }
        if (feeAmt > maxFee) {
            feeAmt = maxFee;
        }

        return feeAmt;

    }
}
