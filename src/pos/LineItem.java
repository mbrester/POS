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
    private String productNumber;

    public LineItem(Product product, int qty) {
        this.product = product;
        this.qty = qty;
    }

    public LineItem() {
    }

    
    public LineItem addLineItem(String productNumber, int qty){
       
       
       LineItem lineItem = new LineItem(dB.findItem(productNumber),qty);
//        System.out.println(lineItem.productNumber);
        return lineItem;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }
    
}
