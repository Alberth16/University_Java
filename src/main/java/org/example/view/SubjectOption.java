package org.example.view;

import org.example.contoller.SubjectController;
import org.example.utils.ActionType;
import org.example.view.interfaces.IOption;

public class SubjectOption implements IOption {
    private final SubjectController subjectController = new SubjectController();
    private final ActionType action;

    public SubjectOption(ActionType action) {
        this.action = action;
    }

    @Override
    public void execute() {
        switch (this.action){
            case GetById -> subjectController.getGradesBySubjectId(5);
            case Get -> subjectController.getSubjects();
        }
    }
}
