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
        Register cust1 = new Register(new Receipt(new ConsoleReceipt("111","aaa",2)));
        cust1.addProduct("112", 7);
        cust1.getReceipt();
        
        
       Register cust2 = new Register(new Receipt(new ConsoleReceipt("112","bbb",3))); 
       cust2.addProduct("113", 2);
       cust2.getReceipt();
        
        
    }
    
}
