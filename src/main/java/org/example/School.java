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
    public boolean removeStudentById(int matriculationnumber) {
        for (Student student : studentList) {
            if (student.getMatriculationnumber() == matriculationnumber) {
                studentList.remove(student);
                return true;
            }
        }
        return false;
    }

    public void printAllStudents() {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    public Student findStudentById(int matriculationnumber) {

        for (Student student : studentList) {
            if (student.getMatriculationnumber() == matriculationnumber) {
                return student;
            }
        }
        return null;
    }
}
