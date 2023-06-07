package com.zemoso.logger;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class StudentApp {
    public static void main(String[] args) {
        System.out.println("StudentApp class: ");
        Student student = new Student();
        student.setName("Raushan");
        System.out.println(student.getName());
        Logger log = LogManager.getLogger(StudentApp.class);
        log.warn(student.getName());

    }
}
