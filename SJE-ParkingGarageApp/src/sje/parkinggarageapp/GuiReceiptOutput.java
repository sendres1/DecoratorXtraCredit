/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sje.parkinggarageapp;


public class GuiReceiptOutput implements ReceiptOutputStrategy {
     String line;

    public GuiReceiptOutput(String line) {
        this.line = line;
    }
     
     
     
    
    
    @Override
    public void writeReceipt(String line) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
