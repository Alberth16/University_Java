package org.example;
import org.example.config.IDBConnection;
import org.example.config.MySqlConnection;

public class Main {
    public static void main(String[] args) {
        IDBConnection con = new MySqlConnection();
        con.connect();
    }
}