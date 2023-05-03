
package server.models;

import server.App;

import java.io.File;
import java.net.URL;
import java.sql.*;

public class DatabaseAccess {
    private Connection connection;
    public DatabaseAccess(){
        try {
            Class.forName("org.sqlite.JDBC");
            DriverManager.registerDriver(new org.sqlite.JDBC());
            connection = DriverManager.getConnection("jdbc:sqlite::resource:server.db");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void close(){
        try {
            connection.close();
        } catch (SQLException e) {
            System.out.println("Failed to close the connection");
        }
    }
    public Connection getConnection(){
        return connection;
    }
}
