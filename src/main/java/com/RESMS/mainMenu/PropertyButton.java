/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.RESMS.mainMenu;

import com.RESMS.libs.object.Property;

/**
 *
 * @author JohnLloydProg
 */
public class PropertyButton extends javax.swing.JButton{
    private Property property;
    
    public PropertyButton(Property property) {
        super();
        this.property = property;
        this.setText("L " + this.property.getLot());
    }
    
    public Property getProperty() {
        return this.property;
    }
}
