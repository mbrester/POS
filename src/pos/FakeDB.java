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
     private Product [] products = {
        new Product("111","Baseball ", 5.00 , new PercentOffDiscount()),
        new Product("112", "Football", 10.00, new FlatRateDiscount()),
        new Product ("113", "Hockey Stick", 25.00, new PercentOffDiscount())
    };
    Product product;
    public Product findProduct(String productId){
        for (Product p : products){
            if(productId.equals(product.getItemNumber())){
                product = p;
                break;
            }
                
        }
        return product;
    }
    
    
    public String[] custID = {"aaa","bbb","ccc"};
    private String[] custName = {"Bob","Tom","Rob"};

    

    public String getCustID(int i) {
        return custID[i];
    }

    public String getCustName(int i) {
        return custName[i];
    }

   
         
    
}
