package org.example.contoller;

import org.example.model.Student;
import org.example.utils.Data;

public class SubjectController {

    public void getGradesBySubjectId(int subjectId){
// validar que el id este dentro del rando del list de matrias (dentro del rango del size)
            System.out.println( this.getAverageGrades(subjectId));
        System.out.println( this.getAverageGrades(subjectId) / Data.students.size());


    }

    private float getAverageGrades(int subjectId){
        float gradesSum = 0;
        for(Student st : Data.students){
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
