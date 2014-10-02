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
public class NoDiscount  implements DiscountStrategy{

    @Override
    public double getDiscountedPrice(double itemPrice) {
        
        return itemPrice;
    }

    @Override
    public double getDiscount() {
        return 0;
    }

   
  
    
}
