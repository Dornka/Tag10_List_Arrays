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

        int searchnumber = 13007;
        Student foundstudent = school.findStudentById(searchnumber);

        if (foundstudent != null) {
            System.out.println("Gefundener Studen: " + foundstudent);
        } else {
            System.out.println("Student mit Martikelnummer " + searchnumber + " nicht gefunden.");
        }

        int removingmarticulationnumber = 12345;
        boolean removed = school.removeStudentById(removingmarticulationnumber);

        if (removed) {
            System.out.println("Student mit der Matrikelnummer " + removingmarticulationnumber + " wurde entfernt.");
        } else {
            System.out.println(" Studen mit der Matrikelnummer " + removingmarticulationnumber + " konnte nicht gefunden werden.");
        }
    }
}