package com.luv2code.jackson.json.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.luv2code.jackson.json.demo.entity.Student;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.File;

public class Driver {
    private static Logger log = LogManager.getLogger(Driver.class);

    public static void main(String[] args) {
        try {
            // Create object mapper
            ObjectMapper mapper = new ObjectMapper();

            // Read the JSON file and map/convert to Java POJO
            // Student theStudent = mapper.readValue(new File("data/sample-lite.json") , Student.class);

            Student theStudent = mapper.readValue(new File("data/sample-full.json"), Student.class);

            // Print first name and last name
            log.info("Reading data from json file & set it to the Student entity: ");

            log.info("Student Details: " + theStudent);

            // Accessing the instance members
            log.info("First Name: " + theStudent.getFirstName());

            // Print out the languages
            for (String tempLanguage : theStudent.getLanguages()) {
                log.info("Language: " + tempLanguage);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
