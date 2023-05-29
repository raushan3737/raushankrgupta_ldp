package com.customermanagement.DIP.DIPBad;

import com.customermanagement.OCP.OCPImproved.Customer;

public class DIPBad {
    public static void main(String[] args) {
        CustomerService customerService = new CustomerService();
        Customer customer = new Customer("Raushan","raushan@gmail.com" , "9102615947","Kolkata") ;
        // Perform customer management operations using customerService
        customerService.addCustomer(customer);
    }
}
