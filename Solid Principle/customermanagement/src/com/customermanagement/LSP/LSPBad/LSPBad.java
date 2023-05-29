package com.customermanagement.LSP.LSPBad;

import com.customermanagement.OCP.OCPImproved.Customer;

/*
In this example, the Customer class has a method called claimPrice().
 However, this method is not applicable to all types of customers, and for Regular customers, it is not supported.
 To indicate that the method is unsupported for Regular customers, we throw an exception.
 This violates LSP because it introduces an unsupported behavior for a subtype (RegularCustomer) that is not present in the supertype (Customer).
 */
public class LSPBad {
    public static void main(String[] args) {

        Customer customer = new Customer("Akash", "akashs@gmail.com", "9631452789", "Rohtas");
        CustomerService regularCustomer = new RegularCustomer(customer);
//        regularCustomer.claimPrice(); // Will not support this method

        CustomerService premiumCustomer = new PremiumCustomer(customer);
        premiumCustomer.claimPrice();

    }
}
