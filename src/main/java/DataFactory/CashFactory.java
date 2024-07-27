
package DataFactory;


public class CashFactory {
    public Offer createData(double discount, String currency, Property currentProperty, Cash cash) {
        return new Offer(discount, currency, currentProperty, cash);
    }
}
