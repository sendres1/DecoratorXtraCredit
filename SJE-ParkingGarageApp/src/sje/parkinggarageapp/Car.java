/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sje.parkinggarageapp;

/**
 *
 * @author Steven Endres
 */
public class Car {

    private Ticket ticket;
    private double hours;

    public Car(Ticket ticket, double hours) {
        setTicket(ticket);
        setHours(hours);
    }

    public Car() {
        getTicket(0);
    }

    public final void getTicket(double hours) {
        setHours(hours);
        this.ticket = new Ticket(hours);
    }

    public final void setTicket(Ticket ticket) {
        if (ticket == null) {
            throw new IllegalArgumentException("ticket is null.");
        }
        this.ticket = ticket;
    }

    public final void setHours(double hours) {
        if (hours < 0) {
            throw new IllegalArgumentException("hours is < 0.");
        }
        this.hours = hours;
    }

    public final double getHours() {
        return hours;
    }

    public final Ticket getTicket() {
        return ticket;
    }

}
