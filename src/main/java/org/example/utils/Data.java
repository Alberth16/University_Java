package org.example.utils;

import org.example.model.Student;
import org.example.model.Subject;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Use this class like a database
 * Use word "static" to make global variables
 */
public class Data {
    public static final List<Student> students = new ArrayList<>();
    private static final Random random = new Random();

    public Data() {
    }

    public static void insertStudentData() {
        int i = Data.students.size();
        String email = "test@yopmail.com";

        Student student1 = new Student();
        student1.setUserId(Data.students.size() + 1);
        student1.setName("Hugo");
        student1.setLastName("Vernal");
        student1.setEmail(email);
        students.add(student1);

        Student student2 = new Student();
        student2.setUserId(Data.students.size() + 1);
        student2.setName("Fernando");
        student2.setLastName("Acosta");
        student2.setEmail(email);
        students.add(student2);

        Student student3 = new Student();
        student3.setUserId(Data.students.size() + 1);
        student3.setName("Sandra");
        student3.setLastName("Smith");
        student3.setEmail(email);
        students.add(student3);

        Student student4 = new Student();
        student4.setUserId(Data.students.size() + 1);
        student4.setName("Ricardo");
        student4.setLastName("Tylor");
        student4.setEmail(email);
        students.add(student4);

        Student student5 = new Student();
        student5.setUserId(Data.students.size() + 1);
        student5.setName("Ingrid");
        student5.setLastName("Jones");
        student5.setEmail(email);
        students.add(student5);

        Student student6 = new Student();
        student6.setUserId(Data.students.size() + 1);
        student6.setName("Moises");
        student6.setLastName("Williams");
        student6.setEmail(email);
        students.add(student6);

        Student student7 = new Student();
        student7.setUserId(Data.students.size() + 1);
        student7.setName("Israel");
        student7.setLastName("Brown");
        student7.setEmail(email);
        students.add(student7);

        Student student8 = new Student();
        student8.setUserId(Data.students.size() + 1);
        student8.setName("James");
        student8.setLastName("Brown");
        student8.setEmail(email);
        students.add(student8);

        Student student9 = new Student();
        student9.setUserId(Data.students.size() + 1);
        student9.setName("Samuel");
        student9.setLastName("Cabrera");
        student9.setEmail(email);
        students.add(student9);

        Student student10 = new Student();
        student10.setUserId(Data.students.size() + 1);
        student10.setName("Elias");
        student10.setLastName("Campos");
        student10.setEmail(email);
        students.add(student10);


        for (; i < Data.students.size(); i++) {
            List<Subject> subjects = new ArrayList<>();

            for (SubjectType s : SubjectType.values()) {
                float randomScore = 4 + random.nextFloat() * (10 - 4);
                subjects.add(new Subject(s.toString(), randomScore));
            }
            Data.students.get(i).setSubjects(subjects);
        }
    }
}
