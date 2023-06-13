package com.zemoso.jdbctesting;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJDBC {
    private static final Logger log = LogManager.getLogger(TestJDBC.class);

    public static void main(String[] args) {
        // Provide the JDBC URL and username and password while making connection to the SQL server
        String jdbcURL = "jdbc:mysql://localhost:3306/hb-01-one-to-one-uni?useSSL=false&serverTimezone=UTC";
        String user = "hbstudent";
        String password = "hbstudent";

        try {
            log.info("Connecting to the database: " + jdbcURL);
            Connection sqlConnection = DriverManager.getConnection(jdbcURL, user, password);
            log.info("Connection successful to the database: " + jdbcURL);

            // Perform database operations

            // Close the connection when done
            sqlConnection.close();
        } catch (SQLException ex) {
           // log.error("Error connecting to the database", ex);
            log.error("Connection request was unsuccessful..");
        }
    }

}
