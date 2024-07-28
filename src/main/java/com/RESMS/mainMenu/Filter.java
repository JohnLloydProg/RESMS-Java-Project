/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.RESMS.mainMenu;

import com.RESMS.libs.object.Buyer;
import com.RESMS.libs.object.Reservation;
/**
 *
 * @author JohnLloydProg
 */
public class Filter {
    private String minSize;
    private String maxSize;
    private String minPrice;
    private String maxPrice;
    private String block;
    private String state;

    public Filter(String minSize, String maxSize, String minPrice, String maxPrice, String block, String state) {
        this.minSize = minSize;
        this.maxSize = maxSize;
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
        this.block = block;
        this.state = state;
    }
    
    public boolean checkSize(double size) {
        if (!this.minSize.isBlank() && !this.maxSize.isBlank()) {
            return ((size >= Double.parseDouble(this.minSize)) && (size <= Double.parseDouble(this.maxSize)));
        }else {
            return true;
        }
        
    }
    
    public boolean checkPrice(double price) {
        if (!this.minPrice.isBlank() && !this.maxPrice.isBlank()) {
            return ((price >= Double.parseDouble(this.minPrice)) && (price <= Double.parseDouble(this.maxPrice)));
        }else {
            return true;
        }
    }
    
    public boolean checkBlock(int block) {
        if (!this.block.isBlank()) {
            return (Integer.parseInt(this.block) == block);
        }else {
            return true;
        }
        
    }
    
    public boolean checkState(Reservation reservation, Buyer buyer) {
        if (this.state.contentEquals("Available")) {
            return ((reservation == null) && (buyer == null));
        }else if (this.state.contentEquals("Reserved")){
            return ((reservation != null) && (buyer == null));
        }else {
            return ((reservation == null) && (buyer != null));
        }
    }
}
