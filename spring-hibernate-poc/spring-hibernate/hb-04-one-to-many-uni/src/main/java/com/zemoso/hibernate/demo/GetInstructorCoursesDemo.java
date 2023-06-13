package com.zemoso.hibernate.demo;

import com.zemoso.hibernate.demo.entity.Course;
import com.zemoso.hibernate.demo.entity.Instructor;
import com.zemoso.hibernate.demo.entity.InstructorDetail;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetInstructorCoursesDemo {
    private static final Logger log = LogManager.getLogger(GetInstructorCoursesDemo.class);

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

            // start a transaction
            session.beginTransaction();

            // Get the instructor from db
            int theID = 1;
            Instructor tempInstructor = session.get(Instructor.class, theID);

            log.info("Instructor: " + tempInstructor);

            // Get courses for the instructor
            log.info("Courses: " + tempInstructor.getCourses());

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
