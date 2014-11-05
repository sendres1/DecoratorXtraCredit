/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sje.parkinggarageapp;

/**
 *
 * @author Owner
 */
public class Car {

    private Ticket ticket;
    private double hours;

    public Car() {

  }

//    public Car(double hours) {
        

    public final void getTicket(double hours) {
     
        if (hours < 0) {
            throw new IllegalArgumentException("hours is < 0.");
        }
        this.hours = hours;
        this.ticket = new Ticket(hours);
    }

    public final Ticket getTicket() {
        return ticket;
    }

}
