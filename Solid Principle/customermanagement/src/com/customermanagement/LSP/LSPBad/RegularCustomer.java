package com.customermanagement.LSP.LSPBad;

import com.customermanagement.OCP.OCPImproved.Customer;

public class RegularCustomer implements CustomerService {
    private Customer customer;

    public RegularCustomer(Customer customer) {
        this.customer = customer;
    }


    @Override
    public void takeDelivery() {
        System.out.println("takeDelivery() from Regular Customer class");
    }


    @Override
    public void doPayment() {
        System.out.println("doPayment() from Premium Customer class");
    }

    @Override
    public void getDiscount() {
        throw new UnsupportedOperationException("getDiscount() is not supported for the Regular Customer");

    }


    @Override
    public void claimPrice() {
        throw new UnsupportedOperationException("claimPrice() is not supported for the Regular Customer");

    }


}
