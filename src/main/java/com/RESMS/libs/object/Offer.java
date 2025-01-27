/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.RESMS.libs.object;

import com.RESMS.libs.fileSystem.FileVisitor;
/**
 *
 * @author JohnLloydProg
 */
public class Offer implements IData {
    
    private String currency;
    private Property currentProperty;
    private PaymentMethod paymentMethod;
    private int id;
    
    public Offer(String currency, Property currentProperty) {
        this.currency = currency;
        this.currentProperty = currentProperty;
    }
    
    public String getDetails() {
        return " " + currency;
    }

    public String getCurrency() {
        return currency;
    }

    public Property getCurrentProperty() {
        return currentProperty;
    }
    
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getId() {
        return "O-" + this.id;
    }
    
    public void setId(String id) {
        this.id = Integer.parseInt(id.split("-")[1]);
    }
    
    public PaymentMethod getPaymentMethod() {
        return this.paymentMethod;
    }
    
    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    
    @Override
    public String toCSV() {
        return this.getId() + "," + this.currency + "," + this.currentProperty.getId();
    }
    
    @Override
    public void fileAction(FileVisitor visitor) {
        visitor.item(this);
    }
    
}