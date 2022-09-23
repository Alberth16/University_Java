package org.example.view;
import org.example.contoller.StudentController;
import org.example.model.Student;
import org.example.utils.ActionType;
import org.example.utils.Validation;
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
        Student student = new Student();
        System.out.println("Enter a new Student");
        System.out.print("Name: ");
        student.setName(scanner.next());
        System.out.print("LastName: ");
        student.setLastName(scanner.next());
        System.out.print("email: ");
        student.setEmail(scanner.next());
        this.studentController.saveStudent(student);
    }

    private void getStudentById(){
        System.out.print("Enter student ID: ");
        int id = Validation.validateParseInt(scanner.next());
        System.out.println(this.studentController.getStudentById(id));
    }

    @Override
    public void execute() {
        switch (this.action){
            case GET-> this.studentController.getStudents();
            case SAVE -> {
                this.saveStudent();
                this.studentController.getStudents();
            }
            case GET_BY_ID -> this.getStudentById();
            default -> System.out.println("\nInvalid!\n");
        }
    }
}
