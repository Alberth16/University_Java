package org.example.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Subject {

    private final String name;
    private float grade;

    public Subject(String name, float grade) {
        this.name = name;
        this.grade = grade;
    }

}
