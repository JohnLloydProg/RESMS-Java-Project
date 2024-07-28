
package com.RESMS.libs.factory;

import com.RESMS.libs.object.Buyer;
import com.RESMS.libs.object.Employee;
import com.RESMS.libs.object.Offer;
import com.RESMS.libs.object.Transaction;
import static com.RESMS.libs.fileSystem.Read.getEmployee;
import static com.RESMS.libs.fileSystem.Read.getBuyer;
import static com.RESMS.libs.fileSystem.Read.getOffer;

public class TransactionFactory {
//    public Transaction createDataFromCSV(String csv) {
//        
//    }
    
    public Transaction createData(Employee employee, Buyer buyer, Offer offer) {
        return new Transaction(employee, buyer, offer);
    }
    
    public Transaction createDataFromCSV(String csv) {
        String[] data = csv.split(",");
        int employeeId = Integer.parseInt(data[1].split("-")[1]);
        int buyerId = Integer.parseInt(data[2].split("-")[1]);
        int offerId = Integer.parseInt(data[3].split("-")[1]);
        Transaction transaction = new Transaction(getEmployee(employeeId), getBuyer(buyerId), getOffer(offerId));
        transaction.setId(data[0]);
        return transaction;
    }
}
