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
public class FakeDB {
     private final Product [] products = {
        new Product("111","Hat ", 5.00 , new PercentOffDiscount(.15)),
        new Product("112", "T-Shirt", 10.00, new FlatRateDiscount(5)),
        new Product ("113", "Tree", 25.00, new NoDiscount())
    };
    private Product product;
    public Product findItem(String productId){
        for (int i = 0; i<products.length;i++){
            
            if(productId.equals(products[i].getProductNumber())){
                product = products[i];
                ;
            }
                
        }
        return product;
    }
    
    private Customer [] customers = {
       new Customer("aaa","Bob"),
       new Customer("bbb","Tom"),
       new Customer("ccc","Rob")
    };
    private Customer customer;
    public Customer findCustomer(String custId){
        for (int i = 0; i<customers.length;i++){
            if(custId.equals(customers[i])){
                customer = customers[i];
                
                break;
            }
                
        }
        return customer;
    }

    

   

   
         
    
}
