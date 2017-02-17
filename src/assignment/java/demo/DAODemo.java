/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.java.demo;

import assignment.java.model.DAO;
import com.sun.org.apache.xerces.internal.impl.xs.SchemaGrammar;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author daolinh
 */
public class DAODemo {
    private static final String CONECTION_URL_PREFIX = "jdbc:mysql://" ;
    private static final String HOST = "localhost:3306/";
    private static final String DATABASE = "aptechfpt" ;
    private static final String USERNAME = "root" ;
    private static final String PASSWORD = "" ;

    public static String getCONECTION_URL_PREFIX() {
        return CONECTION_URL_PREFIX;
    }

    public static String getHOST() {
        return HOST;
    }

    public static String getDATABASE() {
        return DATABASE;
    }

    public static String getUSERNAME() {
        return USERNAME;
    }

    public static String getPASSWORD() {
        return PASSWORD;
    }
    
    public static Connection getConnection(){
        Connection conn = null;
        try {
            conn =
               DriverManager.getConnection(CONECTION_URL_PREFIX +  HOST +
                                           USERNAME + PASSWORD);            
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        return conn;
       
    }
    public static void main(String[] args) throws SQLException {
        getList();
    }
    
    public static void insert() throws SQLException{
        String sql;
        String id = "2";
        String name = "Ho Dong";
        sql = "INSERT INTO users (id,name) VALUES ('"+id+"','"+name+"');";
        Connection conn = DAO.getConnection();
        
        Statement statement = conn.createStatement();
        statement.execute(sql);
        System.out.println("Inserted successfully!");
    }
    
    public static void getList() throws SQLException{
        Connection conn = DAO.getConnection();
        Statement statement = conn.createStatement();
        String sql;
        sql = "SELECT * FROM users;";
        ResultSet result = statement.executeQuery(sql);
        
        while(result.next()){
            String id = result.getString("id");
            String name = result.getString("name");
            System.out.println("id : " + id + "; name : " + name );
        }
        
    }
}
