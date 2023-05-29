package com.customermanagement.DIP.DIPImproved;

import com.customermanagement.OCP.OCPImproved.Customer;

public class CustomerService {
    private DatabaseService databaseService;

    public CustomerService(DatabaseService databaseService) {
        this.databaseService = databaseService;
    }

    public void addCustomer(Customer customer) {
        // Use the database connection to add the customer
        databaseService.connect();
        // Add customer logic
        System.out.println(customer.getEmail() + " Added to the database");
        databaseService.disconnect();
    }

    // Other methods for customer management
}

/*
In the non-violation example, the main method creates an instance of the DatabaseServiceImplementation class, which implements
the DatabaseService interface. This instance is then passed to the CustomerService constructor, injecting the dependency.
The CustomerService class now depends on the DatabaseService interface rather than the concrete implementation.

The main method demonstrates how customer management operations can be performed using the CustomerService object,
 which relies on the abstracted database connection. This approach allows different implementations of the DatabaseService
  interface to be used interchangeably without modifying the CustomerService class.
 */