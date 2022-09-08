package org.example.utils;

import org.example.contoller.StudentController;
import org.example.utils.abstracts.Report;

import java.util.Scanner;

public class StudentTxtReport extends Report {
//    @Override
    public String generate() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student ID: ");
        int id = Validation.validateParseInt(scanner.next());
        String content = new StudentController().getStudentById(id);
        String filename = "report-student.txt";
        this.create(content, filename);
        return "reports/"+filename;
    }
}
