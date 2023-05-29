package com.customermanagement.SRP.SRPBad;


// SOLID Principles
// Example: Customer Management System
// S - Single Responsibility Principle
// Bad Implementation

public class SRPBad {
    public static void main(String[] args) {
        Customer customerSRPBad = new Customer("Aniket", "aniket@gmail.com", "9102615947", "Kolkata");
        customerSRPBad.save(customerSRPBad);
        customerSRPBad.display();
        customerSRPBad.delete(customerSRPBad);
        customerSRPBad.display();
    }
}
