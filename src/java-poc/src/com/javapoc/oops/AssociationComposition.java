package com.javapoc.oops;


import java.util.ArrayList;

class College {
    String name;
    private ArrayList<Teacher> teachers;

    public College(String name, ArrayList<Teacher> teachers) {
        this.name = name;
        this.teachers = teachers;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }
}

class Teacher {
    String name;
    String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "[Teacher: " + name + ", Subject : " + subject + "]";
    }
}

class AggregationDemo {
    public static void main(String[] args) {
        ArrayList<Teacher> teachers = new ArrayList<Teacher>();
        teachers.add(new Teacher("John", "Java"));
        teachers.add(new Teacher("Ritchie", "C++"));

        College college = new College("My college", teachers);
    }
}

//2.Composition: House HAS-A Kitchen
class House {
    private Kitchen kitchen;

    public House() {
        kitchen = new Kitchen();
        kitchen.setFood("Pizza");
    }

    public String getFood() {
        return kitchen.getFood();
    }
}

class Kitchen {
    private String food;

    public void setFood(String food) {
        this.food = food;
    }

    public String getFood() {
        return food;
    }
}

class CompositionDemo {
    public static void main(String[] args) {
        House house = new House();
        System.out.println(house.getFood());
    }
}


/*
Association (HAS-A Relationship): Establishing relationship between two different classes through their objects.
Object of two different classes in a class and make them interact each other.
class A ==> ObjectA  <==> ObjectB ==> class B

There are two forms of association: 1. Aggregation 2.Composition
1. Aggregation: If both the entities that are associated can exist independently.
Ex: College HAS-A Teacher, Office HAS-A Employee.

2.Composition: Stronger form of association
Two entities are highly dependent on each other.
Ex: Engine & Car

*/