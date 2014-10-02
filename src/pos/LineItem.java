/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pos;

/**
 *
 * @author mbrester1
 */
public class LineItem {
    private final FakeDB dB = new FakeDB();
    private Product product;
    private int qty;
   

    public LineItem(Product product, int qty) {
        setProduct(product);
        setQty(qty);
    }

    public LineItem() {
    }

    
    public LineItem addLineItem(String productNumber, int qty){
       
        
       
       LineItem lineItem = new LineItem(dB.findItem(productNumber),qty);
        return lineItem;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        if(product == null){
            throw new IllegalArgumentException();
        }
        this.product = product;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        if(qty <1 || qty >5000){
            throw new IllegalArgumentException();
        }
        this.qty = qty;
    }

    public String getProductNumber() {
        return product.getProductNumber();
    }
    
    public double getProductPrice(){
       return product.getProductPrice() * qty;
    }
    public String getProductName(){
        return product.getProductName();
    }
    public double getDiscountedPrice(){
        return product.getDiscountedPrice()* qty;
    }
    public double getDiscount(){
        return product.getDiscount()* qty;
    }
    public String getLineItemData() {
     
        
        return 
                product.getProductNumber() + "\t            " + getProductName()
                + "\t   " + qty + "\t\t  " + getProductPrice() + "\t             "
                + getDiscount()+ "\t";
    }
    
    
    
}
