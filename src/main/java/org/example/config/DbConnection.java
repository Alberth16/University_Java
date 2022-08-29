package org.example.config;
import java.sql.Connection;
import java.sql.DriverManager;
public class DbConnection {
   public void Connection(){
       String MySQLURL = "jdbc:mysql://us-cdbr-east-06.cleardb.net:3306/heroku_2ab14feaafd632f";
       String databseUserName = "bda277cda2e5bb";
       String databasePassword = "285c4a40";

       Connection con = null;
       try {
           con = DriverManager.getConnection(MySQLURL, databseUserName, databasePassword);
           if (con != null) {
               System.out.println("Database connection is successful !!!!");
           }
       } catch (Exception e) {
           e.printStackTrace();
       }
   }
}
