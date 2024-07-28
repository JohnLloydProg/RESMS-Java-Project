/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.RESMS.libs.object;

/**
 *
 * @author acer
 */
public class Cash implements PaymentMethod {
    private double finalPrice;
    private int id;

    public Cash(double finalPrice) {
        this.finalPrice = finalPrice;
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
        return (this.getId() + "," + this.finalPrice);
    }

    @Override
    public String getPaymentDetails() {
        return "Cash payment of $" + finalPrice;
    }

    @Override
    public void calculateFinalPrice() {

    }
}
