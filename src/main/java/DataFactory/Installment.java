
package DataFactory;


public class Installment implements PaymentMethod {
    private double totalAmount;
    private double downPayment;
    private double interest;
    private int numberOfYears;
    private double finalPrice;

    public Installment(double totalAmount, double downPayment, double interest, int numberOfYears) {
        this.totalAmount = totalAmount;
        this.downPayment = downPayment;
        this.interest = interest;
        this.numberOfYears = numberOfYears;
    }

    @Override
    public String getPaymentDetails() {
        return "Installment payment of $" + totalAmount + " with down payment of $" + downPayment + " and interest rate of " + interest + "% over " + numberOfYears + " years";
    }

    @Override
    public void calculateFinalPrice() {
        finalPrice = totalAmount + (totalAmount * interest * numberOfYears);
    }
}
