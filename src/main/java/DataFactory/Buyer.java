
package DataFactory;


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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
}
