package com.customermanagement.SRP.SRPImproved;

public class CustomerConsoleViewer {
    public void display(Customer customer) {
        System.out.println("Name: " + customer.getName() + " Email: " + customer.getEmail());
    }
}
