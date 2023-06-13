package com.zemoso.springdemo.testdb;

import java.io.IOException;
import java.io.PrintWriter;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/*
To check the connection goto the given url: http://localhost:8080/web-customer-tracker/TestDbServlet after running tomcat server

 */

/**
 * Servlet implementation class TestDbServlet
 */

@WebServlet("/TestDbServlet")
public class TestDbServlet extends HttpServlet {
    private static final Logger log = LogManager.getLogger(TestDbServlet.class);

    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // setup connection variables
        String user = "springstudent";
        String pass = "springstudent";

        String jdbcUrl = "jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false&serverTimezone=UTC";
        String driver = "com.mysql.cj.jdbc.Driver";

        // get connection to database
        try {
            PrintWriter out = response.getWriter();

            out.println("Connecting to database: " + jdbcUrl);
            log.info("Connecting to database: " + jdbcUrl);


            Class.forName(driver);

            Connection myConn = DriverManager.getConnection(jdbcUrl, user, pass);

            out.println("SUCCESS: Connected to the database!!!");
            log.info("SUCCESS: Connected to the database!!!");

            myConn.close();

        } catch (Exception exc) {
            exc.printStackTrace();
            throw new ServletException(exc);
        }
    }

}