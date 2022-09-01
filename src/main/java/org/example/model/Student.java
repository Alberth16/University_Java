package org.example.model;
import java.util.List;

public class Student extends User{
    private List<Subject> subjects;
    public Student() {}

    public Student(String name, String lastName, String email) {
        this.name=name;
        this.lastName=lastName;
        this.email=email;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }
}
