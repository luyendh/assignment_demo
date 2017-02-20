package assignment.java.model;


import assignment.java.entity.Product;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daolinh
 */
public class ProductModel {
    
    public static ResultSet list(){
        String sql = "SELECT * FROM products ";
        try {
            Statement stt = DAO.getConnection().createStatement();
            return stt.executeQuery(sql);
             
        } catch (Exception e) {
            System.err.println("Khong the hien thi !!!");
        }
        return null;
    }
    
    
    public static void insert(Product product){        
        try{
        Statement stt = DAO.getConnection().createStatement();
        stt.execute("Insert into products(id,name,quantity) values ('"+product.getId()+"','"
                                                +product.getName()+"','"
                                                +product.getQuantity()+"')");
        }catch (Exception e){
            e.printStackTrace();
            System.out.print("Insert khong thanh cong");
        } 
       
    }
}
