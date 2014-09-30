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
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Register cust1 = new Register("111","aaa",2);
        
//        System.out.println(cust1.getItemNumber());
//        System.out.println(cust1.getCustID());
        cust1.lookupCustomerName();
        System.out.println(cust1.getCustName());
        cust1.lookupItemPriceAndName();
        System.out.println(cust1.getItemName());
        System.out.println(cust1.getItemPrice());
    }
    
}
