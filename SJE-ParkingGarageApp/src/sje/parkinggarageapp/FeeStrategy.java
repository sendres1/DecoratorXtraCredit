package sje.parkinggarageapp;

/**
 * FeeStrategy interface uses various fee arrangements.
 *
 * @author sendres1
 * @version 1.15
 */
public interface FeeStrategy {

    public abstract double calcFeeAmt(double hour);
}
