package com.zemoso.hibernate.demo.entity;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateCoursesAndReviewsDemo {
    private static final Logger log = LogManager.getLogger(CreateCoursesAndReviewsDemo.class);

    public static void main(String[] args) {

        // create session factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .addAnnotatedClass(Course.class)
                .addAnnotatedClass(Review.class)
                .buildSessionFactory();

        // create session
        Session session = factory.getCurrentSession();

        try {

            // start a transaction
            session.beginTransaction();

            // create a new course
            Course tempCourse = new Course("Pacman- How to score One Million Points");

            // add some reviews
            tempCourse.addReview(new Review("Great one"));
            tempCourse.addReview(new Review("Awesome"));
            tempCourse.addReview(new Review("Great course ... loved it!"));


            // save the course... and leverage the cascade all
            log.info("Saving the course: " + tempCourse);
            log.info("Course review: " + tempCourse + " " + tempCourse.getReviews());

            session.save(tempCourse);


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
