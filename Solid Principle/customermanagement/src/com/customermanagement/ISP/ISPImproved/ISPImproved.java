package com.customermanagement.ISP.ISPImproved;

import com.customermanagement.OCP.OCPImproved.Customer;

public class ISPImproved {
    public static void main(String[] args) {
        Customer customer = new Customer("Raushan","raushan@gmail.com" , "9102615947","Kolkata") ;
        CustomerManagement customerManagement = new CustomerManagement();
        customerManagement.addCustomer(customer);
        customerManagement.generateInvoice(customer);
    }
}
