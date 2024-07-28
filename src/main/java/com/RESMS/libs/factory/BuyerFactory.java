
package com.RESMS.libs.factory;

import com.RESMS.libs.object.Buyer;


public class BuyerFactory{
    
    public Buyer createDataFromCSV(String csv) {
        String[] data  = csv.split(",");
        Buyer buyer = new Buyer(data[1], data[2]);
        buyer.setId(data[0]);
        return buyer;
    }
    
    public Buyer createData(String lastName, String firstName) {
        return new Buyer(lastName, firstName);
    }
}
