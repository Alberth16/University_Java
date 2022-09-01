package org.example;

import org.example.utils.Data;
import org.example.utils.Screen;
import org.example.view.MenuManager;
import org.example.view.PrincipalMenu;

public class Main {
    public static void main(String[] args) {
        // insert data, simulating a database
        Data.insertStudentData();
        Screen.clear();
        new MenuManager(new PrincipalMenu()).execute();
    }
}