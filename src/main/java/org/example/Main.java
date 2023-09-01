package org.example;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {

        School school = new School();

        List<Student> studentlist = new ArrayList<>();

        school.addStudent(new Student("Maik", "Herrmann", 13007));
        school.addStudent(new Student("Peter", "Beinhard", 67890));
        school.addStudent(new Student("Tina", "Bierfrau", 12345));

        school.printAllStudents();

    }
}