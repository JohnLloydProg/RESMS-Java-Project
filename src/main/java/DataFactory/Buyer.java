
package DataFactory;


public class Buyer implements Data {
    
    private String lastName;
    private String firstName;
    private int id;
    
    public String getDetails() {
        return " " + lastName + firstName + id;
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
    
    
}
