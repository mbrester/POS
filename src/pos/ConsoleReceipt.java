/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pos;

/**
 *
 * @author mbrester1
 */
public class ConsoleReceipt implements ReceiptType{
    private String custID;
    private Customer customer;
    private LineItem  lineItem[] ={};
    private LineItem temp = new LineItem();
    private final FakeDB dB = new FakeDB();
    private double subtotal;
    private double discount;
    
    public ConsoleReceipt( String productNumber, String custID, int qty) {
        this.custID = custID;
        lookupCustomer();
        addLineItem(productNumber,qty);
        
    }
    @Override
     public void addLineItem(String productNumber, int qty){
         temp = temp.addLineItem(productNumber, qty);
         addToArry(temp);
         
     }
             
    @Override
    public void lookupCustomer(){
        customer = dB.findCustomer(custID);
    
    }
    
    @Override
    public void printReceit() {
        System.out.println(lineItem[0].getProduct().getDiscountedPrice());
    }

    @Override
    public void addToArry(LineItem item) {
        LineItem[] tempItems = new LineItem[lineItem.length + 1];
        System.arraycopy(lineItem, 0, tempItems, 0, lineItem.length);
        tempItems[lineItem.length] = item;
        
        lineItem = tempItems;
    }
    
   
}
