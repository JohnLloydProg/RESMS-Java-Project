/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.RESMS.libs.fileSystem;

import com.RESMS.libs.object.Buyer;
import com.RESMS.libs.object.Employee;
import com.RESMS.libs.object.Reservation;
import com.RESMS.libs.object.Property;
import com.RESMS.libs.object.Cash;
import com.RESMS.libs.object.Offer;
import com.RESMS.libs.object.Transaction;
import com.RESMS.libs.object.PaymentMethod;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;
/**
 *
 * @author JohnLloydProg
 */
public class Add implements FileVisitor{
    @Override
    public void item(Offer offer) {
        try {
            File offerFile = new File("Offers.txt");
            File cashFile = new File("Cash.txt");
            File installmentFile = new File("Installment.txt");
            if (offerFile.createNewFile()) {
                System.out.println("Created new file: " + offerFile.getName());
            }
            if (cashFile.createNewFile()) {
                System.out.println("Created new file: " + cashFile.getName());
            }
            if (installmentFile.createNewFile()) {
                System.out.println("Created new file: " + installmentFile.getName());
            }
            
            offer.setId("O-" + findId(offerFile));
            PaymentMethod paymentMethod = offer.getPaymentMethod();
            paymentMethod.setId(offer.getId());
            
            try (FileWriter offerFileWriter = new FileWriter("Offers.txt", true)) {
                offerFileWriter.write(offer.toCSV() + "\n");
            }
            if (paymentMethod instanceof Cash) {
                try (FileWriter cashFileWriter = new FileWriter("Cash.txt", true)) {
                    cashFileWriter.write(paymentMethod.toCSV() + "\n");
                }
            }else {
                try (FileWriter installmentFileWriter = new FileWriter("Installment.txt", true)) {
                    installmentFileWriter.write(paymentMethod.toCSV() + "\n");
                }
            }
            
            System.out.println("Offer added successfully");
        }catch (IOException err) {
            System.out.println("An error occured while adding an offer");
        }
    }
    
    @Override
    public void item(Property property) {
        try {
            File propertyFile = new File("Properties.txt");
            if (propertyFile.createNewFile()) {
                System.out.println("Created new file: " + propertyFile.getName());
            }
            
            property.setId("P-" + findId(propertyFile));
            
            try (FileWriter propertyFileWriter = new FileWriter("Properties.txt", true)) {
                propertyFileWriter.write(property.toCSV() + "\n");
            }
            System.out.println("Property added successfully");
        }catch (IOException err) {
            System.out.println("An error occured while adding a property");
        }
    }
    
    @Override
    public void item(Transaction transaction) {
        try {
            File transactionFile = new File("Transactions.txt");
            if (transactionFile.createNewFile()) {
                System.out.println("Created new file: " + transactionFile.getName());
            }
            
            transaction.setId("T-" + findId(transactionFile));
            
            try (FileWriter transactionFileWriter = new FileWriter("Transactions.txt", true)) {
                transactionFileWriter.write(transaction.toCSV() + "\n");
            }
            System.out.println("Transaction added successfully");
        }catch (IOException err) {
            System.out.println("An error occured while adding a transaction");
        }
    }
    
    @Override
    public void item(Employee employee) {
        try {
            File employeeFile = new File("Employees.txt");
            if (employeeFile.createNewFile()) {
                System.out.println("Created new file: " + employeeFile.getName());
            }
            
            employee.setId("E-" + findId(employeeFile));
            
            try (FileWriter employeeFileWriter = new FileWriter("Employees.txt", true)) {
                employeeFileWriter.write(employee.toCSV() + "\n");
            }
            System.out.println("Employee added successfully");
        }catch (IOException err) {
            System.out.println("An error occured while adding an employee");
        }
    }
    
    @Override
    public void item(Reservation reservation) {
        try {
            File reservationFile = new File("Reservations.txt");
            if (reservationFile.createNewFile()) {
                System.out.println("Created new file: " + reservationFile.getName());
            }
            
            reservation.setId("R-" + findId(reservationFile));
            
            try (FileWriter reservationFileWriter = new FileWriter("Reservations.txt", true)) {
                reservationFileWriter.write(reservation.toCSV() + "\n");
            }
            System.out.println("Reservation added successfully");
        }catch (IOException err) {
            System.out.println("An error occured while adding a reservation");
        }
    }
    
    @Override
    public void item(Buyer buyer) {
        try {
            File buyerFile = new File("Buyers.txt");
            if (buyerFile.createNewFile()) {
                System.out.println("Created new file: " + buyerFile.getName());
            }
            
            buyer.setId("B-" + findId(buyerFile));
            
            try (FileWriter buyerFileWriter = new FileWriter("Buyers.txt", true)) {
                buyerFileWriter.write(buyer.toCSV() + "\n");
            }
            System.out.println("Buyer added successfully");
        }catch (IOException err) {
            System.out.println("An error occured while adding a buyer");
        }
    }
    
    private static int findId(File file) {
        int id = -1;
        try {
            Scanner fileReader = new Scanner(file);
            String csv = "";
            while (fileReader.hasNextLine()) {
                csv = fileReader.nextLine();
            }
            if (csv.length() > 0) {
                id = Integer.parseInt(csv.split(",")[0].split("-")[1]);
            }
        } catch (IOException err) {
            System.out.println("Can't find the file: " + file.getName());
        }
        return id + 1;
    }
}
