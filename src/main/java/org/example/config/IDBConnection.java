package org.example.config;
import java.sql.Connection;

/**
 * Use for more than one connection Class
 * In this case it just used for MySql connection
 */
public interface IDBConnection {
     Connection connect();
}
