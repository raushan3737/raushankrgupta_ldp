package com.customermanagement.DIP.DIPImproved;

import com.customermanagement.OCP.OCPImproved.Customer;

public class DIPImproved {
    public static void main(String[] args) {
        DatabaseService databaseService = new DatabaseServiceImplementation();
        CustomerService customerService = new CustomerService(databaseService);
        Customer customer = new Customer("Raushan", "raushan@gmail.com", "9102615947", "Kolkata");
        // Perform customer management operations using customerService
        customerService.addCustomer(customer);
    }
}
