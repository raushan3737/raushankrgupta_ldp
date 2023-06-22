package com.luv2code.springboot.thymeleafdemo.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.luv2code.springboot.thymeleafdemo.entity.Employee;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // that's it ... no need to write any code...

    // add a method to sort by last name
    // JPA will construct  a query using method name. We don't need to give the implementation for the below method
    public List<Employee> findAllByOrderByLastNameAsc();

}

/*
Sorting With the OrderBy Method Keyword
One option is to use Spring Data's method derivation, whereby the query is generated from the method name and signature.

All we need to do here to sort our data is include the keyword OrderBy in our method name, along with the property name(s) and direction (Asc or Desc) by which we want to sort.

We can use this convention to create a query that returns our passengers in ascending order by seat number:

interface PassengerRepository extends JpaRepository<Passenger, Long> {

    List<Passenger> findByOrderBySeatNumberAsc();
}
Copy
We can also combine this keyword with all the standard Spring Data method names.

Let's see an example of a method that finds passengers by last name and orders by seat number:

List<Passenger> findByLastNameOrderBySeatNumberAsc(String lastName);

2. Sorting With a Sort Parameter
Our second option is to include a Sort parameter specifying the property name(s) and direction by which we want to sort:

List<Passenger> passengers = repository.findAll(Sort.by(Sort.Direction.ASC, "seatNumber"));
 */