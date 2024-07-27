
package DataFactory;

public class TransactionFactory {
//    public Transaction createDataFromCSV(String csv) {
//        
//    }
    
    public Transaction createData(Property property, Buyer buyer, Offer offer) {
        return new Transaction(property, buyer, offer);
    }
    
    public Transaction createData(Employee employee, Property property, Buyer buyer, Offer offer) {
        return new Transaction(employee, property, buyer, offer);
    }
}
