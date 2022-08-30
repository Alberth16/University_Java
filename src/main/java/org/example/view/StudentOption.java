package org.example.view;
import org.example.contoller.StudentController;
import org.example.model.Student;
import org.example.utils.ActionType;
import org.example.utils.Data;
import org.example.view.interfaces.IOption;
import java.util.Scanner;

public class StudentOption implements IOption {
     private final StudentController studentController = new StudentController();
     private final ActionType action;
     Scanner scanner = new Scanner(System.in);

    public StudentOption(ActionType action){
        this.action = action;
    }

    private void saveStudent(){
        System.out.println("New Student");
        System.out.print("Name: ");
        String name = scanner.next();
        System.out.print("LastName: ");
        String lastName = scanner.next();
        System.out.print("email: ");
        String email = scanner.next();

        this.studentController.saveStudent(new Student(name, lastName, email));
    }

    @Override
    public void execute() {
        switch (this.action){
            case Get-> this.studentController.getStudents();
            case Save -> {
                            this.saveStudent();
                            this.studentController.getStudents();
                        }
        }
    }
}
