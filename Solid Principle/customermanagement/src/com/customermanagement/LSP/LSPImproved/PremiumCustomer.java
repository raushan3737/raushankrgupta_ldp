package com.customermanagement.LSP.LSPBad.LSPImproved;

public class PremiumCustomer implements CustomerService {
    @Override
    public void takeDelivery() {
        System.out.println("takeDelivery() from Premium Customer");
    }

    @Override
    public void doPayment() {
        System.out.println("doPayment() from Premium Customer");
    }

    // Additional method for the Premium customer
    public void getDiscount() {
        System.out.println("getDiscount() from Premium customer");
    }
    public void claimPrice() {
        System.out.println("claimPrice() from Premium customer");
    }
}
