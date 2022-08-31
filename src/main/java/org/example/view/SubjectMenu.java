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
        System.out.println("1: Get scores by subject ID");
        System.out.println("2: Get subjects");
        System.out.println("3: Exit");
        this.exitValue = "3"; //to exit from menu
        System.out.print("Enter your selection: ");
    }

    @Override
    public void selectOption(String optionSelected) {
        this.option = optionSelected;
        switch (optionSelected) {
            case "1" -> new SubjectOption(ActionType.GetById).execute();
            case "2" -> new SubjectOption(ActionType.Get).execute();
            case "3" -> System.out.println();
            default -> System.out.println("\nInvalid input\n");
        }
    }

    @Override
    public boolean exit() {
        return this.option.equals(this.exitValue);
    }
}
