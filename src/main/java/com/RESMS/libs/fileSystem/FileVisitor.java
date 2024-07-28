/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.RESMS.libs.fileSystem;

import com.RESMS.libs.object.Employee;
import com.RESMS.libs.object.Buyer;
import com.RESMS.libs.object.Reservation;
import com.RESMS.libs.object.Property;
import com.RESMS.libs.object.Offer;
import com.RESMS.libs.object.Transaction;
/**
 *
 * @author JohnLloydProg
 */
public interface FileVisitor {
    public void item(Buyer buyer);
    public void item(Reservation reservation);
    public void item(Transaction transaction);
    public void item(Employee employee);
    public void item(Offer offer);
    public void item(Property property);
}
