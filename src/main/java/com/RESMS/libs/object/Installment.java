/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.RESMS.libs.object;

/**
 *
 * @author acer
 */
public class Installment implements PaymentMethod {
    private double totalAmount;
    private double downPayment;
    private double interest;
    private int numberOfPayments;
    private double finalPrice;
    private int id;

    public Installment(double totalAmount, double downPayment, double interest, int numberOfPayments) {
        this.totalAmount = totalAmount;
        this.downPayment = downPayment;
        this.interest = interest;
        this.numberOfPayments = numberOfPayments;
        double equalMonthlyInstallment = (totalAmount - downPayment) * (Math.pow(1 + interest, numberOfPayments)/(Math.pow(1 + interest, numberOfPayments) - 1));
        this.finalPrice = downPayment + (equalMonthlyInstallment * numberOfPayments);
    }
    
    @Override
    public String getId() {
        return "O-" + this.id;
    }
    
    @Override
    public void setId(String id) {
        this.id = Integer.parseInt(id.split("-")[1]);
    }
    
    @Override
    public String toCSV() {
        return (this.getId() + "," + this.totalAmount + "," + this.downPayment + "," + this.interest + "," + this.numberOfPayments);
    }

    @Override
    public String getPaymentDetails() {
        return "Installment payment of $" + totalAmount + " with down payment of $" + downPayment + " and interest rate of " + interest + "% paid " + numberOfPayments + " times";
    }
    
    @Override
    public double getFinalPrice() {
        return this.finalPrice;
    }
}
