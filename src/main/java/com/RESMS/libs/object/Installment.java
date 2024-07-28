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
    private int numberOfYears;
    private double finalPrice;
    private int id;

    public Installment(double totalAmount, double downPayment, double interest, int numberOfYears) {
        this.totalAmount = totalAmount;
        this.downPayment = downPayment;
        this.interest = interest;
        this.numberOfYears = numberOfYears;
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
        return (this.getId() + "," + this.totalAmount + "," + this.downPayment + "," + this.interest + "," + this.numberOfYears);
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
