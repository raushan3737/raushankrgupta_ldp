package com.zemoso.hibernate.demo;

import com.zemoso.hibernate.demo.entity.Course;
import com.zemoso.hibernate.demo.entity.Instructor;
import com.zemoso.hibernate.demo.entity.InstructorDetail;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EagerLazyDemo {
    private static final Logger log = LogManager.getLogger(EagerLazyDemo.class);

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
            // Everything is loaded from the database to memory due to eager loading

            Instructor tempInstructor = session.get(Instructor.class, theID);

            log.info("Instructor: " + tempInstructor);

            // Get courses for the instructor
            // If fetch type is lazy then, after calling getCourse() it will load the courses
            log.info("Courses: " + tempInstructor.getCourses());


            // commit transaction
            session.getTransaction().commit();


            // Close the session
            session.close();

            // Since courses are lazy loaded... this will not fail causes we already loaded courses when session is open
            // Get courses for the instructor
            log.info("Courses: " + tempInstructor.getCourses());

//            Solution: 1. Call getter method while session is  open
//                      2. Using Hibernate Query Language




            log.info("Done!");
        } finally {
            // Add clean up code
            session.close();
            factory.close();
        }
    }
}
