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

    public Car() {

    }

    public final void checkinCar(double hours) {
       if (hours < 0)
             {
            throw new IllegalArgumentException("hours is < 0.");
        }
        this.ticket = new Ticket(hours);
    }

    public final Ticket getTicket() {
        return ticket;
    }

}
