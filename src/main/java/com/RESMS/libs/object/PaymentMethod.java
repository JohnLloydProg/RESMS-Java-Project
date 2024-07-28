/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.RESMS.libs.object;

/**
 *
 * @author acer
 */
public interface PaymentMethod {
    String getPaymentDetails();
    void calculateFinalPrice();
    public String getId();
    public void setId(String id);
    String toCSV();
}
