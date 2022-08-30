package org.example.view;

import org.example.utils.Screen;
import org.example.view.interfaces.IOption;
import org.example.view.interfaces.IMenu;

import java.util.Scanner;

public class SubmenuManager implements IOption {
    private final IMenu menu;
    public SubmenuManager(IMenu menu){
        this.menu = menu;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        String option;

        do {
            this.menu.showMenu();
            option = scanner.next();
            Screen.clear();
            this.menu.chooseOption(option);
        }while (!option.equals(this.menu.getExitValue()));
    }
}
