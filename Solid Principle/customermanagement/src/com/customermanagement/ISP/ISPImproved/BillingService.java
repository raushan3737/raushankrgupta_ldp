package com.customermanagement.ISP.ISPImproved;

import com.customermanagement.OCP.OCPImproved.Customer;

public class BillingService implements InvoiceGeneratorService {

    @Override
    public void generateInvoice(Customer customer) {
        System.out.println("Invoice generated for: " + customer.getEmail());
    }
}
