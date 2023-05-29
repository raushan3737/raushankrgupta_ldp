package com.customermanagement.ISP.ISPBad;

import com.customermanagement.OCP.OCPImproved.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerManagement implements CustomerService {
    private List<Customer> customerList;

    public CustomerManagement() {
        this.customerList = new ArrayList<>();
    }

    @Override
    public void addCustomer(Customer customer) {
        System.out.println("Added customer data for: " + customer.getEmail());
    }

    @Override
    public void removeCustomer(Customer customer) {
        System.out.println("Remove customer data for: " + customer.getEmail());
    }

    @Override
    public void updateCustomer(Customer customer) {
        System.out.println("Update customer data for: " + customer.getEmail());
    }


    @Override
    public void getCustomerDetails(Customer customer) {
        System.out.println("getCustomerDetails for: " + customer.getEmail());
    }

    @Override
    public void generateInvoice(Customer customer) {
        System.out.println("Generate invoice for the customer for: " + customer.getEmail());
    }
}


/*
In this example, the CustomerService interface has multiple methods that cover a wide range of customer management responsibilities,
 including adding customers, removing customers, updating customer information, retrieving all customers, getting customer details,
  and generating invoices.

If a client only needs to add and remove customers, they would still have to depend on the entire CustomerService interface, even though
 they don't require the other methods. This violates ISP because clients are forced to depend on interfaces with more methods than they actually need,
 leading to unnecessary coupling and potential confusion.


 */