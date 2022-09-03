package org.example.view;

import org.example.utils.ActionType;
import org.example.view.interfaces.IMenu;
import org.example.view.interfaces.IOption;

public class StudentMenu implements IMenu {
    private String exitValue;
    private String optionSelected;

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
        this.optionSelected = optionSelected;
        IOption option;
        switch (optionSelected) {
            case "1" -> option = new StudentOption(ActionType.GET);
            case "2" -> option = new StudentOption(ActionType.SAVE);
            case "3" -> option = new StudentOption(ActionType.GET_BY_ID);
            case "4" -> option = new MessageOption("");
            default -> option = new MessageOption("\nInvalid input\n");
        }

        option.execute();
    }

    @Override
    public boolean exit() {
        return this.optionSelected.equals(this.exitValue);
    }
}
