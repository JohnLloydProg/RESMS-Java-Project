
package DataFactory;

public class EmployeeFactory {
    
//    public Employee createDataFromCSV(String csv) {
//        
//    }
    
    public Employee createData(String lastName, String firstName, String credentials) {
        return new Employee(lastName, firstName, credentials);
    }
    
}
