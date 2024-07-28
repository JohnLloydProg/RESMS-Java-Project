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
import com.RESMS.libs.factory.EmployeeFactory;
import com.RESMS.libs.factory.OfferFactory;
import com.RESMS.libs.factory.BuyerFactory;
import com.RESMS.libs.factory.TransactionFactory;
import com.RESMS.libs.factory.CashFactory;
import com.RESMS.libs.factory.InstallmentFactory;
import com.RESMS.libs.factory.PropertyFactory;
import com.RESMS.libs.factory.ReservationFactory;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;
/**
 *
 * @author JohnLloydProg
 */
public class Read {
    public static Buyer getBuyer(int id) {
        BuyerFactory factory = new BuyerFactory();
        Buyer buyer = null;
        try {
            File buyerFile = new File("Buyers.txt");
            Scanner fileReader = new Scanner(buyerFile);
            String csv;
            int dataId;
            while (fileReader.hasNextLine()) {
                csv = fileReader.nextLine();
                dataId = Integer.parseInt(csv.split(",")[0].split("-")[1]);
                if (dataId == id) {
                    buyer = factory.createDataFromCSV(csv);
                    break;
                }
            }
        }catch (FileNotFoundException err) {
            System.out.println("Buyers.txt file does not exist");
        }
        return buyer;
    }
    
    public static ArrayList<Buyer> getBuyers() {
        BuyerFactory factory = new BuyerFactory();
        ArrayList<Buyer> buyers = new ArrayList<Buyer>();
        try {
            File buyerFile = new File("Buyers.txt");
            Scanner fileReader = new Scanner(buyerFile);
            
            while (fileReader.hasNextLine()) { 
               buyers.add(factory.createDataFromCSV(fileReader.nextLine()));
            }
        }catch (FileNotFoundException err) {
            System.out.println("Buyers.txt file does not exist");
        }
        return buyers;
    }
    
    public static Reservation getReservation(int id) {
        ReservationFactory factory = new ReservationFactory();
        Reservation reservation = null;
        try {
            File reservationFile = new File("Reservations.txt");
            Scanner fileReader = new Scanner(reservationFile);
            String csv;
            int dataId;
            while (fileReader.hasNextLine()) {
                csv = fileReader.nextLine();
                dataId = Integer.parseInt(csv.split(",")[0].split("-")[1]);
                if (dataId == id) {
                    reservation = factory.createDataFromCSV(csv);
                    break;
                }
            }
        }catch (FileNotFoundException err) {
            System.out.println("Reservations.txt file does not exist");
        }
        return reservation;
    }
    
    public static ArrayList<Reservation> getReservations() {
        ReservationFactory factory = new ReservationFactory();
        ArrayList<Reservation> reservations = new ArrayList<Reservation>();
        try {
            File reservationFile = new File("Reservations.txt");
            Scanner fileReader = new Scanner(reservationFile);
            while (fileReader.hasNextLine()) {
                reservations.add(factory.createDataFromCSV(fileReader.nextLine()));
            }
        }catch (FileNotFoundException err) {
            System.out.println("Resrvations.txt file does not exist");
        }  
        return reservations;
    }
    
    public static Property getProperty(int id) {
        PropertyFactory factory = new PropertyFactory();
        Property property = null;
        try {
            File propertyFile = new File("Properties.txt");
            Scanner fileReader = new Scanner(propertyFile);
            String csv;
            int dataId;
            while (fileReader.hasNextLine()) {
                csv = fileReader.nextLine();
                dataId = Integer.parseInt(csv.split(",")[0].split("-")[1]);
                if (dataId == id) {
                    property = factory.createDataFromCSV(csv);
                    break;
                }
            }
        }catch (FileNotFoundException err) {
            System.out.println("Properties.txt file does not exist");
        }
        return property;
    }
    
    public static ArrayList<Property> getProperties() {
        PropertyFactory factory = new PropertyFactory();
        ArrayList<Property> properties = new ArrayList<Property>();
        try {
            File propertyFile = new File("Properties.txt");
            Scanner fileReader = new Scanner(propertyFile);
            while (fileReader.hasNextLine()) {
                properties.add(factory.createDataFromCSV(fileReader.nextLine()));
            }
        }catch (FileNotFoundException err) {
            System.out.println("Reservations.txt file does not exist");
        }
        return properties;
    }
    
    public static Employee getEmployee(int id) {
        EmployeeFactory factory = new EmployeeFactory();
        Employee employee = null;
        try {
            File employeeFile = new File("Employees.txt");
            Scanner fileReader = new Scanner(employeeFile);
            String csv;
            int dataId;
            while (fileReader.hasNextLine()) {
                csv = fileReader.nextLine();
                dataId = Integer.parseInt(csv.split(",")[0].split("-")[1]);
                if (dataId == id) {
                    employee = factory.createDataFromCSV(csv);
                    break;
                }
            }
        }catch (FileNotFoundException err) {
            System.out.println("Employees.txt file does not exist.");
        }
        return employee;
    }
    
