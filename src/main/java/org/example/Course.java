package org.example;

public class Course {

    private String coursename;
    private String teacher;
    private String room;


    public Course(String coursename, String teacher, String room) {

        this.coursename = coursename;
        this.teacher = teacher;
        this.room = room;
    }

    public String getCoursename() {
        return coursename;
    }

    public String getTeacher() {
        return teacher;
    }
    public String getRoom() {
        return room;
    }

    public String toString() {
        return "Kurs:" +
                " Kursname= " + coursename + '\'' +
                ", Dozent= " + teacher + '\'' +
                ", Raum= " + room + '\'';
    }
}
