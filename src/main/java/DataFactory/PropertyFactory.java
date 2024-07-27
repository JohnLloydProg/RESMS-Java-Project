
package DataFactory;

public class PropertyFactory {
    
//    public Property createDataFromCSV(String csv) {
//        
//    }
    
      public Property createData(int lot, int block, double SRP, double size, String description) {
          return new Property(lot, block, SRP, size, description);
      }
      
      public Property createData(int lot, int block, double SRP, double size, String description, Reservation reservation) {
          return new Property(lot, block, SRP, size, description, reservation);
      }
      
      public Property createData(Buyer owner, int lot, int block, double SRP, double size, String description, Reservation reservation) {
          return new Property(owner, lot, block, SRP, size, description, reservation);
      }
}
