package org.example.view;

import org.example.utils.ActionType;
import org.example.view.interfaces.IMenu;
import org.example.view.interfaces.IOption;

public class SubjectMenu implements IMenu {
    private String exitValue;
    private String optionSelected;
    @Override
    public void showMenu() {
        System.out.println(".________________.");
        System.out.println("|  SUBJECT MENU  |");
        System.out.println("|________________|");
        System.out.println("1: Get scores by subject ID");
        System.out.println("2: Get subjects");
        System.out.println("3: save or update score");
        System.out.println("4: Exit");
        this.exitValue = "4"; //to exit from menu
        System.out.print("Enter your selection: ");
    }

    @Override
    public void selectOption(String optionSelected) {
        IOption option;
        this.optionSelected = optionSelected;
        switch (optionSelected) {
            case "1" -> option=new SubjectOption(ActionType.GET_BY_ID);
            case "2" -> option= new SubjectOption(ActionType.GET);
            case "3" -> option=new SubjectOption(ActionType.SAVE);
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
