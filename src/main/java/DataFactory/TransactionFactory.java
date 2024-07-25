
package DataFactory;
import java.lang.reflect.*;

public abstract class TransactionFactory implements DataFactory {
    public <T extends Transaction> T createTransaction(Class<T> transactionClass, Object... args) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Constructor<T> constructor = null;
        
        
        for (Constructor<?> c : transactionClass.getConstructors()) {
            if (c.getParameterCount() == args.length) {
                constructor = (Constructor<T>) c;
                break;
            }
        }
        
        if (constructor == null) {
            throw new RuntimeException("No matching constructor found");
        }
        
        
        T transaction = constructor.newInstance(args);
        
        return transaction;
    }
}
