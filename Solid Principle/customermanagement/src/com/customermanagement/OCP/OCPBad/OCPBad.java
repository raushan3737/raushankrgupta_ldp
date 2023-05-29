package com.customermanagement.OCP.OCPBad;



// SOLID Principles
// Example: Customer Management System
// O - Open Closed Principle
// Bad Implementation

public class OCPBad {
    public static void main(String[] args) {
        CustomerOCPBad customerOCPBad = new CustomerOCPBad("Akash", "akashs@gmail.com", "9631452789", "Rohtas");
        customerOCPBad.display("console");
    }
}
