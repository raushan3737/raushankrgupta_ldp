package com.customermanagement.ISP.ISPImproved;

import com.customermanagement.OCP.OCPImproved.Customer;
import java.util.ArrayList;
import java.util.List;

public class CustomerManagement implements CustomerService, InvoiceGeneratorService {
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
        System.out.println("Invoice generated for: " + customer.getEmail());
    }
}
