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
   
  //  private Receipt receipt;
    private FeeStrategy feeStrategy;
    private ReceiptOutputStrategy receiptOutputStrategy;

 //   public ATM(Garage garage, FeeStrategy feeStrategy,
     public ATM(Garage garage){
     feeStrategy = garage.getFeeStrategy();
     receiptOutputStrategy = garage.getReceiptOutputStrategy();
     //   this.receipt = new Receipt(feeStrategy, receiptOutputStrategy);
     //   if (garage == null)
     //        {
     //       throw new IllegalArgumentException("Garage is null.");
     //   }
     //   this.garage = garage;
//        if (feeStrategy == null)
//             {
//            throw new IllegalArgumentException("feeStrategy is null.");
//        }
//        this.feeStrategy = feeStrategy;
//        if (receiptOutputStrategy == null)
//             {
//            throw new IllegalArgumentException("receiptOutputStrategy is null.");
//        }
//        this.receiptOutputStrategy = receiptOutputStrategy;
    }

    public final void checkoutCar(Car car) {
        if (car == null)
             {
            throw new IllegalArgumentException("Car is null.");
        }
        Receipt receipt = new Receipt(garageName, feeStrategy, receiptOutputStrategy);
        receipt.processCar(car);
        //receipt.addSale(hours);

    }
}
