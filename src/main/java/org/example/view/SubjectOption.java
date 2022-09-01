package org.example.view;

import org.example.contoller.SubjectController;
import org.example.utils.ActionType;
import org.example.utils.Validation;
import org.example.view.interfaces.IOption;

import java.util.Scanner;

public class SubjectOption implements IOption {
    private final SubjectController subjectController = new SubjectController();
    private final ActionType action;
    Scanner scanner = new Scanner(System.in);

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
            System.out.println("Grade invalid!");
        } else {
            this.subjectController.saveGrade(studentId, subjectId, newGrade);
        }
    }

    @Override
    public void execute() {
        switch (this.action) {
            case GetById -> subjectController.getGradesBySubjectId(5);
            case Get -> subjectController.getSubjects();
            case Save -> this.saveGrade();
        }
    }
}
