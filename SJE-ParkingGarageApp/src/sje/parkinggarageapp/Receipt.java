/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sje.parkinggarageapp;

import java.text.NumberFormat;

/**
 ** Product class has methods necessary to process a product for sale
 *
 * @author sendres1
 * @version 1.40
 */
public class Receipt {

    private double hours;
    // private double discountAmt;
    private Garage garage;
    private FeeStrategy strategy;
    private double fee;

    NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
    // NumberFormat hourFormat = NumberFormat.getNumberInstance(0#.##);

    public Receipt(FeeStrategy strategy, Garage garage) {
        //      this.hours = hours;
        hours = 0;
//        this.productId = productId;
//        this.productDesc = productDesc;
        this.garage = garage;
        this.strategy = strategy;
        this.fee = 0;

    }
//
    //   public double getUnitPrice() {
    //       return unitPrice;
    //   }

 //   public String getProductId() {
    //       return productId;
    //   }
 //   public String getProductDesc() {
    //       return productDesc;
    //   }
    public double getFeeAmt(double hours) {
        //????????????????????????
        return strategy.calcFeeAmt(hours);
        // this.hours = strategy.calcFeeAmt(hours)
    }

    public void addSale(double hours) {
        fee = getFeeAmt(hours);
        this.hours = hours;
        printReceipt();
    }

    public void printReceipt() {
        // Just utility code to format numbers nice.

        printSale();
        printGarageTotals();
  //
        //      printSale();
        //      printThanks();

    }

//    private void printCustomer() {
//        System.out.println("  Client:  " + this.customer.getCustomerName());
//    }
    private void printGarageTotals() {
   //     System.out.println();
        //     System.out.println();
        //      System.out.println();
        //      System.out.println("Garage: " + this.garage.getGarageDesc());
        System.out.println("Running total for: "
                + garage.getGarageName()
                + " is  " + hours + " hours parked, "
                + currencyFormat.format(fee) + " collected.");
        System.out.println();
//       System.out.println("        " +  garage.getCityState());
        //       System.out.println("        " +  garage.getZipcode());

    }

    private void printSale() {
//        for (int i = 0; i < sales.length; i++) {
        System.out.println(garage.getGarageName()
                + ",  " + hours + " hours parked, "
                + currencyFormat.format(fee) + " fee.");
    }
//    }

//    private void printThanks() {
//        System.out.println("   THANKS ");
//    }
  //  public void setUnitPrice(double unitPrice) {
    //      this.unitPrice = unitPrice;
    //  }
//    public void setProductId(String productId) {
//        this.productId = productId;
    //  }
//
//    public void setProductDesc(String productDesc) {
//        this.productDesc = productDesc;
//    }
//    
}
