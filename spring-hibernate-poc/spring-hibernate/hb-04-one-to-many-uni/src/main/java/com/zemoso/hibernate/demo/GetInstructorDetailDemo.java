package com.zemoso.hibernate.demo;

import com.zemoso.hibernate.demo.entity.Instructor;
import com.zemoso.hibernate.demo.entity.InstructorDetail;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetInstructorDetailDemo {
    private static final Logger log = LogManager.getLogger(GetInstructorDetailDemo.class);

    public static void main(String[] args) {

        // create session factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .buildSessionFactory();

        // create session
        Session session = factory.getCurrentSession();

        try {

            // start a transaction
            session.beginTransaction();

            // Get the instructor detail object
            int theId = 2;
            InstructorDetail tempInstructorDetails =
                    session.get(InstructorDetail.class, theId);

            // Print the instructor detail
            log.info("tempInstructorDetails: " + tempInstructorDetails);

            // Print the associated instructor
            log.info("the associated instructor: " + tempInstructorDetails.getInstructor());

            // commit transaction
            session.getTransaction().commit();
            System.out.println("Done!");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Handle connection leak issues
            session.close();
            factory.close();
        }
    }
}
