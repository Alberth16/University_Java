package org.example.view;

public class FirstSubMenu implements IMenu{
    @Override
    public void showMenu() {
        System.out.println("MENU \n---------------------");
        System.out.println("1: sub option");
        System.out.println("2: Exit program");
        System.out.print("Enter your selection : ");
    }

    @Override
    public void chooseMenuOption(String optionSelected) {
        switch (optionSelected) {
            case "1" -> System.out.println("*** sub option ***");
            case "2" -> System.out.println("Exit program");
            default -> System.out.println("\nInvalid input\n");
        }
    }

    @Override
    public String getExitOption() {
        return "2";
    }
}
