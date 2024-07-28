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
public class Reservation implements IData{
    private double price;
    private String dueDate;
    private Buyer buyer;
    private int id;
    
    public Reservation(Buyer buyer, double price, String dueDate) {
        this.buyer = buyer;
        this.price = price;
        this.dueDate = dueDate;
    }
    
    public String getId() {
        return "R-" + this.id;
    }
    
    public void setId(String id) {
        this.id = Integer.parseInt(id.split("-")[1]);
    }
    
    public Buyer getBuyer() {
        return this.buyer;
    }
    
    public double getPrice() {
        return this.price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public String getDueDate() {
        return this.dueDate;
    }
    
    public String getDetails() {
        return "" + price + dueDate + buyer;
    }
    
    public String toCSV() {
        return ("R-" + this.id + "," + this.buyer.getId() + "," + this.price + "," + this.dueDate);
    }
    
    @Override
    public void fileAction(FileVisitor visitor) {
        visitor.item(this);
    }
}
