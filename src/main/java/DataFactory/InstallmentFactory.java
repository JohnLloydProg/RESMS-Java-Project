
package DataFactory;


public class InstallmentFactory implements OfferFactory {
    
    public Offer createData(double discount, String currency, Property currentProperty, Installment installment) {
        return new Offer(discount, currency, currentProperty, installment);
    }
}
