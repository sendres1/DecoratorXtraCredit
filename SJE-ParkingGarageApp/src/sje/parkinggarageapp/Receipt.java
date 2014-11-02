/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sje.parkinggarageapp;

import java.text.NumberFormat;
import java.text.DecimalFormat;

/**
 ** Product class has methods necessary to process a product for sale
 *
 * @author sendres1
 * @version 1.40
 */
public class Receipt {

    private double totalHours;
    private double totalFee;
    private double hours;
    private Garage garage;
    private FeeStrategy strategy;
    private ReceiptOutputStrategy receiptOutputStrategy;
    private double fee;

    NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
    DecimalFormat decimalFormat = new DecimalFormat("####0.00");

    public Receipt(FeeStrategy strategy, Garage garage,
            ReceiptOutputStrategy receiptOutputStrategy) {
        totalHours = 0;
        totalFee = 0;
        this.garage = garage;
        this.strategy = strategy;
        this.receiptOutputStrategy = receiptOutputStrategy;
    }

    public final void processCar(Car car) {
        this.hours = car.getTicket().getHours();
        addSale();
    }

    public final void addSale() {
        totalHours += hours;
        //  this.hours = hours;
        fee = getFeeAmt(hours);
        totalFee += fee;
        printReceipt();
    }

    private double getFeeAmt(double hours) {
        return strategy.calcFeeAmt(hours);

    }

    private void printReceipt() {
        printSale();
        printGarageTotals();

    }

    private void printSale() {
        String line;
        System.out.println(garage.getGarageName()
                + ",  " + hours + " hours parked, "
                + currencyFormat.format(fee) + " fee.");
  
       line =(garage.getGarageName()
              + ",  " + hours + " hours parked, "
              + currencyFormat.format(fee) + " fee.");
         receiptOutputStrategy.writeReceipt(line);
    }

    private void printGarageTotals() {
        System.out.println("Running total for: "
                + garage.getGarageName()
                + " is  " + (decimalFormat.format(totalHours)) + " hours parked, "
                + currencyFormat.format(totalFee) + " collected.");
        System.out.println();

    }

}
