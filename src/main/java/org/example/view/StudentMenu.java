package org.example.view;

import org.example.utils.ActionType;
import org.example.view.interfaces.IOption;
import org.example.view.interfaces.IMenu;

public class StudentMenu implements IMenu {
    @Override
    public void showMenu() {
        System.out.println(".____________.");
        System.out.println("|STUDENT MENU|");
        System.out.println("|____________|");
        System.out.println("1: Get students");
        System.out.println("2: save students");
        System.out.println("3: Exit");
        System.out.print("Enter your selection: ");
    }

    @Override
    public void chooseOption(String optionSelected) {
        IOption option;

        switch (optionSelected) {
            case "1" -> {
                            option = new StudentOption(ActionType.Get);
                            option.execute();
                        }
            case "2" -> {
                            option = new StudentOption(ActionType.Save);
                            option.execute();
                        }
            case "3" -> System.out.println();
            default -> System.out.println("\nInvalid input\n");
        }
    }

    @Override
    public String getExitValue() {
        return "3";
    }
}
