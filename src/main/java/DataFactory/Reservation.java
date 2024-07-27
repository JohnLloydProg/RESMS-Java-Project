
package DataFactory;


public class Reservation implements IData {
    
    private double price;
    private String dueDate;
    private Buyer buyer;
    private int id;

    public Reservation(double price, String dueDate, Buyer buyer) {
        this.price = price;
        this.dueDate = dueDate;
        this.buyer = buyer;
    }
    
    public String getDetails() {
        return "" + price + dueDate + buyer;
    }

    public double getPrice() {
        return price;
    }

    public String getDueDate() {
        return dueDate;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public int getId() {
        return id;
    }
    
    
}
