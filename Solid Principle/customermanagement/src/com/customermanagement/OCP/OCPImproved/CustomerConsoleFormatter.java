package com.customermanagement.OCP.OCPImproved;

public class CustomerConsoleFormatter implements CustomerFormatter {

    @Override
    public String format(Customer customer) {
        return "Name: " + customer.getName() + "\nEmail: " + customer.getEmail() + "\nMobile number" + customer.getMobileNo() + "\nAddress" + customer.getAddress();

    }
}
