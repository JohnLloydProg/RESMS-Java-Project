
package DataFactory;


public class Offer implements IData {
    
    private double discount;
    private String currency;
    private Property currentProperty;
    private PaymentMethod paymentMethod;
    
    public Offer(double discount, String currency, Property currentProperty, PaymentMethod paymentMethod) {
        this.discount = discount;
        this.currency = currency;
        this.currentProperty = currentProperty;
        this.paymentMethod = paymentMethod;
    }
    
    public String getDetails() {
        return " " + discount + currency;
    }

    public double getDiscount() {
        return discount;
    }

    public String getCurrency() {
        return currency;
    }

    public Property getCurrentProperty() {
        return currentProperty;
    }

    
}