    public static ArrayList<Employee> getEmployees() {
        EmployeeFactory factory = new EmployeeFactory();
        ArrayList<Employee> employees = new  ArrayList<Employee>();
        try {
            File employeeFile = new File("Employees.txt");
            Scanner fileReader = new Scanner(employeeFile);
            while (fileReader.hasNextLine()) {
                employees.add(factory.createDataFromCSV(fileReader.nextLine()));
            }
        }catch (FileNotFoundException err) {
            System.out.println("Employees.txt file does not exist.");
        }
        return employees;
    }
    
    public static Offer getOffer(int id) {
        OfferFactory factory = new OfferFactory();
        Offer offer = null;
        try {
            File offerFile = new File("Offers.txt");
            Scanner fileReader = new Scanner(offerFile);
            String csv;
            int dataId;
            while (fileReader.hasNextLine()) {
                csv = fileReader.nextLine();
                dataId = Integer.parseInt(csv.split(",")[0].split("-")[1]);
                if (dataId == id) {
                    offer = factory.createDataFromCSV(csv);
                    break;
                }
            }
        }catch (FileNotFoundException err) {
            System.out.println("Offers.txt file does not exist.");
        }
        return offer;
    }
    
    public static ArrayList<Offer> getOffers() {
        OfferFactory factory = new OfferFactory();
        ArrayList<Offer> offers = new ArrayList<Offer>();
        try {
            File offerFile = new File("Offers.txt");
            Scanner fileReader = new Scanner(offerFile);
            while (fileReader.hasNextLine()) {
                offers.add(factory.createDataFromCSV(fileReader.nextLine()));
            }
        }catch (FileNotFoundException err) {
            System.out.println("Offers.txt file does not exist.");
        }
        return offers;
    }
    
    public static Transaction getTransaction(int id) {
        TransactionFactory factory = new TransactionFactory();
        Transaction transaction = null;
        try {
            File transactionFile = new File("Transactions.txt");
            Scanner fileReader = new Scanner(transactionFile);
            int dataId;
            String csv;
            while (fileReader.hasNextLine()) {
                csv = fileReader.nextLine();
                dataId = Integer.parseInt(csv.split(",")[0].split("-")[1]);
                if (dataId == id) {
                    transaction = factory.createDataFromCSV(csv);
                    break;
                }
            }
        }catch (FileNotFoundException err) {
            System.out.println("Transactions.txt file does not exist.");
        }
        return transaction;
    }
    
    public static ArrayList<Transaction> getTransactions() {
        TransactionFactory factory = new TransactionFactory();
        ArrayList<Transaction> transactions = new ArrayList<Transaction>();
        try {
            File transactionFile = new File("Transactions.txt");
            Scanner fileReader = new Scanner(transactionFile);
            while (fileReader.hasNextLine()) {
                transactions.add(factory.createDataFromCSV(fileReader.nextLine()));
            }
        }catch (FileNotFoundException err) {
            System.out.println("Transactions.txt file does not exist.");
        }
        return transactions;
    }
    
    public static PaymentMethod getPaymentMethod(String id) {
        CashFactory cashFactory = new CashFactory();
        InstallmentFactory installmentFactory = new InstallmentFactory();
        PaymentMethod paymentMethod = null;
        try {
            File cashFile = new File("Cash.txt");
            File installmentFile = new File("Installment.txt");
            Scanner fileReader = new Scanner(cashFile);
            String csv;
            String dataId;
            while (fileReader.hasNextLine()) {
                csv = fileReader.nextLine();
                dataId = csv.split(",")[0];
                if (dataId.contentEquals(id)) {
                    paymentMethod = cashFactory.createDataFromCSV(csv);
                }
            }
            if (paymentMethod == null) {
                fileReader = new Scanner(installmentFile);
                while (fileReader.hasNextLine()) {
                    csv = fileReader.nextLine();
                    dataId = csv.split(",")[0];
                    if (dataId.contentEquals(id)) {
                        paymentMethod = installmentFactory.createDataFromCSV(csv);
                    }
                }
            }
        }catch (FileNotFoundException err) {
            System.out.println("Cash.txt or Installment.txt file does not exist.");
        }
        return paymentMethod;
    }
    
    public static ArrayList<Cash> getCash() {
        CashFactory factory = new CashFactory();
        ArrayList<Cash> cash = new ArrayList<Cash>();
        try {
            File cashFile = new File("Cash.txt");
            Scanner fileReader = new Scanner(cashFile);
            while (fileReader.hasNextLine()) {
                cash.add(factory.createDataFromCSV(fileReader.nextLine()));
            }
        }catch (FileNotFoundException err) {
            System.out.println("Cash.txt file does not exist.");
        }
        return cash;
    }
    
    public static ArrayList<Installment> getInstallment() {
        InstallmentFactory factory = new InstallmentFactory();
        ArrayList<Installment> installment = new ArrayList<Installment>();
        try {
            File installmentFile = new File("Installment.txt");
            Scanner fileReader = new Scanner(installmentFile);
            while (fileReader.hasNextLine()) {
                installment.add(factory.createDataFromCSV(fileReader.nextLine()));
            }
        }catch (FileNotFoundException err) {
            System.out.println("Installment.txt file does not exist.");
        }
        return installment;
    }
}
