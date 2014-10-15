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
public class Ticket {
       private double hours;

    public Ticket(double hours) {
        this.hours = hours;
    }

    public final double getHours() {
        return hours;
    }

    public final void setHours(double hours) {
         if (hours < 0 || hours > 24) {
            throw new IllegalArgumentException("Hours can't be more than 24.");
        }
        this.hours = hours;
    }

  
               
               
               
               
               }
