/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos;

/**
 * This class is a high level class that manages the receipts
 *
 * @author Mitch
 * @version 1.00
 */
public class Receipt {
    
    private ReceiptType receit;
    
    
    public Receipt(ReceiptType receit){
        this.receit = receit;
    }
    
    public void printReceit(){
        receit.printReceit();
    }
    public void addItem(String productNubmer,int qty){
        receit.addLineItem(productNubmer, qty);
    }
    
    
}
