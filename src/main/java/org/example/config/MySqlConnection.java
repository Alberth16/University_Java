package org.example.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySqlConnection implements IDBConnection {
   public Connection connect(){
       String mySqlUrl = "jdbc:mysql://us-cdbr-east-06.cleardb.net:3306/heroku_2ab14feaafd632f";
       String databaseUserName = "bda277cda2e5bb";
       String databasePassword = "285c4a40";

       Connection con = null;
       try {
           con = DriverManager.getConnection(mySqlUrl, databaseUserName, databasePassword);
       } catch (Exception e) {
           System.out.println(e.getMessage());
       }

       return con;
   }
}
