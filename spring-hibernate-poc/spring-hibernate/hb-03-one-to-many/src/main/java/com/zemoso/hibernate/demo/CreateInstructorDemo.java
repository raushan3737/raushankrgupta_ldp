package com.zemoso.hibernate.demo;

import com.zemoso.hibernate.demo.entity.Course;
import com.zemoso.hibernate.demo.entity.Instructor;
import com.zemoso.hibernate.demo.entity.InstructorDetail;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateInstructorDemo {
    private static final Logger log = LogManager.getLogger(DeleteInstructorDetailDemo.class);

    public static void main(String[] args) {

        // create session factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .addAnnotatedClass(Course.class)
                .buildSessionFactory();

        // create session
        Session session = factory.getCurrentSession();

        try {

            // create the objects
            Instructor tempInstructor =
                    new Instructor("Ravi", "Upadhyay", "ravi@gmail.com");

            InstructorDetail tempInstructorDetail =
                    new InstructorDetail(
                            "http://www.youtube.com",
                            "Teaching");

            // associate the objects
            tempInstructor.setInstructorDetail(tempInstructorDetail);

            // start a transaction
            session.beginTransaction();

            // save the instructor

            // Note: this will ALSO save the details object because of CascadeType.ALL
            log.info("Saving instructor: " + tempInstructor);


            session.save(tempInstructor);

            // commit transaction
            session.getTransaction().commit();


            log.info("Done!");
        } finally {
            // Add clean up code
            session.close();
            factory.close();
        }
    }
}
