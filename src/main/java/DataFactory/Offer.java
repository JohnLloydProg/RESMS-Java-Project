
package DataFactory;


public class Offer implements Data {
    
    private double discount;
    private String currency;
    private Property currentProperty;
    
    public Offer(double discount, String currency, Property currentProperty //, PaymentMethod paymentMethod
    ) {
        this.discount = discount;
        this.currency = currency;
        this.currentProperty = currentProperty;
        //this.paymentMethod = paymentMethod;
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
