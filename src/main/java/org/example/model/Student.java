package org.example.model;

public class Student {
    private String name;
    private String lastName;
    private String emailAddress;

    public Student(){

    }
    public Student(String name, String lastName, String emailAddress) {
        this.name = name;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
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
