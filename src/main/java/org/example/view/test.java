package org.example.view;

import org.example.model.Student;
import org.example.utils.Data;
import org.example.utils.Validation;

public class test {
    public static void main(String[] args) {
        Data.insertStudentData();
        Validation val = new Validation();

        System.out.println(val.validateParseFloat("25.1"));

//        if (val.isValidStudentId(40)) System.out.println("yes");
//        else System.out.println("no");
    }
}
