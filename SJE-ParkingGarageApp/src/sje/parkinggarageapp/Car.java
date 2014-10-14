/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sje.parkinggarageapp;

/**
 ** Customer class instantiates a customer with a customer number and name
 *
 * @author sendres1
 * @version 1.05
 */
public class Car {

    private int customerNum;
    private String customerName;

    public Car(int customerNum, String customerName) {
        this.customerNum = customerNum;
        this.customerName = customerName;
    }

    public int getCustomerNum() {
        return customerNum;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        if (customerName == null || customerName.isEmpty()) {
            this.customerName = customerName;
        }
    }

    public void setCustomerNum(int customerNum) {
        this.customerNum = customerNum;
    }

}
