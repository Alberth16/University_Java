package org.example.utils;

public class Validation {
    public static int validateParseInt(String idString){
        if(idString.matches("\\d+")){
            return Integer.parseInt(idString);
        }
        return 0;
    }

    public static float validateParseFloat(String gradeString){
        if(gradeString.matches("\\d+(.\\d+)?")){
            return Float.parseFloat(gradeString);
        }
        return 0;
    }

    public static boolean isValidStudentId(int id){
        if(id > 0 && id <= Data.students.size()){
            return true;
        }
        return false;
    }

    public static boolean isValidSubjectId(int id){
        if(id > 0 && Data.students.size() > 0){
            if(id <= Data.students.get(0).getSubjects().size()){
                return true;
            }
        }
        return false;
    }
}
