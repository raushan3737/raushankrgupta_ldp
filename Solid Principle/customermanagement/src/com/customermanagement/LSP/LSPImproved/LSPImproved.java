package com.customermanagement.LSP.LSPBad.LSPImproved;

public class LSPImproved {
    public static void main(String[] args) {
        PremiumCustomer premiumCustomer = new PremiumCustomer();
        premiumCustomer.takeDelivery();
        premiumCustomer.doPayment();
        premiumCustomer.getDiscount(); // Additional method only available in PremiumCustomer


        RegularCustomer regularCustomer = new RegularCustomer();
        regularCustomer.takeDelivery();
        regularCustomer.doPayment();
      //   regularCustomer.getDiscount(); // Not supported for the regularCs
    }
}
