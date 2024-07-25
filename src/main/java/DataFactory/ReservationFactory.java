
package DataFactory;


public abstract class ReservationFactory implements DataFactory {
    
    public Data createData(double price, String dueDate, Buyer buyer) {
        return new Reservation(price, dueDate, buyer);
    }
}
