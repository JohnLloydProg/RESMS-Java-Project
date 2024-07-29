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
public class Employee implements IData {
    private String lastName;
    private String firstName;
    private int id;
    private String credentials;
    private String password;
    private static Employee user;

    public Employee(String lastName, String firstName, String credentials) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.credentials = credentials;
    }
    
    public static void setUser(Employee new_user) {
        user = new_user;
    }
    
    public static Employee getUser() {
        return user;
    }
    
    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getPassword() {
        return this.password;
    }
    
    public String getUserName() {
        StringBuilder userName = new StringBuilder();
        
        for (String firstName : this.firstName.split(" ")) {
            if (!firstName.isEmpty()) {
                userName.append(firstName.substring(0, 1).toLowerCase()); //first letter to lowercase
            }
        }

        userName.append(this.lastName.toLowerCase()); // lastname to lowercase

        return userName.toString(); //like this -> rmorales
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
        return (this.getId() + "," + this.lastName + "," + this.firstName + "," + this.credentials + "," + this.password);
    }
    
    @Override
    public void fileAction(FileVisitor visitor) {
        visitor.item(this);
    }
}
