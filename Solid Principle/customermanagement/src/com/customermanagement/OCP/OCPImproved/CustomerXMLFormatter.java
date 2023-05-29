package com.customermanagement.OCP.OCPImproved;

public class CustomerXMLFormatter implements CustomerFormatter {

    @Override
    public String format(Customer customer) {
        return "<customer><name>" + customer.getName() + "</name><email>" + customer.getEmail() + "</email><mobileno>" + customer.getMobileNo() + "</mobileno><address>" + customer.getAddress() + "</address> ";
    }
}
