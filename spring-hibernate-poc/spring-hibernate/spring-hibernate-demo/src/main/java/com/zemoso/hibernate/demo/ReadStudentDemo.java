package com.zemoso.hibernate.demo;

import com.zemoso.hibernate.demo.entity.Student;
import com.zemoso.jdbctesting.TestJDBC;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadStudentDemo {
    private static final Logger log = LogManager.getLogger(TestJDBC.class);

    public static void main(String[] args) {

        // create session factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        // create session
        Session session = factory.getCurrentSession();

        try {
            // create a student object
            log.info("Creating new student object...");

            Student tempStudent = new Student("Akash", "Gupta", "akashzee@gmail.com");

            // start a transaction
            session.beginTransaction();

            // save the student object
            log.info("Saving the student...");
            log.info(tempStudent);
            session.save(tempStudent);

            // commit transaction
            session.getTransaction().commit();

            // MY NEW CODE

            // Find out the student's id: primary key
            log.info("Saved student. Generated id: " + tempStudent.getId());
//            System.out.println("Saved student. Generated id: " + tempStudent.getId());

            // Getting the student from the database using the primary key with the help of hibernate
            // Now get a session and start transaction
            session = factory.getCurrentSession();
            session.beginTransaction();

            // Retrieve student based on the id: primary key
            log.info("\nGetting student with id: " + tempStudent.getId());
//            System.out.println("\nGetting student with id: " + tempStudent.getId());

            Student myStudent = session.get(Student.class, tempStudent.getId());

            log.info("Get complete: " + myStudent);
//            System.out.println("Get complete: " + myStudent);

            // Commit on the transaction
            session.getTransaction().commit();

            log.info("Done!");

        } finally {
            factory.close();
        }
    }
}
