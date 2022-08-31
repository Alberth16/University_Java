package org.example.contoller;

import org.example.model.Student;
import org.example.utils.Data;
import org.example.utils.SubjectType;

public class SubjectController {

    public void getGradesBySubjectId(int subjectId){
// validar que el id este dentro del rando del list de matrias (dentro del rango del size)
            System.out.println( this.getAverage(subjectId));
        System.out.println( this.getAverage(subjectId) / Data.students.size());


    }

    private float getAverage(int subjectId){
        float gradesSum = 0;
        for(Student st : Data.students){
            if(subjectId > 0 && subjectId <= st.getSubjects().size()){
                gradesSum += st.getSubjects().get(subjectId).getGrade();
            }
        }
        return gradesSum / Data.students.size();
    }

    private float getMinGrade(int subjectId){
        if(subjectId > 0 && subjectId <= Data.students.get(0).getSubjects().size()){
            return (float) Data.students
                                .stream()
                                .map(Student::getSubjects)
                                .mapToDouble((sb)->sb.get(subjectId).getGrade())
                                .min()
                                .orElse(0);
        }
        return 0;
    }
    private float getMaxGrade(int subjectId){
        if(subjectId > 0 && subjectId <= Data.students.get(0).getSubjects().size()){
            return (float) Data.students
                    .stream()
                    .map(Student::getSubjects)
                    .mapToDouble((sb)->sb.get(subjectId).getGrade())
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
}
