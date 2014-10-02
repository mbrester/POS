/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pos;
import java.util.Date;

/**
 *This Low-Level Class is a type of Receipt that implements the interface ReceiptType.
 * It will print a receipt to the console using the information given to it 
 * by the lineItem class and the Receipt class
 * 
 * @author mbrester1
 * version 1.00
 */
public class ConsoleReceipt implements ReceiptType{
    private String custID;
    private static final String RECEIPTITEMINFO = "Item Number     Product Name    Quantity   Original Price         Discount      SubTotal";
    private static final String STORENAME = "Kohls Department Store";
    private Customer customer;
    private LineItem  lineItem[] ={};
    private LineItem temp = new LineItem();
    private final FakeDB dB = new FakeDB();
    private double subTotal;
    private double grandTotal;
    private double totalDiscount;
    private Date date = new Date();
   
    
    /**
     * This is the constructor for this class, it takes in one product number,
     * one customer ID, and one quantity type
     * 
     * 
     * @param productNumber this is the number for the product
     * witch is passed to the lineItem class
     * @param custID the Id of the customer that is checking out
     * @param qty number of the product that is being passed in
     */
            
    public ConsoleReceipt( String productNumber, String custID, int qty) {
        this.custID = custID;
        lookupCustomer();
        addLineItem(productNumber,qty);
        
    }/**
     * This method takes a product number and qty given to it and sends them to
     * the lineItem class.  It then temporarily makes an object of said lineItem
     * and sends that to the addToArray method
     * 
     * @param productNumber this is the number for the product
     * @param qty number of the product that is being passed in 
     */
    @Override
     public void addLineItem(String productNumber, int qty){
         temp = temp.addLineItem(productNumber, qty);
         addToArry(temp);
         
     }
             
     /**
      * This method looks in the DataBase for the customer using the custID 
      * given.
      */
    @Override
    public void lookupCustomer(){
        customer = dB.findCustomer(custID);
    
    }
    /**
     * This method will print out a receipt using the information given 
     */
    @Override
    public void printReceit() {

        System.out.println(date.toString());
        System.out.println(customer.getCustName()+ "  Customer ID: " + customer.getCustID());
        System.out.println(STORENAME);
        System.out.println(RECEIPTITEMINFO);
        System.out.println("________________________________________________________________________________________");
        System.out.println("");
        for(int i = 0; i < lineItem.length;i++){
            subTotal += lineItem[i].getDiscountedPrice();
             System.out.println(lineItem[i].getLineItemData()+"  "+ subTotal);
           totalDiscount += lineItem[i].getDiscount();
            
        }
        grandTotal = subTotal;
        System.out.println("________________________________________________________________________________________");
        System.out.println("                                                        You Saved: "+ totalDiscount);
        System.out.println("                                                      Grand Total: " + grandTotal);
        
        
    }
/**
 * This method will add a given lineItem to the array of lineItems that exists in
 * the class
 * @param item a Temp lineItem that is found in a previous method
 */
    @Override
    public void addToArry(LineItem item) {
        LineItem[] tempItems = new LineItem[lineItem.length + 1];
        System.arraycopy(lineItem, 0, tempItems, 0, lineItem.length);
        tempItems[lineItem.length] = item;
        
        
        lineItem = tempItems;
    }
    
   
}
