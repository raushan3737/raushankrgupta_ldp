package com.zemoso.springplayground;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {
        // Load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach" , Coach.class);

        // Call methods on the bean
        System.out.println(theCoach.getDailyWorkout());

        // Let's call our new method for fortunes
        System.out.println(theCoach.getDailyFortune());

        // Close the context
        context.close();
    }
}


/*
        // Code to print all the created bean in the Spring container
        // Get all bean definition names

        // Read spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Logic to get the all bean name
        String[] beanNames = context.getBeanDefinitionNames();
        // Print all beans
        for (String beanName : beanNames) {
            System.out.println("Bean name: " + beanName);
        }
 */
