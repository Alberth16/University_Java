package org.example.contoller;
import org.example.model.Student;
import org.example.model.Subject;
import org.example.utils.Data;
import org.example.utils.SubjectType;

import java.util.ArrayList;
import java.util.List;

public class StudentController {
    public void getStudents(){
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%5s %25s %25s %50s%n","ID", "NAME", "LASTNAME", "EMAIL");
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println();
        Data.students.forEach((st)-> System.out.printf("%5s %25s %25s %50s%n",st.getUserId(),st.getName(),st.getLastName(),st.getEmail()));
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
    }

    public void saveStudent(Student student){
        student.setUserId(Data.students.size() + 1);
        List<Subject> subjects = new ArrayList<>();
        int id = Data.subjects.size()+1;

        for(SubjectType s: SubjectType.values()){
            subjects.add(new Subject(id++, s.toString(), student));
        }

        student.setSubjects(subjects);
        Data.subjects.addAll(subjects);
        Data.students.add(student);
    }

}
