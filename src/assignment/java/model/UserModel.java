/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.java.model;

import java.sql.Statement;

/**
 *
 * @author daolinh
 */
public class UserModel {
    
    public static void insert(){
        try {                      
            Statement statement = DAO.getConnection().createStatement();
            String sqlString = "Insert into users values(1, 'Xuan Hung')";
            statement.execute(sqlString);
        } catch (Exception e) {            
            System.err.println("Lỗi khi insert.");
        }        
    }
    
    public  void update(){
    }
    
    public  void delete(){
    }
    
    public  void getList(){
    }
}
