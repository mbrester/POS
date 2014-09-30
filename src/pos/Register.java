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
public class Register {
    
   
    private Receipt receipt;
    
    

    public Register(Receipt receipt) {
        this.receipt = receipt;
    }
    

    
    
    public void setReceiptType(Receipt receipt){
        this.receipt = receipt;
    }
            
    
   
   public void addProduct(String productNumber, int qty){
       receipt.addItem(productNumber, qty);
   }
  

    public void getReceipt() {
        receipt.printReceit();
    }

   

   

    
    
}
