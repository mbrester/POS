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
public class DiscountManager {
    private DiscountStrategy d;

    public DiscountManager(DiscountStrategy d) {
        this.d = d;
    }
    
    public void discountItems(){
        d.dicountItems();
    }
    
}
