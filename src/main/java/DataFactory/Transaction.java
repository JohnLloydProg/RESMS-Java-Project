
package DataFactory;

public class Transaction implements Data {
    //private Agent agent;
    private Property property;
    private Buyer buyer;
    private Offer offer;

    public Transaction(Property property, Buyer buyer, Offer offer) {
        this.property = property;
        this.buyer = buyer;
        this.offer = offer;
    }
    
//    public Transaction(Agent agent, Property property, Buyer buyer, Offer offer) {
//        this.agent = agent;
//        this.property = property;
//        this.buyer = buyer;
//        this.offer = offer;
//    }
    
    public String getDetails() {
        return "" + //agent + 
                property + buyer + offer;
                
    }

    public Property getProperty() {
        return property;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public Offer getOffer() {
        return offer;
    }
    
//    public Agent getAgent() {
//        return agent;
//    }
}


