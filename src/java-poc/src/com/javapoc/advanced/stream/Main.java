package com.javapoc.advanced.stream;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    private static List<Person> getPeople() {
        return List.of(
                new Person("Raushan", 23, Gender.MALE),
                new Person("Jamie", 23, Gender.FEMALE),
                new Person("Akash", 25, Gender.MALE),
                new Person("Rahul", 27, Gender.MALE),
                new Person("Helen", 21, Gender.FEMALE)
        );
    }

    public static void main(String[] args) {
        List<Person> people = getPeople();

        /*
        // Imperative approach:
        List<Person> females = new ArrayList<>();
        for (Person person : people) {
            if (person.getGender().equals(Gender.FEMALE)) {
                females.add(person);
            }
        }
        females.forEach(System.out::println);

         */

        // Declarative approach:
        // Filter
        List<Person> females = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toList());

        // females.forEach(System.out::println);

        // Sort
        List<Person> sortedPeopleByAge = people.stream()
                .sorted(Comparator.comparing(Person::getAge).reversed())
                .collect(Collectors.toList());
        //  sortedPeopleByAge.forEach(System.out::println);

        // allMatch , anyMatch, noneMatch :  Return type is boolean
        boolean match = people.stream()
                .allMatch(person -> person.getAge() > 23);
        // System.out.println(match);


        boolean noneMatch = people.stream()
                .noneMatch(person -> person.getName().equals("Raushan"));
        //  System.out.println(noneMatch);

        // max , min
//        people.stream()
//                .max(Comparator.comparing(Person::getAge))
//                .ifPresent(System.out::println);

        // group
        Map<Gender, List<Person>> groupByGenderPeople = people.stream()
                .collect(Collectors.groupingBy(Person::getGender));
//        System.out.println(groupByGenderPeople);

//        groupByGenderPeople.forEach((gender, people1) -> {
//            System.out.println(gender);
//            people1.forEach(System.out::println);
//            System.out.println();
//        });

        Optional<String> oldestFemaleAgeName = people.stream()
                .filter((person) -> person.getGender().equals(Gender.FEMALE))
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getName);

        oldestFemaleAgeName.ifPresent(System.out::println);

        // 5.What is the average age of male and female students?


    }
}
