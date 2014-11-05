/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sje.parkinggarageapp;

/**
 *
 * @author Steven Endres
 * @version 1.2
 */
public class Ticket {

    private double hours;
    private final int MAX_HOURS_IN_DAY = 24;

    public Ticket(double hours) {
        setHours(hours);
    }

    public final double getHours() {
        return hours;
    }

    public final void setHours(double hours) {
        if (hours < 0 || hours > MAX_HOURS_IN_DAY) {
            throw new IllegalArgumentException("Hours can't be more than 24.");
        }
        this.hours = hours;
    }

}
