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
public interface DiscountStrategy {
    public double getDiscountedPrice(double itemPrice);
    
    
    
}
