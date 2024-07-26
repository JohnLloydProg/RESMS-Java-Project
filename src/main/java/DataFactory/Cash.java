/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataFactory;

/**
 *
 * @author acer
 */
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
