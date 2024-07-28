
package com.RESMS.libs.factory;

import com.RESMS.libs.object.Buyer;
import com.RESMS.libs.object.Reservation;
import static com.RESMS.libs.fileSystem.Read.getBuyer;


public class ReservationFactory {
    
    public Reservation createData(Buyer buyer, double price, String dueDate) {
        return new Reservation(buyer, price, dueDate);
    }
    
    public Reservation createDataFromCSV(String csv) {
        String[] data = csv.split(",");
        int buyerId = Integer.parseInt(data[1].split("-")[1]);
        Reservation reservation = new Reservation(getBuyer(buyerId), Double.parseDouble(data[2]), data[3]);
        reservation.setId(data[0]);
        return reservation;
    }
}
