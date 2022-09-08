package test;

import org.example.contoller.StudentController;
import org.example.model.Student;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class StudentControllerTest {
    StudentController data = new StudentController();
    Student Student1 = new Student(
            "Juan", "Peres", "juan@gmail.com"
    );

    @Test
    public void testGetStudents() {
        data.getStudents();
        Assert.assertNotNull(data);
    }

    @Test
    public void testSaveStudent() {
        data.saveStudent(Student1);
        Assert.assertNotNull(data);
    }

    @Test
    public void testGetStudentById() {
        Assert.assertNotNull( data.getStudentById(2) );
    }


}