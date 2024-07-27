
package DataFactory;

import java.util.List;


public class Employee implements IData {
    private String lastName;
    private String firstName;
    private int id;
    private String credentials;
    private String report;
    private List<Transaction> transactions;

    public Employee(String lastName, String firstName, String credentials) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.credentials = credentials;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCredentials() {
        return credentials;
    }

    public void setCredentials(String credentials) {
        this.credentials = credentials;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
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
            "Credentials: " + credentials + "\n" +
            "Transactions:\n";
        for (Transaction transaction : transactions) {
            report += transaction.getDetails() + "\n";
        }
    }
    
    //    public void fileAction(FileVisitor) {
    //        
    //    }
}
