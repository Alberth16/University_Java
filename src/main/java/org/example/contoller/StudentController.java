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

        for(SubjectType s: SubjectType.values()){
            subjects.add(new Subject(s.toString(), student, 0));
        }

        student.setSubjects(subjects);
        Data.students.add(student);
    }

    public void getStudentById(int studentId){
        if(studentId <= Data.students.size() && studentId > 0){
            Student st = Data.students.get(studentId - 1);
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
            System.out.printf("%5s %15s %15s %25s %10s %25s %10s%n","ID", "NAME", "LASTNAME", "EMAIL", "ID", "SUBJECT", "GRADE");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println();
            System.out.printf("%5s %15s %15s %25s%n",st.getUserId(),st.getName(),st.getLastName(),st.getEmail());
            st.getSubjects().forEach((s)-> System.out.printf("%5s %15s %15s %25s %10s %25s %5s %.2f%n","","","","",st.getSubjects().indexOf(s)+1,s.getName(),"",s.getGrade()));
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        }else{
            System.out.println("\nStudent not found\n");
        }
    }

}
