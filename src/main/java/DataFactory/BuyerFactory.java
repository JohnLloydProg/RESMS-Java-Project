
package DataFactory;


public class BuyerFactory {
    
//    public Buyer createDataFromCSV(String csv) {
//        
//    }
    
    public Buyer createData(String lastName, String firstName) {
        return new Buyer(lastName, firstName);
    }
}
