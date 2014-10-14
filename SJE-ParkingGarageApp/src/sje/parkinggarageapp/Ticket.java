/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sje.parkinggarageapp;

/**
 * Receipt class will process a garage receipt
 *
 * @author sendres1
 * @version 1.50
 */
public class Ticket {

    private Garage garage;
    //   private Customer customer;
    private Receipt receipt;
    private FeeStrategy feestrategy;
    private double total;
 //   private String description;
    //   private int qty;
    //   private String prodID;

   // private String customerID;
    ///will need to read the fake database and spin thru arrary matching on id
    //private String garageid; not needed just getgaragedesc
    //declare variables  
//    public Receipt(Garage garage, Customer customer) {
//
//        this.garage = garage;
//        this.customer = customer;
//        this.sales = new Sales[0];
//
//   //     this.description = description;
//        //     this.prodID = prodID;
//        //     this.qty = qty;
//    }
    public Ticket(Garage garage, FeeStrategy feeStrategy) {

        this.garage = garage;
   //     this.customer = db.getCustomerByID(custId);
        //     this.receipt = new Receipt(feestrategy);

        //     this.description = description;
        //     this.prodID = prodID;
        //     this.qty = qty;
    }

//    public void setDescription(String description) {
//        if(description == null || description.isEmpty()) {
//            throw new IllegalArgumentException();
//        }
//        this.description = description;
//    }
    public void printReceipt() {
        printGarage();
  //      printCustomer();
        //     printSales();
        printThanks();

    }

//    private void printCustomer() {
//        System.out.println("  Client:  " + this.customer.getCustomerName());
//    }
    private void printGarage() {
        System.out.println();
        System.out.println();
        System.out.println();
        //      System.out.println("Garage: " + this.garage.getGarageDesc());
        System.out.println("Garage: " + garage.getGarageName());
        System.out.println("        " + garage.getCityState());
        System.out.println("        " + garage.getZipcode());

    }

//    private void printSales() {
//        for (int i = 0; i < sales.length; i++) {
//            System.out.println("Product: " + sales[i].getSubTotal());
//        }
//    }
    private void printThanks() {
        System.out.println("   THANKS ");
    }

  //  public void addSales(Sales sale) {
    //      addToArray(sale);
    //  }
//    private void addToArray(final Sales sale) {
    // needs validation
//        Sales[] tempSales = new Sales[sales.length + 1];
//        System.arraycopy(sales, 0, tempSales, 0, sales.length);
//        tempSales[sales.length] = sale;
//        sales = tempSales;
}
