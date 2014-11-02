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

    private Garage garage;
    private Car car;
    private Receipt receipt;
    private FeeStrategy feeStrategy;
    private ReceiptOutputStrategy receiptOutputStrategy;

    public ATM(Garage garage, FeeStrategy feeStrategy,
               ReceiptOutputStrategy receiptOutputStrategy) {
        this.receipt = new Receipt(feeStrategy, garage, receiptOutputStrategy);

        this.garage = garage;
        this.feeStrategy = feeStrategy;
        this.receiptOutputStrategy = receiptOutputStrategy;
    }

    public final void carLeaves(Car car) {
        receipt.processCar(car);
        //receipt.addSale(hours);

    }
}
