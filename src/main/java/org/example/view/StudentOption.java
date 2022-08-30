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
        this.action = action;
    }

    private void getStudents(){
        students.add(new Student("Daniela", "Cruz", "@email.com", null));
        students.add(new Student("Willy", "Wonca", "@emaiWonca.com", null));
        students.add(new Student("meco", "third", "@mail3.com", null));

        studentController.getStudents(students);
    }

    @Override
    public void execute() {
        switch (this.action){
            case Get-> this.getStudents();
        }
    }
}
