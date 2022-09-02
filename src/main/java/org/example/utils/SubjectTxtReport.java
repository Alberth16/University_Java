package org.example.utils;

import org.example.contoller.SubjectController;
import org.example.utils.abstracts.Report;
import java.util.Scanner;

public class SubjectTxtReport extends Report {

    @Override
    public String generate() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter subject ID: ");
        int id = Validation.validateParseInt(scanner.next());
        String content = new SubjectController().getSubjectById(id);
        String filename = "report-subject.txt";
        this.create(content, filename);
        return "reports/"+filename;
    }
}
