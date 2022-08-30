package org.example.model;

import java.util.List;

public class Subject {

    private int subjectId;
    private String name;
    Student student;
    List<Evaluation> evaluations;

    public Subject() {
    }

    public Subject(int subjectId, String name, Student student) {
        this.subjectId = subjectId;
        this.name = name;
        this.student = student;
    }

    public List<Evaluation> getEvaluations() {
        return evaluations;
    }

    public void setEvaluations(List<Evaluation> evaluations) {
        this.evaluations = evaluations;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
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
}
