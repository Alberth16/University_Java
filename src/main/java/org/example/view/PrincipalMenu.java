package org.example.view;

import org.example.view.interfaces.IOption;
import org.example.view.interfaces.IMenu;

public class PrincipalMenu implements IMenu {
    @Override
    public void showMenu() {
            System.out.println(".______________.");
            System.out.println("|PRINCIPAL MENU|");
            System.out.println("|______________|");
            System.out.println("1: Manage Student");
            System.out.println("2: Update ");
            System.out.println("3: Search ");
            System.out.println("4: Display ");
            System.out.println("5: Add Score");
            System.out.println("6: Exit program");
            System.out.print("Enter your selection: ");
    }

    @Override
    public void chooseOption(String optionSelected) {
        IOption option;

        switch (optionSelected) {
            case "1" -> {
                            option = new SubmenuManager(new StudentMenu());
                            option.execute();
                        }
            case "2" -> System.out.println("*** Update Student ***");
            case "3" -> System.out.println("*** Search Student ***");
            case "4" -> System.out.println("*** Display Students ***");
            case "5" -> System.out.println("*** Add Score ***");
            case "6" -> System.out.println("Leaving...");
            default -> System.out.println("\nInvalid input\n");
        }
    }

    @Override
    public String getExitValue() {
        return "6";
    }
}
