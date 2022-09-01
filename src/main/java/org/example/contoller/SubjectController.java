package org.example.contoller;

import org.example.model.Student;
import org.example.model.Subject;
import org.example.utils.Data;
import org.example.utils.SubjectType;
import org.example.utils.Validation;

public class SubjectController {


    public void getSubjectById(int subjectId) {
        if (Validation.isValidSubjectId(subjectId)) {
            System.out.println("--------------------------------------------------------------------------------------------------");
            System.out.printf("%5s %15s %10s %20s %20s %10s%n","ID", "SUBJECT", "ID", "NAME","LASTNAME","GRADE");
            System.out.println("--------------------------------------------------------------------------------------------------");
            System.out.println();
            System.out.printf("%5s %15s%n", subjectId ,SubjectType.values()[subjectId-1]);
            Data.students.forEach((st)-> System.out.printf("%5s %15s %10s %20s %20s %5s %.2f%n","","",st.getUserId(),st.getName(),st.getLastName(),"",st.getSubjects().get(subjectId-1).getGrade()));
            System.out.println();
            System.out.println("--------------------------------------------------------------------------------------------------");
            System.out.printf("%25s %.2f", "AVERAGE GRADE:",this.getAverage(subjectId));
            System.out.printf("%25s %.2f", "MINIMUM GRADE:",this.getMinGrade(subjectId));
            System.out.printf("%25s %.2f%n", "MAXIMUM GRADE:",this.getMaxGrade(subjectId));
            System.out.println("__________________________________________________________________________________________________");
        }else{
            System.out.println("\nSubject not found\n");
        }
    }

    private float getAverage(int subjectId){
        if(Validation.isValidSubjectId(subjectId)){
            float gradesSum = 0;
            for(Student st : Data.students){
                gradesSum += st.getSubjects().get(subjectId-1).getGrade();
            }
                return gradesSum / Data.students.size();
        }
        return 0;
    }

    private float getMinGrade(int subjectId){
        if(Validation.isValidSubjectId(subjectId)){
            return (float) Data.students
                                .stream()
                                .map(Student::getSubjects)
                                .mapToDouble((sb)->sb.get(subjectId-1).getGrade())
                                .min()
                                .orElse(0);
        }
        return 0;
    }
    private float getMaxGrade(int subjectId){
        if(Validation.isValidSubjectId(subjectId)){
            return (float) Data.students
                    .stream()
                    .map(Student::getSubjects)
                    .mapToDouble((sb)->sb.get(subjectId-1).getGrade())
                    .max()
                    .orElse(0);
        }
        return 0;
    }

    public void getSubjects(){
        int i = 1;
        System.out.println("__________________________________");
        System.out.printf("%5s %25s%n", "ID", "SUBJECT");
        System.out.println("__________________________________");
        System.out.println();
        for(SubjectType sb: SubjectType.values()){
           System.out.printf("%5s %25s%n", i++, sb);
       }
        System.out.println("__________________________________");
    }

    public void saveGrade(int studentId, int subjectId, float newGrade){
        if(Validation.isValidStudentId(studentId) && Validation.isValidSubjectId(subjectId)){
            Data.students.get(studentId-1).getSubjects().get(subjectId-1).setGrade(newGrade);
            Student st = Data.students.get(studentId -1);
            Subject sj = st.getSubjects().get(subjectId -1);

            System.out.println("_________________________________________________________________________");
            System.out.printf("%5s %20s %20s %15s %5s%n", st.getUserId(),st.getName(), st.getLastName(),sj.getName(), sj.getGrade() );
            System.out.println("_________________________________________________________________________");
        }else{
            System.out.println("\nSubject not found\n");
        }
    }
}
