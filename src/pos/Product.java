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
public class Product {
    private String productNumber;
    private String productName;
    private double productPrice;
    private DiscountStrategy dS;
    private double discountedPrice;
    private double discount;

    public Product(String itemNumber, String itemName, double itemPrice, DiscountStrategy dS) {
        this.productNumber = itemNumber;
        this.productName = itemName;
        this.productPrice = itemPrice;
        this.dS = dS;
        dicountItems();
    }

    

    public String getProductNumber() {
        
        return productNumber;
        
    }

    public void setProductNumber(String productNumber) {
        if(productNumber == null || productName.isEmpty()){
            throw new IllegalArgumentException();
        }
        this.productNumber = productNumber;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        if(productName == null || productName.isEmpty()){
            throw new IllegalArgumentException();
        }
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        if(productPrice < 5 ){
            throw new IllegalArgumentException();
        }
        this.productPrice = productPrice;
    }
    private void dicountItems(){
      this.discountedPrice = dS.getDiscountedPrice(productPrice);
    }

    public double getDiscountedPrice() {
        return discountedPrice;
    }

    public double getDiscount() {
        return dS.getDiscount();
    }
    
    
}
