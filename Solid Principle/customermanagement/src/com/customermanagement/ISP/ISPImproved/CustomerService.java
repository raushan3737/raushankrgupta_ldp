package com.customermanagement.ISP.ISPImproved;

import com.customermanagement.OCP.OCPImproved.Customer;

public interface CustomerService {

    void addCustomer(Customer customer);

    void removeCustomer(Customer customer);

    void updateCustomer(Customer customer);

    void getCustomerDetails(Customer customer);

}


