
package DataFactory;


public class BuyerFactory implements DataFactory {
    
    @Override
    public Data createData() {
        return new Buyer();
    }
}
