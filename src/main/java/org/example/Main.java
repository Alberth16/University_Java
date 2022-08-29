package org.example;
import org.example.view.IMenu;
import org.example.view.PrincipalMenu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IMenu menu = new PrincipalMenu();
        String option;

        do {
            menu.showMenu();
            option = scanner.next();
            menu.chooseMenuOption(option);
        }while (!option.equals(menu.getExitOption()));
    }
}