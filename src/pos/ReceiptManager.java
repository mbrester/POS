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
public class ReceiptManager {
    
    private ReceiptType receit;
    
    public ReceiptManager(ReceiptType receit){
        this.receit = receit;
    }
    
    public void printReceit(){
        receit.printReceit();
    }
    
}
