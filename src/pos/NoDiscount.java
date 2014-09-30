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

    private double discount;
    private int Qty;
    private double itemPrice;
    
    public NoDiscount(int qty, double price){
        
        this.setQty(qty);
        this.setItemPrices(price);
        
    }

    @Override
    public double dicountItems() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setQty(int qty) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setItemPrices(double itemPrice) {
        if(itemPrice < 0.00){
            throw new IllegalArgumentException("Item price must be greater than 0");
        }
        this.itemPrice = itemPrice;
    }
    
}
