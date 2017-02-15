/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.java.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author daolinh
 */
public class DAO {
    
    private static final String CONNECTION_STRING_PREFIX = "jdbc:mysql:";
    private static final String DATABASE = "aptechfpt";
    private static final String DATABASE_USER = "?user=root";
    private static final String DATABASE_PASSWORD = "";
    private static final String HOST_WITH_PORT = "//localhost:3306/";  
    
    public static Connection getConnection() throws SQLException{
        String connectionString = CONNECTION_STRING_PREFIX + HOST_WITH_PORT + DATABASE + DATABASE_USER + DATABASE_PASSWORD;
        System.out.println(connectionString);
        Connection conn = DriverManager.getConnection(connectionString);      
        return conn;
    }
}
