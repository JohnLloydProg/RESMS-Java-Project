
package com.RESMS.libs.factory;

import com.RESMS.libs.object.Installment;


public class InstallmentFactory {
    
    public Installment createData(double totalAmount, double downPayment, double interest, int numberOfYears) {
        return new Installment(totalAmount, downPayment, interest, numberOfYears);
    }
    
    public Installment createDataFromCSV(String csv) {
        String[] data = csv.split(",");
        Installment installment = new Installment(Double.parseDouble(data[1]), Double.parseDouble(data[2]), Double.parseDouble(data[3]), Integer.parseInt(data[4]));
        installment.setId(data[0]);
        return installment;
    }
}
