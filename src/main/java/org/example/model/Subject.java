package org.example.model;
import java.util.List;

public class Subject {

    private String name;
    Student student;
    private float grade;
    List<Evaluation> evaluations;

    public Subject() {
    }

    public Subject(String name, Student student, float grade) {
        this.name = name;
        this.student = student;
        this.grade = grade;
    }

    public List<Evaluation> getEvaluations() {
        return evaluations;
    }

    public void setEvaluations(List<Evaluation> evaluations) {
        this.evaluations = evaluations;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }
}
