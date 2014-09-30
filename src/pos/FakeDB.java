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
public class FakeDB {
    public String[] itemNumbers = {"111","112","113"};
    private String[] itemNames = {"White T-shirt","Hat","Shoes"};
    private double[] itemPrices = {10.00,15.95,35.00};
    
    
    
    public String[] custID = {"aaa","bbb","ccc"};
    private String[] custName = {"Bob","Tom","Rob"};

    public  String getItemNumber(int i)
    {
        System.out.println(i);
        return itemNumbers[i];
    }

    public String getItemNames(int i) {
        return itemNames[i];
    }

    public double getItemPrices(int i) {
        return itemPrices[i];
    }

    public String getCustID(int i) {
        return custID[i];
    }

    public String getCustName(int i) {
        return custName[i];
    }

   
         
    
}
