package com.customermanagement.LSP.LSPBad.LSPImproved;


public class RegularCustomer implements CustomerService {

    @Override
    public void takeDelivery() {
        System.out.println("takeDelivery() from Regular customer");
    }

    @Override
    public void doPayment() {
        System.out.println("doPayment() from Regular customer");
    }
}
