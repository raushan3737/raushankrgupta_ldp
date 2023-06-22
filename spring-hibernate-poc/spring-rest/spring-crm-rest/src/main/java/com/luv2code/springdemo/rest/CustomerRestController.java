package com.luv2code.springdemo.rest;


import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Spring RestController annotation is used to create RESTful web services using Spring MVC
@RestController
@RequestMapping("/api")
public class CustomerRestController {

    // Autowired the CustomerService
    @Autowired
    private CustomerService customerService;

    // add mapping for  GET /customers
    @GetMapping("/customers")
    public List<Customer> getCustomers() {
        return customerService.getCustomers();
    }

    // Add mapping for GET /customers/{customerId}
    @GetMapping("/customers/{customerId}")
    public Customer getCustomer(@PathVariable int customerId) {
        Customer theCustomer = customerService.getCustomer(customerId);

        // If the customer is null
        if (theCustomer == null) {
            throw new CustomerNotFoundException("Customer id not found- " + customerId);
        }
        return theCustomer;
    }

    // Add mapping for POST /customers - Add new customer
    // By @RequestBody:to access the request body as a POJO.  Will give the JSON data as a POJO
    @PostMapping("/customers")
    public Customer addCustomer(@RequestBody Customer theCustomer) {
        // Also just in case the pass an id in JSON ... set id to 0
        // This is force a save of new item ... instead of updating
        theCustomer.setId(0);

        customerService.saveCustomer(theCustomer);

        return theCustomer;
    }

    @PutMapping("/customers")
    public Customer updateCustomer(@RequestBody Customer theCustomer) {

        customerService.saveCustomer(theCustomer);

        return theCustomer;
    }

    // Add mapping for DELETE /customers/{customerId} - Delete customer
    @DeleteMapping("/customers/{customerId}")
    public String deleteCustomer(@PathVariable int customerId) {
        Customer tempCustomer = customerService.getCustomer(customerId);
        if (tempCustomer == null) {
            throw new CustomerNotFoundException(("Customer id not found: " + customerId));
        }
        customerService.deleteCustomer(customerId);
        return "Record deleted";
    }

}
