package org.example.model;
import java.util.List;

public class Subject {

    private String name;
    Student student;
    private float grade;

    public Subject(String name, Student student, float grade) {
        this.name = name;
        this.student = student;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public Student getStudent() {
        return student;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }
}
