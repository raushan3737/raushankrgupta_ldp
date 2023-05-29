package com.customermanagement.SRP.SRPBad;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String email;
    private String mobileNo;
    private String address;

    List<Customer> customerList;


    // Constructor

    public Customer(String name, String email, String mobileNo, String address) {
        this.name = name;
        this.email = email;
        this.mobileNo = mobileNo;
        this.address = address;
        this.customerList = new ArrayList<>();
    }

    // Getter & setter for all instance variables
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void save(Customer customerSRPBad) {
        customerList.add(customerSRPBad);
        System.out.println("Save customer data to database");
    }

    public void delete(Customer customerSRPBad) {
        customerList.remove(customerSRPBad);
        System.out.println("Delete customer data from database");
    }

    public void display() {
        System.out.println("Display customer data on console");
        for (Customer customer : customerList) {
            System.out.println(customer.getName() + customer.mobileNo);
        }
    }


}
