package org.example.view;
import org.example.contoller.StudentController;
import org.example.model.Student;
import org.example.utils.ActionType;
import org.example.view.interfaces.IOption;

import java.util.ArrayList;
import java.util.List;

public class StudentOption implements IOption {
     private final StudentController studentController = new StudentController();
     private final ActionType action;
     private List<Student> students;

    public StudentOption(ActionType action){
        students = new ArrayList<>();
        students.add(new Student("Rosa", "Perez", "rperez@yopmail.com", null));
        students.add(new Student("Carlos", "Fernandez", "carlosf@yopmail.com", null));
        students.add(new Student("Esther", "Cortez", "ecortez@yopmail.com", null));
        students.add(new Student("Sandra", "Jorge", "sjorge@yopmail.com", null));
        students.add(new Student("Joel", "Ventura", "jventura@yopmail.com", null));
        students.add(new Student("Mauricio", "Cruz", "mcruz@yopmail.com", null));
        students.add(new Student("Antonio", "Sanchez", "antonios@yopmail.com", null));
        this.action = action;
    }

    @Override
    public void execute() {
        switch (this.action){
            case Get-> this.studentController.getStudents(students);
        }
    }
}
