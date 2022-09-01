package org.example.model;
public class Subject {

    private final String name;
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
