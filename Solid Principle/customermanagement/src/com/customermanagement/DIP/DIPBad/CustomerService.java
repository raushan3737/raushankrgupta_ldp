package com.customermanagement.DIP.DIPBad;

import com.customermanagement.OCP.OCPImproved.Customer;

public class CustomerService {
    private DatabaseService databaseService;

    public CustomerService() {
        this.databaseService = new DatabaseService();
    }

    public void addCustomer(Customer customer) {
        // Use the database connection to add the customer
        databaseService.connect();
        // Add customer logic
        System.out.println(customer.getEmail() + " Added to the database");
        databaseService.disconnect();
    }
}


/*
In this example, the CustomerService class depends directly on the DatabaseService class,
creating an instance of it within the constructor. This violates DIP because the high-level module (CustomerService)
depends on a low-level module (DatabaseService), creating tight coupling between the two.

The violation becomes evident when there is a need to change the database connection mechanism.
For example, if we want to switch from using a database connection to a web service for customer management,
the CustomerService class would need to be modified, breaking the principle of abstraction and flexibility.
 */