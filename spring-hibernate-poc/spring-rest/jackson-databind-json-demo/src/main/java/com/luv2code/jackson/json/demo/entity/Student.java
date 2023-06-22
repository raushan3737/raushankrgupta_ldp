package com.luv2code.jackson.json.demo.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

// Ignoring some properties from the json file: Let's ignore unknown properties
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private boolean active;
    // Added new field according to sample-full.json
    private Address address;
    private String[] languages;


}
