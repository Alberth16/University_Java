package test;

import junit.framework.TestCase;
import org.example.contoller.SubjectController;
import org.example.model.Subject;
import org.junit.Assert;

public class SubjectControllerTest extends TestCase {
    SubjectController Data = new SubjectController();
    Subject Subject1 = new Subject("Sandra", 2);

    public void testGetSubjectById() {
        Assert.assertNotNull(Data.getSubjectById(2));
    }

    public void testSaveGrade() {
    }

}