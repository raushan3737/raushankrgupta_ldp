package com.customermanagement.SRP.SRPImproved;

public class SRPImproved {
    public static void main(String[] args) {
        Customer customer = new Customer("Aniket" , "aniket@gmail.com" , "9102615947" , "Kolkata");
        CustomerConsoleViewer customerConsoleViewer = new CustomerConsoleViewer();
        customerConsoleViewer.display(customer);
    }
}
