package org.example.model;

import java.util.List;

public class Student {
    private int studentId;
    private String name;
    private String lastName;
    private String emailAddress;
    private List<Subject> subjects;
    public Student() {

    }

    public Student(int studentId, String name, String lastName, String emailAddress, List<Subject> subjects) {
        this.studentId = studentId;
        this.name = name;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.subjects = subjects;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int idStudent) {
        this.studentId = idStudent;
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
