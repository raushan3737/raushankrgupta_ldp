package com.javapoc.oops;

class Student {
    public static final int MY_CONSTANT = 18;
    public String name;
    public static String studClass;
    public static int count = 0;

    public Student() {
        count++;
    }

    public void studentName() {
        System.out.println(name);
        System.out.println(name + " is enrolled in: " + studClass);
    }

    public static void classInfo() {
        System.out.println("Java");
//      This gives you an error System.out.println(name);
    }
}

public class StaticFinal {
    public static void main(String[] args) {
        // Static and Final
        Student.studClass = "Web Dev";
        System.out.println(Student.studClass);

        Student.classInfo();

        System.out.println("Before creating objects: " + Student.count);
        Student student1 = new Student();
        Student student2 = new Student();
        System.out.println("After creating objects: " + Student.count);

        student1.name = "Anuj";
        student2.name = "Avi";
        student1.studentName();
        student2.studentName();

        System.out.println(Math.E);
        System.out.println(Student.MY_CONSTANT);
    }
}
