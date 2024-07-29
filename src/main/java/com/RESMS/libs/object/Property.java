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
public class Property implements IData {
    private Buyer owner;
    private int lot;
    private int block;
    private double SRP;
    private double size;
    private String description;
    private Reservation reservation;
    private int id;

    public Property(int lot, int block, double SRP, double size, String description) {
        this.lot = lot;
        this.block = block;
        this.SRP = SRP;
        this.size = size;
        this.description = description;
    }

    public Property(int lot, int block, double SRP, double size, String description, Reservation reservation) {
        this.lot = lot;
        this.block = block;
        this.SRP = SRP;
        this.size = size;
        this.description = description;
        this.reservation = reservation;
    }

    public Property(Buyer owner, int lot, int block, double SRP, double size, String description) {
        this.owner = owner;
        this.lot = lot;
        this.block = block;
        this.SRP = SRP;
        this.size = size;
        this.description = description;
    }
    
    public String getDetails() {
        return "" + owner + lot + block + SRP + size + description + reservation + id;
    }
    
    public void setOwner(Buyer owner) {
        this.owner = owner;
    }

    public Buyer getOwner() {
        return owner;
    }

    public int getLot() {
        return lot;
    }

    public int getBlock() {
        return block;
    }

    public double getSRP() {
        return SRP;
    }

    public double getSize() {
        return size;
    }

    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public Reservation getReservation() {
        return reservation;
    }
    
    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public String getId() {
        return "P-" + this.id;
    }
    
    public void setId(String id) {
        this.id = Integer.parseInt(id.split("-")[1]);
    }
    
    @Override
    public String toCSV() {
        String csv = "P-" + this.id + ",";
        if (this.owner != null) {
            csv += this.owner.getId() + ",";
        }
        csv += this.lot + "," + this.block + "," + this.SRP + "," + this.size + "," + this.description;
        if (this.reservation != null) {
            csv += "," + this.reservation.getId();
        }
        return csv;
    }
    
    @Override
    public void fileAction(FileVisitor visitor) {
        visitor.item(this);
    }
    
    
}
