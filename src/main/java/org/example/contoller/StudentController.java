package org.example.contoller;
import org.example.model.Student;

import java.util.List;

public class StudentController {
    public void getStudents(List<Student> students){
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%5s %25s %25s %50s%n","ID", "NAME", "LASTNAME", "EMAIL");
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println();
        students.forEach((st)-> System.out.printf("%5s %25s %25s %50s%n",st.getUserId(),st.getName(),st.getLastName(),st.getEmail()));
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
    }

}
