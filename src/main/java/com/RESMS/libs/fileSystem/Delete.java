/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.RESMS.libs.fileSystem;

import com.RESMS.libs.object.Installment;
import com.RESMS.libs.object.Employee;
import com.RESMS.libs.object.Buyer;
import com.RESMS.libs.object.Reservation;
import com.RESMS.libs.object.Property;
import com.RESMS.libs.object.Cash;
import com.RESMS.libs.object.Offer;
import com.RESMS.libs.object.PaymentMethod;
import com.RESMS.libs.object.Transaction;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
/**
 *
 * @author JohnLloydProg
 */
public class Delete implements FileVisitor{
    @Override
    public void item(Buyer buyer) {
        ArrayList<Buyer> buyers = Read.getBuyers();
        try {
            try (FileWriter fileWriter = new FileWriter("Buyers.txt")) {
                for (Buyer buyerData : buyers) {
                    if (!(buyer.getId().contentEquals(buyerData.getId()))) {
                        fileWriter.write(buyerData.toCSV() + "\n");
                    }
                }
            }
            System.out.println("Deleted a buyer");
        }catch (IOException err) {
            System.out.println("An error occured while deleting buyer");
        }
    }
    
    @Override
    public void item(Reservation reservation) {
        ArrayList<Reservation> reservations = Read.getReservations();
        try {
            try (FileWriter fileWriter = new FileWriter("Reservations.txt")) {
                for (Reservation reservationData : reservations) {
                    if (!(reservation.getId().contentEquals(reservationData.getId()))) {
                        fileWriter.write(reservationData.toCSV() + "\n");
                    }
                }
            }
            System.out.println("Deleted a reservation");
        }catch (IOException err) {
            System.out.println("An error occured while deleting reservation");
        }
    }
    
    @Override
    public void item(Transaction transaction) {
        ArrayList<Transaction> transactions = Read.getTransactions();
        try {
            try (FileWriter fileWriter = new FileWriter("Transactions.txt")) {
                for (Transaction transactionData : transactions) {
                    if (!(transaction.getId().contentEquals(transactionData.getId()))) {
                        fileWriter.write(transactionData.toCSV() + "\n");
                    }
                }
            }
            System.out.println("Deleted a transaction");
        }catch (IOException err) {
            System.out.println("An error occured while deleting transaction");
        }
    }
    
    @Override
    public void item(Employee employee) {
        ArrayList<Employee> employees = Read.getEmployees();
        try {
            try (FileWriter fileWriter = new FileWriter("Employees.txt")) {
                for (Employee employeeData : employees) {
                    if (!(employee.getId().contentEquals(employeeData.getId()))) {
                        fileWriter.write(employeeData.toCSV() + "\n");
                    }
                }
            }
            System.out.println("Deleted an employee");
        }catch (IOException err) {
            System.out.println("An error occured while deleting employee");
        }
    }
    
    @Override
    public void item(Offer offer) {
        ArrayList<Offer> offers = Read.getOffers();
        try {
            try (FileWriter fileWriter = new FileWriter("Offers.txt")) {
                for (Offer offerData : offers) {
                    if (!(offer.getId().contentEquals(offerData.getId()))) {
                        fileWriter.write(offerData.toCSV() + "\n");
                    }
                }
            }
            PaymentMethod paymentMethod = offer.getPaymentMethod();
            if (paymentMethod instanceof Cash) {
                ArrayList<Cash> cash = Read.getCash();
                try (FileWriter fileWriter = new FileWriter("Cash.txt")) {
                    for (Cash cashData : cash) {
                        if (!(paymentMethod.getId().contentEquals(cashData.getId()))) {
                            fileWriter.write(cashData.toCSV() + "\n");
                        }
                    }
                }
            }else {
                ArrayList<Installment> installment = Read.getInstallment();
                try (FileWriter fileWriter = new FileWriter("Installment.txt")) {
                    for (Installment installmentData : installment) {
                        if (!(paymentMethod.getId().contentEquals(installmentData.getId()))) {
                            fileWriter.write(installmentData.toCSV() + "\n");
                        }
                    }
                }
            }
            System.out.println("Deleted an offer");
        }catch (IOException err) {
            System.out.println("An error occured while deleting offer");
        }
    }
    
    @Override
    public void item(Property property) {
        ArrayList<Property> properties = Read.getProperties();
        try {
            try (FileWriter fileWriter = new FileWriter("Properties.txt")) {
                for (Property propertyData : properties) {
                    if (!(property.getId().contentEquals(propertyData.getId()))) {
                        fileWriter.write(propertyData.toCSV() + "\n");
                    }
                }
            }
            System.out.println("Deleted a property");
        }catch (IOException err) {
            System.out.println("An error occured while deleting property");
        }
    }
}
