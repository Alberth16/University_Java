package org.example.view;

import org.example.utils.ActionType;
import org.example.view.interfaces.IMenu;

public class SubjectMenu implements IMenu {
    private String exitValue;
    private String option;
    @Override
    public void showMenu() {
        System.out.println(".________________.");
        System.out.println("|  SUBJECT MENU  |");
        System.out.println("|________________|");
        System.out.println("1: Get Subject by ID and its student");
        System.out.println("2: Exit");
        this.exitValue = "2"; //to exit from menu
        System.out.print("Enter your selection: ");
    }

    @Override
    public void selectOption(String optionSelected) {
        this.option = optionSelected;
        switch (optionSelected) {
            case "1" -> new SubjectOption(ActionType.GetById).execute();
            case "2" -> System.out.println();
            default -> System.out.println("\nInvalid input\n");
        }
    }

    @Override
    public boolean exit() {
        return this.option.equals(this.exitValue);
    }
}
