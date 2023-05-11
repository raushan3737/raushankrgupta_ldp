// Data Hiding: is a technique to hide the internal object details i.e. data members.
// Data should be only available to the authenticated user only.
package com.javapoc.oops;

public class DataHiding {
    static class BankAccount {
        private double balance = 100000;
        private String userName = "raushan";
        private String password = "password";

        public double getBalance(String userName, String password) {

            if (this.userName.equals(userName) && this.password.equals(password)) {
                System.out.println("Authentication successful !");
                return balance;
            } else {
                System.out.println("Please enter correct authentication details");
                return 0.00;
            }
        }
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        System.out.println(acc.getBalance("raaushan", "password"));

    }
}
