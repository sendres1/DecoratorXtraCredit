/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sje.parkinggarageapp;

/**
 ** ATM concrete class instantiates garage and receipt object to facilitate a
 * sale
 *
 * @author sendres1
 * @version 1.35
 */
public class ATM {

    private String garageName;
    private double totalHours;
    private double totalFee;
    private double hours;
    private FeeStrategy feeStrategy;
    private ReceiptOutputStrategy receiptOutputStrategy;

    public ATM(Garage garage) {
        if (garage == null) {
            throw new IllegalArgumentException("Garage is null.");
        }

        
        feeStrategy = garage.getFeeStrategy();
        receiptOutputStrategy = garage.getReceiptOutputStrategy();
        if (feeStrategy == null) {
            throw new IllegalArgumentException("feeStrategy is null.");
        }
        
        if (receiptOutputStrategy == null) {
            throw new IllegalArgumentException("receiptOutputStrategy is null.");
        }
        
        garageName = garage.getGarageName();
        totalHours = 0;
        totalFee = 0;
    }

    public double getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(double totalHours) {
        if (totalHours < 0) {
            throw new IllegalArgumentException("total Hours invalid.");
        }
        this.totalHours = totalHours;
    }

    public double getTotalFee() {
                return totalFee;
    }

    public void setTotalFee(double totalFee) {
        if (totalFee < 0 ) {
            throw new IllegalArgumentException("Total fee invalid.");
        }
        this.totalFee = totalFee;
    }
      
    public final void checkinCar(Car car, double hours) {
        if (hours < 0) {
            throw new IllegalArgumentException("Hours invalid.");
        }
        if (car == null) {
            throw new IllegalArgumentException("Car is null");
        }
        car.getTicket(hours);

    }

    public final void checkoutCar(Car car) {
        if (car == null) {
            throw new IllegalArgumentException("Car is null.");
        }
        Receipt receipt = new Receipt(garageName, feeStrategy,
                receiptOutputStrategy, totalHours, totalFee);
        receipt.processCar(car);
        totalHours = receipt.getTotalHours();
        totalFee = receipt.getTotalFee();
        
    }

}
