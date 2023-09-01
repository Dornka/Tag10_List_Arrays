package org.example;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {

        School school = new School();

        List<Student> studentlist = new ArrayList<>();

        Student student1 = new Student("Max", "Mustermann", 12345);
        Student student2 = new Student("Anna", "Musterfrau", 54321);
        Student student3 = new Student("Tina", "Bierfrau", 12345);
        Course course1 = new Course("Mathematik", "Prof. Müller", "Raum 101");
        Course course2 = new Course("Informatik", "Prof. Schmidt", "Raum 102");

        student1.addCourse(course1);
        student2.addCourse(course1);
        student2.addCourse(course2);
        student3.addCourse(course1);
        school.addStudent(student1);
        school.addStudent(student2);



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

        List<Course> studentCourses = school.findCoursesByStudentId(searchnumber);
        if (!studentCourses.isEmpty()) {
            System.out.println("Kurse für Student mit Matrikelnummer " + searchnumber + ":");
            for (Course course : studentCourses) {
                System.out.println(course);
            }
        } else {
            System.out.println("Keine Kurse gefunden für Student mit Matrikelnummer " + searchnumber + ".");
        }
    }
}