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
    private double itemPrice;

    public PercentOffDiscount(double discountPercent) {
        setDiscountPercent(discountPercent);
    }
    
    

    public double getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(double discountPercent) {
        if(discountPercent < 0 || discountPercent > 1){
            throw new IllegalArgumentException();
        }
        this.discountPercent = discountPercent;
    }

    @Override
    public double getDiscountedPrice(double itemPrice) {
        this.itemPrice = itemPrice;
        discountedPrice = itemPrice - (itemPrice *discountPercent);
        return discountedPrice;
    }

    @Override
    public double getDiscount() {
       return (itemPrice * discountPercent);
    }
    
   
    

    
}
