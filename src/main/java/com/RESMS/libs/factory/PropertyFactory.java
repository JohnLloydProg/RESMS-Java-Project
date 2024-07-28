
package com.RESMS.libs.factory;
import com.RESMS.libs.object.Buyer;
import com.RESMS.libs.object.Property;
import com.RESMS.libs.object.Reservation;
import static com.RESMS.libs.fileSystem.Read.getReservation;
import static com.RESMS.libs.fileSystem.Read.getBuyer;

public class PropertyFactory {
    
//    public Property createDataFromCSV(String csv) {
//        
//    }
    
      public Property createData(int lot, int block, double SRP, double size, String description) {
          return new Property(lot, block, SRP, size, description);
      }
      
      public Property createData(int lot, int block, double SRP, double size, String description, Reservation reservation) {
          return new Property(lot, block, SRP, size, description, reservation);
      }
      
      public Property createData(Buyer owner, int lot, int block, double SRP, double size, String description) {
          return new Property(owner, lot, block, SRP, size, description);
      }
      
      public Property createDataFromCSV(String csv) {
          int reservationId;
          int buyerId;
          String[] data = csv.split(",");
          Property property = null;
          
          switch (data.length) {
              case 6:
                  property = new Property(Integer.parseInt(data[1]), Integer.parseInt(data[2]), Double.parseDouble(data[3]), Double.parseDouble(data[4]), data[5]);
                  property.setId(data[0]);
                  break;
              case 7:
                  if (data[1].contains("B-")) {
                      buyerId = Integer.parseInt(data[1].split(",")[1]);
                      property = new Property(getBuyer(buyerId), Integer.parseInt(data[2]), Integer.parseInt(data[3]), Double.parseDouble(data[4]), Double.parseDouble(data[5]), data[6]);
                  }else {
                      reservationId = Integer.parseInt(data[6].split("-")[1]);
                      property = new Property(Integer.parseInt(data[1]), Integer.parseInt(data[2]), Double.parseDouble(data[3]), Double.parseDouble(data[4]), data[5], getReservation(reservationId));
                  }
                  property.setId(data[0]);
                  break;
              default:
                  System.out.println("Unreadable CSV format in property factory!");
          }
          
          return property;
      }
}
