package org.example.utils;


public class Validation {

    public Validation() {
    }

    public static int validateParseInt(String idString) {
            if (idString.matches("\\d+"))
                return Integer.parseInt(idString);
            throw new IllegalArgumentException(" Incorrect data  ");
    }


    public static float validateParseFloat(String gradeString) {
        if (gradeString.matches("\\d+(.\\d+)?")) {
            return Float.parseFloat(gradeString);
        }
        throw new IllegalArgumentException(" Incorrect data  ");
    }



    public static boolean isValidStudentId(Integer id )  {
        int dt = Data.students.size();
        return id > 0 && id < dt;
    }


    public static boolean isValidSubjectId(int id) {
        if (id > 0 && !Data.students.isEmpty()) {
            return id <= Data.students.get(0).getSubjects().size();
        }
        return false;
    }
}
