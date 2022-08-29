package org.example.view;

import org.example.view.interfaces.IDynamicOption;
import org.example.view.interfaces.IMenu;

public class StudentSubMenu implements IMenu {
    @Override
    public void showMenu() {
        System.out.println("MENU \n---------------------");
        System.out.println("1: Get students");
        System.out.println("2: Exit program");
        System.out.print("Enter your selection : ");
    }

    @Override
    public void chooseMenuOption(String optionSelected) {
        IDynamicOption dynamicOption;

        switch (optionSelected) {
            case "1" -> {
                            dynamicOption = new StudentOption();
                            dynamicOption.getStrategy();
                        }
            case "2" -> System.out.println("Exit program");
            default -> System.out.println("\nInvalid input\n");
        }
    }

    @Override
    public String getExitOption() {
        return "2";
    }
}
