package com.customermanagement.DIP.DIPImproved;


public class DatabaseServiceImplementation implements DatabaseService {
    @Override
    public void connect() {
        // Connect to the database
        System.out.println("Connected to the database");
    }

    @Override
    public void disconnect() {
        // Disconnect from the database
        System.out.println("Disconnected to the database");
    }
}