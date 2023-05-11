package assignment12;

public class Student {
    private int id;
    private String name;
    private int age;
    private Gender gender;
    private Department engDepartment;

    private int yearOfEnrollment;
    private double percentageTillDate;

    public Student(int id, String name, int age, Gender gender, Department engDepartment, int yearOfEnrollment, double percentageTillDate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.engDepartment = engDepartment;
        this.yearOfEnrollment = yearOfEnrollment;
        this.percentageTillDate = percentageTillDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Department getEngDepartment() {
        return engDepartment;
    }

    public void setEngDepartment(Department engDepartment) {
        this.engDepartment = engDepartment;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", engDepartment=" + engDepartment +
                ", yearOfEnrollment=" + yearOfEnrollment +
                ", percentageTillDate=" + percentageTillDate +
                '}';
    }

    public int getYearOfEnrollment() {
        return yearOfEnrollment;
    }

    public void setYearOfEnrollment(int yearOfEnrollment) {
        this.yearOfEnrollment = yearOfEnrollment;
    }

    public double getPercentageTillDate() {
        return percentageTillDate;
    }

    public void setPercentageTillDate(double percentageTillDate) {
        this.percentageTillDate = percentageTillDate;
    }
}
