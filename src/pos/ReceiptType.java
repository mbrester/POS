/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos;

/**
 *
 * @author Mitch
 */
public interface ReceiptType {
    public abstract void printReceit();
    public abstract void addToArry(LineItem item);
    public abstract void lookupCustomer();
    public abstract void addLineItem(String productNumber, int qty);
    
}
