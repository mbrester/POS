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
public class Customer {
    private String custName;
    private String custID;

    public Customer(String custID, String custName) {
        setCustName(custName);
        this.custID = custID;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName){
        if(custName.isEmpty()){
            throw new IllegalArgumentException();
        }
        this.custName = custName;
    }

    public String getCustID() {
        return custID;
    }

    public void setCustID(String custID) {
        if(custID.isEmpty()){
            throw new IllegalArgumentException();
        }
        this.custID = custID;
    }
    
    
}
