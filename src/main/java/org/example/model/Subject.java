package org.example.model;
import java.util.List;

public class Subject {

    private String name;
    private float grade;

    public Subject(String name, float grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }
}
