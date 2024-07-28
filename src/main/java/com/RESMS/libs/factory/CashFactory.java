
package com.RESMS.libs.factory;

import com.RESMS.libs.object.Cash;


public class CashFactory{
    
    public Cash createData(double finalPrice) {
        return new Cash(finalPrice);
    }
    
    public Cash createDataFromCSV(String csv) {
        String[] data = csv.split(",");
        Cash cash = new Cash(Double.parseDouble(data[1]));
        cash.setId(data[0]);
        return cash;
    }
}
