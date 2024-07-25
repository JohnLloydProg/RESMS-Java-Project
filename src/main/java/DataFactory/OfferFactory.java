
package DataFactory;

public abstract class OfferFactory implements DataFactory {
    
    public Data createData(double discount, String currency, Property currentProperty) {
        return new Offer(discount, currency, currentProperty);
    }

}
