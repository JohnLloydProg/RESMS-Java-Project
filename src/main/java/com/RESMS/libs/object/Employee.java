/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.RESMS.libs.object;

import com.RESMS.libs.fileSystem.FileVisitor;
import java.util.List;
import com.unida.myapps.*;
/**
 *
 * @author JohnLloydProg
 */
public class Employee implements IData {
    private String lastName;
    private String firstName;
    private int id;
    private String credentials;

    public Employee(String lastName, String firstName, String credentials) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.credentials = credentials;
    }
    
    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getId() {
        return "E-" + this.id;
    }
    
    public void setId(String id) {
        this.id = Integer.parseInt(id.split("-")[1]);
    }

    public String getCredentials() {
        return credentials;
    }

    public void setCredentials(String credentials) {
        this.credentials = credentials;
    }
    
    public String getDetails() {
        return "Name: " + firstName + " " + lastName + "\n" +
               "ID: " + id + "\n" +
               "Credentials: " + credentials;
    }
    
    public void generateReport() {
        String report = "Employee Report:\n" +
            "Name: " + firstName + " " + lastName + "\n" +
            "ID: " + id + "\n" +
            "Credentials: " + credentials + "\n";
    }
    
    @Override
    public String toCSV() {
        return (this.getId() + "," + this.lastName + "," + this.firstName + "," + this.credentials);
    }
    
    @Override
    public void fileAction(FileVisitor visitor) {
        visitor.item(this);
    }
}
