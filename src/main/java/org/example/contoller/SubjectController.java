package org.example.contoller;

import org.example.model.Student;
import org.example.model.Subject;
import org.example.utils.Data;

public class SubjectController {

    public void getGradesBySubjectId(int subjectId) {
        if (subjectId <= Data.students.get(0).getSubjects().size() && subjectId > 0) {
            System.out.println("-------------------------------------------------------------------------------------------------------------------");
            System.out.printf("%5s %25s %8s %5s%n", "ID", "SUBJECT", "ID STUDENT", "GRADE");
            System.out.println("-------------------------------------------------------------------------------------------------------------------");
            System.out.println();
            /*Data.students.forEach((st) ->{
                Subject sj = st.getSubjects().get(subjectId - 1);
                System.out.printf("",subjectId,sj.getName());
            });*/


        }
    }

    private float getAverageGrades(int subjectId) {
        float gradesSum = 0;
        for (Student st : Data.students) {
            gradesSum += st.getSubjects().get(subjectId).getGrade();
        }
        return gradesSum;
    }

    /*private float getMinGrade(){

    }
    private float getMaxGrade(){

    }

    public void getSubjects(){
       // mostrar el enum de materias , con su indic como id y el nombre
    }*/
}
