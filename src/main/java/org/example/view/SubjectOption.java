package org.example.view;

import lombok.extern.java.Log;
import org.example.contoller.SubjectController;
import org.example.utils.ActionType;
import org.example.utils.Validation;
import org.example.view.interfaces.IOption;

import java.util.Scanner;

@Log
public class SubjectOption implements IOption {
    private final SubjectController subjectController = new SubjectController();
    Scanner scanner = new Scanner(System.in);
    private final ActionType action;

    public SubjectOption(ActionType action) {
        this.action = action;
    }

    public void saveGrade() {
        System.out.print("Enter new grade (range 1-10): ");
        float newGrade = Validation.validateParseFloat(scanner.next());
        System.out.print("Enter student Id: ");
        int studentId = Validation.validateParseInt(scanner.next());
        System.out.print("Enter subject Id: ");
        int subjectId = Validation.validateParseInt(scanner.next());

        if (newGrade > 10 || newGrade < 0) {
            log.info("Grade invalid!");
        } else {
            this.subjectController.saveGrade(studentId, subjectId, newGrade);
        }
    }

    public void getSubjectById() {
        System.out.print("Enter subject ID: ");
        int id = Validation.validateParseInt(scanner.next());
        System.out.println(this.subjectController.getSubjectById(id));
    }

    @Override
    public void execute() {
        switch (this.action) {
            case GET_BY_ID -> this.getSubjectById();
            case GET -> subjectController.getSubjects();
            case SAVE -> this.saveGrade();
            default -> System.out.println("\nInvalid!\n");
        }
    }
}
