package com.customermanagement.LSP.LSPBad;

import com.customermanagement.OCP.OCPImproved.Customer;

public class PremiumCustomer implements CustomerService {
    private Customer customer;

    public PremiumCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public void takeDelivery() {
        System.out.println("takeDelivery() from Premium Customer class");
    }

    @Override
    public void getDiscount() {
        System.out.println("getDiscount() from Premium Customer class");
    }

    @Override
    public void claimPrice() {
        System.out.println("claimPrice() from Premium Customer class");
    }

    @Override
    public void doPayment() {
        System.out.println("doPayment() from Premium Customer class");
    }
}
