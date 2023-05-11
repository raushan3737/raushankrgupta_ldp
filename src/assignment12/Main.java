package assignment12;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    private static List<Student> getStudent() {
        return List.of(
                new Student(111, "Jiya Brein", 17, Gender.FEMALE, Department.COMPUTER_SCIENCE, 2018, 70.8),
                new Student(122, "Paul Niksui", 18, Gender.MALE, Department.MECHANICAL, 2016, 50.2),
                new Student(133, "Martin Theron", 17, Gender.MALE, Department.ELECTRONIC, 2017, 90.3),
                new Student(144, "Murali Gowda", 18, Gender.MALE, Department.ELECTRICAL, 2018, 80),
                new Student(155, "Nima Roy", 19, Gender.FEMALE, Department.TEXTTILE, 2016, 70),
                new Student(166, "Iqbal Hussain", 18, Gender.MALE, Department.SECURITY, 2016, 70),
                new Student(177, "Manu Sharma", 16, Gender.MALE, Department.CHEMICAL, 2018, 70),
                new Student(188, "Wang Liu", 20, Gender.MALE, Department.COMPUTER_SCIENCE, 2015, 80),
                new Student(199, "Amelia Zoe", 18, Gender.FEMALE, Department.COMPUTER_SCIENCE, 2016, 85),
                new Student(200, "Jaden Dough", 18, Gender.MALE, Department.SECURITY, 2015, 82),
                new Student(211, "Jasna Kaur", 20, Gender.FEMALE, Department.ELECTRONIC, 2019, 83),
                new Student(222, "Nitin Joshi", 19, Gender.FEMALE, Department.TEXTTILE, 2016, 60.4),
                new Student(233, "Jyothi Reddy", 16, Gender.FEMALE, Department.COMPUTER_SCIENCE, 2015, 45.6),
                new Student(244, "Nicolus Den", 16, Gender.MALE, Department.ELECTRONIC, 2017, 95.8),
                new Student(255, "Ali Baig", 17, Gender.MALE, Department.ELECTRONIC, 2018, 88.4),
                new Student(266, "Sanvi Pandey", 17, Gender.FEMALE, Department.ELECTRIC, 2019, 72.4),
                new Student(277, "Anuj Chettiar", 18, Gender.MALE, Department.COMPUTER_SCIENCE, 2017, 57.5)
        );


    }

    public static void getDepartmentName(List<Student> students) {
        List<Department> departments = students.stream()
                .map(Student::getEngDepartment)
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Name of all departments in the college");
        departments.forEach(System.out::println);
    }

    public static void getStudentEnrolledAfter(List<Student> students) {
        List<String> studentNames = students.stream()
                .filter(s -> s.getYearOfEnrollment() > 2018)
                .map(Student::getName)
                .collect(Collectors.toList());

        System.out.println("Names of all students who have enrolled after 2018?: ");
        studentNames.forEach(System.out::println);
    }

    public static void getMaleOfComputerScience(List<Student> students) {
        List<Student> maleComputerScienceStudent = students.stream()
                .filter(student -> {
                    return student.getEngDepartment().equals(Department.COMPUTER_SCIENCE) && student.getGender().equals(Gender.MALE);
                })
                .collect(Collectors.toList());

        maleComputerScienceStudent.forEach(student -> System.out.println("Details of all male student in the computer science department: " + student.toString()));
    }

    public static void getNoOfStudentByGender(List<Student> students) {
        Map<Gender, List<Student>> groupByGenderStudent = students.stream()
                .collect(Collectors.groupingBy(Student::getGender));

        groupByGenderStudent.forEach((gender, currStudent) -> {
            System.out.println("No of " + gender + " students: " + currStudent.size());
        });

    }

    public static void averageAgeByGender(List<Student> students) {
        Map<Gender, List<Student>> groupByGenderStudent = students.stream()
                .collect(Collectors.groupingBy(Student::getGender));

        groupByGenderStudent.forEach((gender, currStudent) -> {
            System.out.println("No of " + gender + " students: " + currStudent.size());
        });
        groupByGenderStudent.forEach((gender, currStudent) -> {
            int noOfStudentByGender = currStudent.size();
            double age = 0;
            for (Student student : currStudent) {
                age += student.getAge();
            }
            System.out.println("Average age of " + gender + " student is: " + age / noOfStudentByGender);
        });
    }

    public static void getHighPercentageStudent(List<Student> students) {
        String highPercentageStudent = String.valueOf(students.stream().
                max(Comparator.comparing(Student::getPercentageTillDate))
                .map(student -> student.getName()));

        System.out.println("Student having highest percentage: " + highPercentageStudent);
    }

    public static void getStudentCountByDepartment(List<Student> students) {
        Map<Department, Long> countByDepartment = students.stream()
                .collect(Collectors.groupingBy(Student::getEngDepartment, Collectors.counting()));

        countByDepartment.forEach((department, count) -> System.out.println(department + " : " + count));
    }

    public static void getPercentageByDepartment(List<Student> students) {
        Map<Department, Double> avgPercentageByDepartment = students.stream()
                .collect(Collectors.groupingBy(Student::getEngDepartment, Collectors.averagingDouble(Student::getPercentageTillDate)));

        System.out.println("Average percentage department wise: ");
        avgPercentageByDepartment.forEach((department, avg) -> System.out.println(department + " : " + avg));
    }

    public static void getYoungestMaleFromElectronic(List<Student> students) {
        Optional<Student> youngestMaleInElectronic = students.stream()
                .filter(student -> student.getEngDepartment().equals(Department.ELECTRONIC) && student.getGender().equals(Gender.MALE))
                .collect(Collectors.minBy(Comparator.comparing(Student::getAge)));

        if (youngestMaleInElectronic.isPresent()) {
            System.out.println(youngestMaleInElectronic.get());
        } else {
            System.out.println("No male student found in the Electronic department");
        }
    }

    public static void getCountFromCSE(List<Student> students) {
        Map<Gender, Long> countByGenderInCompScience = students.stream()
                .filter(student -> student.getEngDepartment().equals(Department.COMPUTER_SCIENCE))
                .collect(Collectors.groupingBy(Student::getGender, Collectors.counting()));

        countByGenderInCompScience.forEach((Gender, noOfStudent) -> System.out.println("Male and Female students in Computer Science: " + Gender + " : " + noOfStudent));

    }

    public static void main(String[] args) {
        List<Student> students = getStudent();

        // 1. Print the name of all departments in the college?
        getDepartmentName(students);


        // 2. Get the names of all students who have enrolled after 2018?
        getStudentEnrolledAfter(students);


        // 3. Get the details of all male student in the computer sci department?
        getMaleOfComputerScience(students);


        // 4.How many male and female student are there ? (HINT:use Collectors.groupingBy() for grouping based on gender)
        getNoOfStudentByGender(students);


        //  5.What is the average age of male and female students?
        averageAgeByGender(students);


        // 6.Get the details of highest student having the highest percentage ?
        getHighPercentageStudent(students);

        // 7.Count the number of students in each department? (Hint :use Collectors.groupingBy()).
        getStudentCountByDepartment(students);


        // 8. What is the average percentage achieved in each department?
        getPercentageByDepartment(students);

        // 9. Get the details of youngest male student in the Electronic department?(Hint :Use Collectors.minBy).
        getYoungestMaleFromElectronic(students);

        // 10.How many male and female students are there in the computer science department?
        getCountFromCSE(students);
    }
}
