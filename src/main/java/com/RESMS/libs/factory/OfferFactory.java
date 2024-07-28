
package com.RESMS.libs.factory;

import com.RESMS.libs.object.Cash;
import com.RESMS.libs.object.Installment;
import com.RESMS.libs.object.Offer;
import com.RESMS.libs.object.Property;
import static com.RESMS.libs.fileSystem.Read.getProperty;
import static com.RESMS.libs.fileSystem.Read.getPaymentMethod;

public class OfferFactory {
    
    public Offer createData(String currency, Property currentProperty, Cash cash) {
        Offer offer = new Offer(currency, currentProperty);
        offer.setPaymentMethod(cash);
        return offer;
    }
    
    public Offer createData(String currency, Property currentProperty, Installment installment) {
        Offer offer = new Offer(currency, currentProperty);
        offer.setPaymentMethod(installment);
        return offer;
    }
    
    public Offer createDataFromCSV(String csv) {
        String[] data = csv.split(",");
        int propertyId = Integer.parseInt(data[2].split("-")[1]);
        Offer offer = new Offer(data[1], getProperty(propertyId));
        offer.setId(data[0]);
        offer.setPaymentMethod(getPaymentMethod(offer.getId()));
        offer.getPaymentMethod().setId(offer.getId());
        return offer;
    }
}
