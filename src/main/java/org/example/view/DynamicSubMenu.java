package org.example.view;

import org.example.utils.Screen;
import org.example.view.interfaces.IDynamicOption;
import org.example.view.interfaces.IMenu;

import java.util.Scanner;

public class DynamicSubMenu implements IDynamicOption {
    private final IMenu submenu;
    public DynamicSubMenu(IMenu submenu){
        this.submenu = submenu;
    }

    @Override
    public void getStrategy() {
        Scanner scanner = new Scanner(System.in);
        String option;

        do {
            this.submenu.showMenu();
            option = scanner.next();
            Screen.clear();
            this.submenu.chooseMenuOption(option);
        }while (!option.equals(this.submenu.getExitOption()));
    }
}
