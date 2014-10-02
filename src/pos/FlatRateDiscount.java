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
public class FlatRateDiscount implements DiscountStrategy {
    private double discount;
    private double discountedPrice;

    public FlatRateDiscount(double discount) {
        this.discount = discount;
    }
    
    
     

    /**
     * This is the setter for discount
     * @param discount the amount that is discounted, it is a flat rate.
     */
    public void setDiscount(double discount) {
        if(discount < 0|| discount > 100){
            throw new IllegalArgumentException();
        }
        this.discount = discount;
    }

    
    @Override
    public double getDiscount() {
        return discount;
    }

    @Override
    public double getDiscountedPrice(double itemPrice) {
       discountedPrice = itemPrice -discount;
        return discountedPrice;
    }
    
}
