package com.luv2code.springboot.cruddemo.repository;

import com.luv2code.springboot.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


/*
By extending JpaRepository it will provide all the CRUD functionality for the passed entity
Here, Employee is the entity and Integer represents the primary key of the entity
i.e. Database
 */


// Instead of using employees as an endpoint , it will use members as an endpoint  in the URL
// @RepositoryRestResource(path = "members")

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    // That's it ... No need to write any code
}
