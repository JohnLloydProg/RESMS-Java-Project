
package DataFactory;


public class Cash implements PaymentMethod {
    private double finalPrice;

    public Cash(double finalPrice) {
        this.finalPrice = finalPrice;
    }

    @Override
    public String getPaymentDetails() {
        return "Cash payment of $" + finalPrice;
    }

    @Override
    public void calculateFinalPrice() {

    }
}
