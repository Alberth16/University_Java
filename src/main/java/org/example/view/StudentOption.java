package org.example.view;
import org.example.contoller.StudentController;
import org.example.model.Student;
import org.example.utils.EManagementType;
import org.example.view.interfaces.IDynamicOption;

import java.util.ArrayList;
import java.util.List;

public class StudentOption implements IDynamicOption {
     private StudentController studentController = new StudentController();
     private EManagementType action;
     private List<Student> students;

    public StudentOption(EManagementType action){
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
    public void getStrategy() {
        switch (this.action){
            case Get-> this.getStudents();
        }
    }
}
