package com.customermanagement.ISP.ISPImproved;

import com.customermanagement.OCP.OCPImproved.Customer;

public interface InvoiceGeneratorService {
    public void generateInvoice(Customer customer);
}
