package com.customermanagement.OCP.OCPImproved;

public class OCPImproved {
    public static void main(String[] args) {
        Customer customer = new Customer("Aniket", "aniket@gmail.com", "9102615947", "Kolkata");
        CustomerXMLFormatter xmlViewer = new CustomerXMLFormatter();
        System.out.println(xmlViewer.format(customer));
    }
}
