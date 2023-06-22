package com.luv2code.springboot.cruddemo.repository;

import com.luv2code.springboot.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


/*
By extending JpaRepository it will provide all the CRUD functionality for the passed entity
Here, Employee is the entity and Integer represents the primary key of the entity
i.e. Database

 */
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    // That's it ... No need to write any code
}
