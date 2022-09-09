package test;

import junit.framework.TestCase;
import org.example.model.Student;
import org.junit.Assert;
import org.example.utils.Validation;
import org.example.utils.Data;



public class ValidationTest extends TestCase {
    Validation fun = new Validation();

    // function ValidateParseInt
    public void testValidateParseInt_EqualTen() {
        String num = "10";
        Assert.assertEquals(10, fun.validateParseInt(num));
    }

    public void testValidateParseInt_Throw() {
        String num = "10.2";
        Assert.assertThrows(IllegalArgumentException.class, () -> fun.validateParseInt(num));
    }



    // function ValidateParseFloat
    public void testValidateParseFloat_EqualTen() {
        String num = "10";
        Assert.assertEquals(10, fun.validateParseInt(num));
    }

    public void testValidateParseFloat_Throw() {
        String num = "a8.2";
        Assert.assertThrows(IllegalArgumentException.class, () -> fun.validateParseFloat(num));
    }


    // function IsValidStudentId
    public void testIsValidStudentId_True() {
        Data.insertStudentData();
        Student st = Data.students.get(4-1);
        Assert.assertTrue( fun.isValidStudentId(st.getUserId()));
    }

    public void testIsValidStudentId_False() {
        Data.insertStudentData();
        Assert.assertFalse(fun.isValidStudentId(11));

    }


    // function IsValidSubjectId
    public void testIsValidSubjectId_False() {
        Assert.assertFalse( fun.isValidStudentId(-1));
    }

    public void testIsValidSubjectIdTrue() {
        Data.insertStudentData();
        Student st = Data.students.get(2);
        Assert.assertTrue( fun.isValidStudentId(st.getUserId()));
    }

}