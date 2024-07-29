/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.RESMS.mainMenu;

import com.RESMS.libs.object.Property;
import java.awt.Color;

/**
 *
 * @author JohnLloydProg
 */
public class PropertyButton extends javax.swing.JButton{
    private Property property;
    
    public PropertyButton(Property property) {
        super();
        this.property = property;
        this.setText("L " + this.property.getLot() + " B " + this.property.getBlock());
        if (this.property.getOwner() == null && this.property.getReservation() == null) {
            this.setBackground(Color.green);
        }else {
            this.setBackground(Color.red);
        }
    }
    
    public Property getProperty() {
        return this.property;
    }
    
    public void checkFilter(Filter filter) {
        if (filter.checkMinSize(this.property.getSize()) && filter.checkMaxSize(this.property.getSize()) && filter.checkMinPrice(this.property.getSRP()) 
                && filter.checkMaxPrice(this.property.getSRP()) && filter.checkBlock(this.property.getBlock()) && filter.checkState(this.property.getReservation(), this.property.getOwner())) {
            this.setBackground(Color.green);
        }else {
            this.setBackground(Color.red);
        }
    }
}
