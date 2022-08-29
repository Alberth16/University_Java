package org.example.model;

import java.util.List;

public class Subject {

    private int subjectId;
    private String name;
    List<Student> students;

    public Subject() {
    }

    public Subject(int subjectId, String name, List<Student> students) {
        this.subjectId = subjectId;
        this.name = name;
        this.students = students;
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
