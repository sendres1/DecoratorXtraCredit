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
    private Receipt receipt;
 //   private Ticket ticket;
    private FeeStrategy feeStrategy;
    // make these static
    private double totalHours;
    private double totalAmount;

    public ATM(Garage garage, FeeStrategy feeStrategy) {
  //      this.receipt = new Receipt(garage, custId, db);
        //    this ticket = new Ticket(garage,feeStrategy)
        this.garage = garage;
        this.feeStrategy = feeStrategy;
        this.totalAmount = 0;
        this.totalHours = 0;
    }

    public void addSale(double hours) {
    //Sale sale = new Sale(product, qty);
        //  Sales sale = new Sales(hours, collected);
        this.receipt = new Receipt(feeStrategy, garage);
        receipt.addSale(hours);
        //receipt.printReceipt(hours);
    }

   //  public void endSale(){
    //      this.receipt.printReceipt();         
}

//    public String getProductID() {
//        return ProductID;
//    }
//    public void setProductID(String ProductID) {
//        this.ProductID = ProductID;
//    }
//    public int getQty() {
//        return qty;
//    }
//
//    public void setQty(int qty) {
//        this.qty = qty;
//    }
//
//    public Customer getCustomerno() {
//        return this.customer;
//    }
//
//    public void setCustomerno(Customer customer) {
//        this.customer = customer;
//    }
//
//    public String getDiscount() {
//        return discount;
//    }
//
//    public void setDiscount(String discount) {
//        this.discount = discount;
//    }
//    public void newReceipt(){
//        this.receipt = new Receipt(this.garage, this.customer);
//     } 
//     public void additem(Product product, int qty){
//         Sale item = new Sale(product, qty);
//         
//         this.receipt.addSale(item);
//     }

