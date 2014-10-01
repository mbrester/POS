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
public class PercentOffDiscount implements DiscountStrategy {
    private double discountPercent;
    private double discountedPrice;

    public PercentOffDiscount(double discountPercent) {
        this.discountPercent = discountPercent;
    }
    
    

    public double getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    @Override
    public double getDiscountedPrice(double itemPrice) {
        discountedPrice = itemPrice - (itemPrice *discountPercent);
        return discountedPrice;
    }
    
   
    

    
}
