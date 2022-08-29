package org.example.model;

import java.util.List;

public class Subject {

    private int subjectId;
    private String name;
    List<Student> students;
    List<Evaluation> evaluations;

    public Subject() {
    }

    public Subject(int subjectId, String name, List<Student> students, List<Evaluation> evaluations) {
        this.subjectId = subjectId;
        this.name = name;
        this.students = students;
        this.evaluations = evaluations;
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

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
