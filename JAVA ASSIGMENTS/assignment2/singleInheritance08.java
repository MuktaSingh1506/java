package assignment2;

import java.time.*;

class Person {
    String name;
    LocalDate DOB;
    String fatherName;
    String motherName;

    Person(String name, LocalDate DOB, String fatherName, String motherName) {
        this.name = name;
        this.DOB = DOB;
        this.fatherName = fatherName;
        this.motherName = motherName;
    }

    void updateName(String newName) {
        this.name = newName;
    }

    void displayInfo() {
        System.out.println("Person Info: ");
        System.out.println(
                "Name: " + name + "\nDOB: " + DOB + "\nFather Name: " + fatherName + "\nMother Name: " + motherName);
    }

    // Calculating age using Period package
    int getAge() {
        Period age = Period.between(DOB, LocalDate.now());
        return age.getYears();
    }
}

class Student extends Person {
    int marks;
    String department;

    Student(String name, LocalDate DOB, String fatherName, String motherName) {
        super(name, DOB, fatherName, motherName);
        marks = 0;
        department = "NA";
    }

    void displayInfo() {
        System.out.println("Marks: " + marks + " Department: " + department);

        // to call a method from parent class, we use super keyword
        super.displayInfo();
    }
}

public class singleInheritance08 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2001, 10, 5);

        // It will create an object of student not the person
        Person newPerson = new Student("Radha", date, "Father", "Mother");
        int age = newPerson.getAge();

        newPerson.displayInfo();
        System.out.println("Age: " + age);
    }

}
