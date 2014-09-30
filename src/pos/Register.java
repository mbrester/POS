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
    private final FakeDB dB = new FakeDB();
    private DiscountManager discount;
    private ReceiptManager receipt;
    private String itemNumber;
    private String custID;
    private int qty;
    private double itemPrice;
    private String itemName;
    private String custName;

    public Register( String itemNumber, String custID, int qty) {
        
        this.itemNumber = itemNumber;
        this.custID = custID;
        this.qty = qty;
    }
    
    public void setDiscountType(DiscountManager discount){
        this.discount = discount;
    }
    public void setReceiptType(ReceiptManager receipt){
        this.receipt = receipt;
    }
            
    public void lookAtDB(int t){
        System.out.println(this.dB.custID[t]);
    }
    
    public void lookupItemPriceAndName(){
        
        for(int i=0; i < 3;i++){
            
            if(this.itemNumber.equals(this.dB.itemNumbers[i])){
                this.itemName = dB.getItemNames(i);
                this.itemPrice = dB.getItemPrices(i);
                break;
            }
            
            
            
        }
             if(this.itemName == null){
          throw new IllegalArgumentException(
                    "Item Number does not exist in our DataBase.");
            }
    }
    
    public void lookupCustomerName(){
        for(int i=0; i < 3;i++){
            
            if(this.custID.equals(this.dB.custID[i])){
               
                this.custName = dB.getCustName(i);
                
                break;
            }
            
            
            
        }
             if(this.custName == null){
          throw new IllegalArgumentException(
                    "Customer ID does not exist in our DataBase.");
            }
    
    }
   

    public DiscountManager getDiscount() {
        return discount;
    }

    public ReceiptManager getReceipt() {
        return receipt;
    }

    public String getItemNumber() {
        return itemNumber;
    }

    public String getCustID() {
        return custID;
    }

    public int getQty() {
        return qty;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public String getCustName() {
        return custName;
    }

    
    
}
