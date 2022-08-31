package org.example.view;
import org.example.view.interfaces.IMenu;

public class PrincipalMenu implements IMenu {
    private String exitValue;
    private String option;
    @Override
    public void showMenu() {
        System.out.println(".__________________.");
        System.out.println("|  PRINCIPAL MENU  |");
        System.out.println("|__________________|");
        System.out.println("1: Manage Student");
        System.out.println("2: Manage subjects");
        System.out.println("3: Exit program");
        this.exitValue = "3"; //to exit from menu
        System.out.print("Enter your selection: ");
    }

    @Override
    public void selectOption(String optionSelected) {
        this.option = optionSelected; //to validate if it should exit
        switch (optionSelected) {
            case "1" -> new MenuManager(new StudentMenu()).execute();
            case "2" -> new MenuManager(new SubjectMenu()).execute();
            case "3" -> System.out.println("Leaving...");
            default -> System.out.println("\nInvalid input\n");
        }
    }

    @Override
    public boolean exit() {
        return this.option.equals(this.exitValue);
    }
}
