package org.example.view;

import lombok.extern.java.Log;
import org.example.utils.StudentTxtReport;
import org.example.utils.SubjectTxtReport;
import org.example.view.interfaces.IMenu;
import org.example.view.interfaces.IOption;

@Log
public class PrincipalMenu implements IMenu {
    private String exitValue;
    private String optionSelected;

    @Override
    public void showMenu() {
        System.out.println(".__________________.");
        System.out.println("|  PRINCIPAL MENU  |");
        System.out.println("|__________________|");
        System.out.println("1: Manage Student");
        System.out.println("2: Manage subjects");
        System.out.println("3: Generate subject report");
        System.out.println("4: Generate student report");
        System.out.println("5: Exit program");
        this.exitValue = "5"; //to exit from menu
        System.out.print("Enter your selection: ");
    }

    @Override
    public void selectOption(String optionSelected) {
        this.optionSelected = optionSelected; //to validate if it should exit
        IOption option;
        switch (optionSelected) {
            case "1" -> option = new MenuManager(new StudentMenu());
            case "2" -> option = new MenuManager(new SubjectMenu());
            case "3" -> option = new ReportOption(new SubjectTxtReport());
            case "4" -> option = new ReportOption(new StudentTxtReport());
            case "5" -> option = new MessageOption("Leaving...");
            default -> {
                option = new MessageOption("\n.\n");
                log.info("Invalid input");
            }
        }

        option.execute();
    }

    @Override
    public boolean exit() {
        return this.optionSelected.equals(this.exitValue);
    }
}
