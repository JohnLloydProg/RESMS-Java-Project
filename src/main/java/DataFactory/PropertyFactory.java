
package DataFactory;
import java.lang.reflect.*;

public abstract class PropertyFactory implements DataFactory {
    
    public <T extends Property> T createProperty(Class<T> propertyClass, Object... args) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Constructor<T> constructor = null;
        
        
        for (Constructor<?> c : propertyClass.getConstructors()) {
            if (c.getParameterCount() == args.length) {
                constructor = (Constructor<T>) c;
                break;
            }
        }
        
        if (constructor == null) {
            throw new RuntimeException("No matching constructor found");
        }
        
        T property = constructor.newInstance(args);
        
        return property;
    }
}
