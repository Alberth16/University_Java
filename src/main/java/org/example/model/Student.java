package org.example.model;

public class Student {
    private int idStudent;
    private String name;
    private String lastName;
    private String emailAddress;
    public Student() {

    }

    public Student(int idStudent, String name, String lastName, String emailAddress) {
        this.idStudent = idStudent;
        this.name = name;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
