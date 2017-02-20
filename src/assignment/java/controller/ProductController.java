/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.java.controller;

import assignment.java.entity.Product;
import assignment.java.model.ProductModel;
import assignment.java.utility.ScannerUtil;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author daolinh
 */
public class ProductController {

    public static void processInsert() {
        System.out.println("Nhap ID :");
        int id = ScannerUtil.getInt();
        System.out.println("Nhap ten :");
        String ten = ScannerUtil.getString();
        System.out.println("Nhap so luong :");
        int soLuong = ScannerUtil.getInt();

        Product product = new Product();
        product.setId(id);
        product.setName(ten);
        product.setQuantity(soLuong);

        ProductModel.insert(product);
    }

    public static void getList() {
        try {
            ResultSet rs = ProductModel.list();
            while (rs.next()) {
                String id = rs.getString("id");
                String name = rs.getString("name");
                String quantity = rs.getString("quantity");
                System.out.println("ID : " + id);
                System.out.println("Ten : " + name);
                System.out.println("So luong : " + quantity);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
