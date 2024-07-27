
package DataFactory;


public class ReservationFactory {
    
    public Reservation createData(double price, String dueDate, Buyer buyer) {
        return new Reservation(price, dueDate, buyer);
    }
    
//    public Reservation createDataFromCSV(String csv) {
//        
//    }
}
