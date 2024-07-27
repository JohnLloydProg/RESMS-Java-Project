
package DataFactory;


public class Property implements IData {
    private Buyer owner;
    private int lot;
    private int block;
    private double SRP;
    private double size;
    private String description;
    private Reservation reservation;
    private int id;

    public Property(int lot, int block, double SRP, double size, String description) {
        this.lot = lot;
        this.block = block;
        this.SRP = SRP;
        this.size = size;
        this.description = description;
    }

    public Property(int lot, int block, double SRP, double size, String description, Reservation reservation) {
        this.lot = lot;
        this.block = block;
        this.SRP = SRP;
        this.size = size;
        this.description = description;
        this.reservation = reservation;
    }

    public Property(Buyer owner, int lot, int block, double SRP, double size, String description, Reservation reservation) {
        this.owner = owner;
        this.lot = lot;
        this.block = block;
        this.SRP = SRP;
        this.size = size;
        this.description = description;
        this.reservation = reservation;
        this.id = id;
    }
    
    public String getDetails() {
        return "" + owner + lot + block + SRP + size + description + reservation + id;
    }
    
    public void reserveProperty(Reservation reservation) {
        //System.out.println("Property reserved");
    }

    public Buyer getOwner() {
        return owner;
    }

    public int getLot() {
        return lot;
    }

    public int getBlock() {
        return block;
    }

    public double getSRP() {
        return SRP;
    }

    public double getSize() {
        return size;
    }

    public String getDescription() {
        return description;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public int getId() {
        return id;
    }
    
    
    
    
}
