package org.example.view;
import org.example.utils.StudentTxtReport;
import org.example.utils.SubjectTxtReport;
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
        System.out.println("3: Generate subject report");
        System.out.println("4: Generate student report");
        System.out.println("5: Exit program");
        this.exitValue = "5"; //to exit from menu
        System.out.print("Enter your selection: ");
    }

    @Override
    public void selectOption(String optionSelected) {
        this.option = optionSelected; //to validate if it should exit
        switch (optionSelected) {
            case "1" -> new MenuManager(new StudentMenu()).execute();
            case "2" -> new MenuManager(new SubjectMenu()).execute();
            case "3" -> new ReportOption(new SubjectTxtReport()).execute();
            case "4" -> new ReportOption(new StudentTxtReport()).execute();
            case "5" -> System.out.println("Leaving...");
            default -> System.out.println("\nInvalid input\n");
        }
    }

    @Override
    public boolean exit() {
        return this.option.equals(this.exitValue);
    }
}
