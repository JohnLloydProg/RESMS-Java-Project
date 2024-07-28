/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.RESMS.libs.fileSystem;

import com.RESMS.libs.object.Buyer;
import com.RESMS.libs.object.Employee;
import com.RESMS.libs.object.Offer;
import com.RESMS.libs.object.Property;
import com.RESMS.libs.object.Reservation;
import com.RESMS.libs.object.Transaction;
import com.RESMS.libs.object.PaymentMethod;
import com.RESMS.libs.object.Cash;
import com.RESMS.libs.object.Installment;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
/**
 *
 * @author JohnLloydProg
 */
public class Update implements FileVisitor{
    
    @Override
    public void item(Buyer buyer) {
        try {
            ArrayList<Buyer> buyers = Read.getBuyers();
            try (FileWriter fileWriter = new FileWriter("Buyers.txt")) {
                for (Buyer buyerData : buyers) {
                    if (buyer.getId().contentEquals(buyerData.getId())) {
                        fileWriter.write(buyer.toCSV() + "\n");
                    }else {
                        fileWriter.write(buyerData.toCSV() + "\n");
                    }
                }
            }
            System.out.println("Updated the buyer");
        }catch (IOException err) {
            System.out.println("An error occured while updating buyer");
        }
    }
    
    @Override
    public void item(Reservation reservation) {
        try {
            ArrayList<Reservation> reservations = Read.getReservations();
            try (FileWriter fileWriter = new FileWriter("Reservations.txt")) {
                for (Reservation reservationData : reservations) {
                    if (reservation.getId().contentEquals(reservationData.getId())) {
                        fileWriter.write(reservation.toCSV() + "\n");
                    }else {
                        fileWriter.write(reservationData.toCSV() + "\n");
                    }
                }
            }
            System.out.println("Updated the reservation");
        }catch (IOException err) {
            System.out.println("An error occured while updating reservation");
        }
    }
    
    @Override
    public void item(Transaction transaction) {
        try {
            ArrayList<Transaction> transactions = Read.getTransactions();
            try (FileWriter fileWriter = new FileWriter("Transactions.txt")) {
                for (Transaction transactionData : transactions) {
                    if (transaction.getId().contentEquals(transactionData.getId())) {
                        fileWriter.write(transaction.toCSV() + "\n");
                    }else {
                        fileWriter.write(transactionData.toCSV() + "\n");
                    }
                }
            }
            System.out.println("Updated the transaction");
        }catch (IOException err) {
            System.out.println("An error occured while updating transaction");
        }
    }
    
    @Override
    public void item(Employee employee) {
        try {
            ArrayList<Employee> employees = Read.getEmployees();
            try (FileWriter fileWriter = new FileWriter("Employees.txt")) {
                for (Employee employeeData : employees) {
                    if (employee.getId().contentEquals(employeeData.getId())) {
                        fileWriter.write(employee.toCSV() + "\n");
                    }else {
                        fileWriter.write(employeeData.toCSV() + "\n");
                    }
                }
            }
            System.out.println("Updated the employee");
        }catch (IOException err) {
            System.out.println("An error occured while updating employee");
        }
    }
    
    @Override
    public void item(Offer offer) {
        try {
            ArrayList<Offer> offers = Read.getOffers();
            try (FileWriter fileWriter = new FileWriter("Offers.txt")) {
                for (Offer offerData : offers) {
                    if (offer.getId().contentEquals(offerData.getId())) {
                        fileWriter.write(offer.toCSV() + "\n");
                    }else {
                        fileWriter.write(offerData.toCSV() + "\n");
                    }
                }
            }
            System.out.println("Updated the offer");
        }catch (IOException err) {
            System.out.println("An error occured while updating offer");
        }
    }
    
    @Override
    public void item(Property property) {
        try {
            ArrayList<Property> properties = Read.getProperties();
            try (FileWriter fileWriter = new FileWriter("Properties.txt")) {
                for (Property propertyData : properties) {
                    if (property.getId().contentEquals(propertyData.getId())) {
                        fileWriter.write(property.toCSV() + "\n");
                    }else {
                        fileWriter.write(propertyData.toCSV() + "\n");
                    }
                }
            }
            System.out.println("Updated the property");
        }catch (IOException err) {
            System.out.println("An error occured while updating property");
        }
    }
}
