package org.example.contoller;

import org.example.model.Student;
import org.example.model.Subject;
import org.example.utils.Data;
import org.example.utils.SubjectType;
import org.example.utils.Validation;

import java.util.ArrayList;
import java.util.List;

public class StudentController {
    private String line;

    public void getStudents() {
        this.line = "-------------------------------------------------------------------------------------------------------------------";
        System.out.println(line);
        System.out.printf("%5s %25s %25s %50s%n", "ID", "NAME", "LASTNAME", "EMAIL");
        System.out.println(line);
        System.out.println("\n");
        Data.students.forEach(st -> System.out.printf("%5s %25s %25s %50s%n", st.getUserId(), st.getName(), st.getLastName(), st.getEmail()));
        System.out.println(line);
    }

    public void saveStudent(Student student) {
        student.setUserId(Data.students.size() + 1);
        List<Subject> subjects = new ArrayList<>();

        for (SubjectType s : SubjectType.values()) {
            subjects.add(new Subject(s.toString(), 0));
        }

        student.setSubjects(subjects);
        Data.students.add(student);
    }

    /*public void getStudentById(int studentId) {
        this.line = "--------------------------------------------------------------------------------------------------------------------------------------";
        StringBuilder content = new StringBuilder();

        if (Validation.isValidStudentId(studentId)) {
            Student st = Data.students.get(studentId - 1);
            System.out.println(this.line);
            System.out.printf("%5s %15s %15s %25s %10s %25s %10s%n", "ID", "NAME", "LASTNAME", "EMAIL", "ID", "SUBJECT", "GRADE");
            System.out.println(this.line);
            System.out.println("\n");
            System.out.printf("%5s %15s %15s %25s%n", st.getUserId(), st.getName(), st.getLastName(), st.getEmail());
            st.getSubjects().forEach(s -> System.out.printf("%5s %15s %15s %25s %10s %25s %5s %.2f%n", "", "", "", "", st.getSubjects().indexOf(s) + 1, s.getName(), "", s.getGrade()));
            System.out.println("\n");
            System.out.println(this.line);
            System.out.printf("%20s %3s", "FAILED:", this.getFailedScores(studentId));
            System.out.printf("%15s %3s", "APPROVED:", this.getApprovedScores(studentId));
            System.out.printf("%25s %.2f", "LOWEST SCORE:", this.getLowestScore(studentId));
            System.out.printf("%25s %.2f%n", "HIGHEST SCORE:", this.getHighestScore(studentId));
            System.out.println(this.line);
        } else {
            System.out.println("\nStudent not found\n");
        }
    }*/

    public String getStudentById(int studentId) {
        this.line = "--------------------------------------------------------------------------------------------------------------------------------------";
        StringBuilder content = new StringBuilder();

        if (Validation.isValidStudentId(studentId)) {
            Student st = Data.students.get(studentId - 1);
            content.append(this.line).append("\n");
            content.append(String.format("%5s %15s %15s %25s %10s %25s %10s%n", "ID", "NAME", "LASTNAME", "EMAIL", "ID", "SUBJECT", "GRADE"));
            content.append(this.line).append("\n");
            content.append("\n");
            content.append(String.format("%5s %15s %15s %25s%n", st.getUserId(), st.getName(), st.getLastName(), st.getEmail()));
            //st.getSubjects().forEach(s -> System.out.printf("%5s %15s %15s %25s %10s %25s %5s %.2f%n", "", "", "", "", st.getSubjects().indexOf(s) + 1, s.getName(), "", s.getGrade()));
            for(Subject s: st.getSubjects()){
                content.append(String.format("%5s %15s %15s %25s %10s %25s %5s %.2f%n", "", "", "", "", st.getSubjects().indexOf(s) + 1, s.getName(), "", s.getGrade()));
            }
            content.append("\n");
            content.append(this.line).append("\n");
            content.append(String.format("%20s %3s", "FAILED:", this.getFailedScores(studentId)));
            content.append(String.format("%15s %3s", "APPROVED:", this.getApprovedScores(studentId)));
            content.append(String.format("%25s %.2f", "LOWEST SCORE:", this.getLowestScore(studentId)));
            content.append(String.format("%25s %.2f%n", "HIGHEST SCORE:", this.getHighestScore(studentId)));
            content.append(this.line).append("\n");

        } else {
            content.append("\nStudent not found\n");
        }

        return content.toString();
    }

    private int getFailedScores(int studentId) {
        if (Validation.isValidStudentId(studentId)) {
            Student st = Data.students.get(studentId - 1);
            return (int) st.getSubjects()
                    .stream()
                    .filter(sj -> sj.getGrade() < 7)
                    .mapToDouble(Subject::getGrade)
                    .count();
        }
        return 0;
    }

    private int getApprovedScores(int studentId) {
        if (Validation.isValidStudentId(studentId)) {
            Student st = Data.students.get(studentId - 1);
            return (int) st.getSubjects()
                    .stream()
                    .filter(sj -> sj.getGrade() >= 7)
                    .mapToDouble(Subject::getGrade)
                    .count();
        }
        return 0;
    }

    private float getLowestScore(int studentId) {
        if (Validation.isValidStudentId(studentId)) {
            Student st = Data.students.get(studentId - 1);
            return (float) st.getSubjects()
                    .stream()
                    .mapToDouble(Subject::getGrade)
                    .min()
                    .orElse(0);
        }
        return 0;
    }

    private float getHighestScore(int studentId) {
        if (Validation.isValidStudentId(studentId)) {
            Student st = Data.students.get(studentId - 1);
            return (float) st.getSubjects()
                    .stream()
                    .mapToDouble(Subject::getGrade)
                    .max()
                    .orElse(0);
        }
        return 0;
    }


}
