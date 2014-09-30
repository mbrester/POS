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
    private int Qty;

    public PercentOffDiscount(double discountPercent, int Qty) {
        this.discountPercent = discountPercent;
        this.Qty = Qty;
    }

    

    
    
    
   
    public double getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }
    
   
    

    @Override
    public double dicountItems() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setQty(int qty) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
