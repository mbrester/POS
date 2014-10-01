/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos;

/**
 *This is the interface that all receipt type will use, but this is only
 * a proof of concept, the only type of receipt I have right now is console.
 * With this interface more receipt types could be added for later use.
 * 
 * @author Mitch
 * @version 1.00
 */
public interface ReceiptType {
    public abstract void printReceit();
    public abstract void addToArry(LineItem item);
    public abstract void lookupCustomer();
    public abstract void addLineItem(String productNumber, int qty);
    
}
