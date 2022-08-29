package org.example;
import org.example.config.DbConnection;
import org.example.view.Menu;
public class Main {
    public static void main(String[] args) {
//        Menu menu = new Menu();
        DbConnection con = new DbConnection();
        con.Connection();
//        menu.menu();
    }
}