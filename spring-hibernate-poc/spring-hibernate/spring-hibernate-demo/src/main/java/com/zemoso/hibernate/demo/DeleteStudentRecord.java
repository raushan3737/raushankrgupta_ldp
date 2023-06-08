package com.zemoso.hibernate.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteStudentRecord {
    public static void main(String[] args) {
        // Database credentials
        String url = "jdbc:mysql://localhost:3306/your_database_name";
        String username = "your_username";
        String password = "your_password";

        // SQL query to delete student record
        String firstName = "akash";
        String sql = "DELETE FROM student WHERE firstName = '" + firstName + "'";

        try {
            // Create a connection to the database
            Connection connection = DriverManager.getConnection(url, username, password);

            // Create a statement
            Statement statement = connection.createStatement();

            // Execute the SQL query
            int rowsAffected = statement.executeUpdate(sql);

            // Check the number of affected rows
            if (rowsAffected > 0) {
                System.out.println("Student record with first name 'akash' deleted successfully.");
            } else {
                System.out.println("No student record found with first name 'akash'.");
            }

            // Close the resources
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
