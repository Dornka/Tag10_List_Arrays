package org.example;

public class Student {
    private String firstname;
    private String lastname;
    private int matriculationnumber;

    public Student (String firstname, String lastname, int matriculationnumber){
        this.firstname = firstname;
        this.lastname = lastname;
        this.matriculationnumber = matriculationnumber;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname){
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname){
        this.lastname = lastname;
    }
    public int getMatriculationnumber() {
        return matriculationnumber;
    }

    public void setMatriculationnumber(int matriculationnumber){
        this.matriculationnumber = matriculationnumber;
    }
    public String toString() {

        return "Student:" +
                " Vorname='" + firstname + '\'' +
                " nachname='" + lastname + '\'' +
                " matrikelnummer='" + matriculationnumber + "'";
    }
}
