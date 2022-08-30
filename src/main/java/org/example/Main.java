package org.example;
import org.example.utils.Screen;
import org.example.view.SubmenuManager;
import org.example.view.PrincipalMenu;

public class Main {
    public static void main(String[] args) {
        Screen.clear();
        new SubmenuManager(new PrincipalMenu()).execute();
    }
}