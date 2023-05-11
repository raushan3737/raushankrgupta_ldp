package com.javapoc.basics;


class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "Id: " + id + " - " + "Name: " + name;
    }
}

public class ToString {
    public static void main(String[] args) {
        Employee employee = new Employee(32, "Anuj");
        System.out.println(employee);

    }
}
