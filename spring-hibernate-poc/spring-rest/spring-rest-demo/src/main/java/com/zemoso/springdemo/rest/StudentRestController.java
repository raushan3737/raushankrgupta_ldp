package com.zemoso.springdemo.rest;

import com.zemoso.springdemo.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api")
public class StudentRestController {
    private List<Student> theStudents;

    // Define @PostConstruct to load the students data.... only once
    @PostConstruct
    public void loadData() {
        theStudents = new ArrayList<>();
        theStudents.add(new Student("Raushan", "Gupta"));
        theStudents.add(new Student("Satwik", "Raj"));
        theStudents.add(new Student("Rajan", "Jha"));
    }

    // Define endpoint for "/students/{studentId}" - Return student at that index. Get the student by id or index
    @GetMapping("/students/{studentId}")
    public Student getStudentByStudentId(@PathVariable int studentId) {
        // Just index into the list of students...
        // Check the studentId against the list size of the list
        if (studentId >= theStudents.size() || studentId < 0) {
            throw new StudentNotFoundException("Student id not found with the passed id: " + studentId);
        }
        return theStudents.get(studentId);
    }

    // Define endpoint for "/students" - Return list of students
    @GetMapping("/students")
    public List<Student> getStudents() {

        // Spring will use of jackson in the background take the pojo & convert it to the JSON automatically.
        return theStudents;
    }
}
