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
public class Transaction implements IData {
    private Employee agent;
    private Buyer buyer;
    private Offer offer;
    private int id;
    
    public Transaction(Employee agent, Buyer buyer, Offer offer) {
        this.agent = agent;
        this.buyer = buyer;
        this.offer = offer;
    }
    
    public String getDetails() {
        return "" + agent + buyer + offer;
                
    }

    public Buyer getBuyer() {
        return buyer;
    }
    
    public Employee getAgent() {
        return this.agent;
    }

    public Offer getOffer() {
        return offer;
    }
    
    public String getId() {
        return "T-" + this.id;
    }
    
    public void setId(String id) {
        this.id = Integer.parseInt(id.split("-")[1]);
    }
    
    @Override
    public String toCSV() {
        return this.getId() + "," + this.agent.getId() + "," + this.buyer.getId() + "," + this.offer.getId();
    }
    
    @Override
    public void fileAction(FileVisitor visitor) {
        visitor.item(this);
    }
}
