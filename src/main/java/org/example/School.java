package org.example;
import java.util.List;
import java.util.ArrayList;

public class School {

    private final List<Student> studentList;

    public School() {
        this.studentList = new ArrayList<>();

    }

    public void addStudent (Student student) {
        studentList.add(student);

    }

    public void printAllStudents() {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
