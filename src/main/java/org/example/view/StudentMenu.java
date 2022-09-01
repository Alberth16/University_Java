package org.example.view;
import org.example.utils.ActionType;
import org.example.view.interfaces.IMenu;

public class StudentMenu implements IMenu {
    private String exitValue;
    private String option;
    @Override
    public void showMenu() {
        System.out.println(".________________.");
        System.out.println("|  STUDENT MENU  |");
        System.out.println("|________________|");
        System.out.println("1: Get students");
        System.out.println("2: Save students");
        System.out.println("3: Find student by ID");
        System.out.println("4: Exit");
        this.exitValue = "4"; //to exit from menu
        System.out.print("Enter your selection: ");
    }

    @Override
    public void selectOption(String optionSelected) {
        this.option = optionSelected;
        switch (optionSelected) {
            case "1" -> new StudentOption(ActionType.GET).execute();
            case "2" -> new StudentOption(ActionType.SAVE).execute();
            case "3" -> new StudentOption(ActionType.GET_BY_ID).execute();
            case "4" -> System.out.println();
            default -> System.out.println("\nInvalid input\n");
        }
    }

    @Override
    public boolean exit() {
        return this.option.equals(this.exitValue);
    }
}
