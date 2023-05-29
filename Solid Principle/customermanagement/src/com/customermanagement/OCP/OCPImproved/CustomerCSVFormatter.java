package com.customermanagement.OCP.OCPImproved;

public class CustomerCSVFormatter implements CustomerFormatter {
    @Override
    public String format(Customer customer) {
        return customer.getName() + "," + customer.getEmail() + "," + customer.getMobileNo() + "," + customer.getAddress();
    }
}
