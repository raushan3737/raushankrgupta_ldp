package com.customermanagement.ISP.ISPBad;

import com.customermanagement.OCP.OCPImproved.Customer;

public interface CustomerService {
    void addCustomer(Customer customer);

    void removeCustomer(Customer customer);

    void updateCustomer(Customer customer);

    void getCustomerDetails(Customer customer);

    void generateInvoice(Customer customer);
}