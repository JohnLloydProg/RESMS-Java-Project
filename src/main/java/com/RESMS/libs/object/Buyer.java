
package com.RESMS.libs.object;

import com.RESMS.libs.fileSystem.FileVisitor;


public class Buyer implements IData {
    
    private String lastName;
    private String firstName;
    private int id;
    
    public Buyer(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }
    
    public String getDetails() {
        return " " + lastName + firstName + id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getId() {
        return "B-" + this.id;
    }
    
    public void setId(String id) {
        this.id = Integer.parseInt(id.split("-")[1]);
    }
    
    @Override
    public String toCSV() {
        return ("B-" + this.id + "," + this.lastName + "," + this.firstName);
    }
    
    @Override
    public void fileAction(FileVisitor visitor) {
        visitor.item(this);
    }
    
    
}
