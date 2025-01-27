
package com.RESMS.libs.factory;

import com.RESMS.libs.object.Employee;

public class EmployeeFactory {
    
//    public Employee createDataFromCSV(String csv) {
//        
//    }
    
    public Employee createData(String lastName, String firstName, String credentials) {
        return new Employee(lastName, firstName, credentials);
    }
    
    public Employee createDataFromCSV(String csv) {
        String[] data = csv.split(",");
        Employee employee = new Employee(data[1], data[2], data[3]);
        employee.setPassword(data[4]);
        employee.setId(data[0]);
        return employee;
    }
    
}
