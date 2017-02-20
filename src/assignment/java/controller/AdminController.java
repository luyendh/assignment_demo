/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.java.controller;

import assignment.java.entity.Admin;
import assignment.java.model.AdminModel;
import assignment.java.utility.ScannerUtil;

/**
 *
 * @author daolinh
 */
public class AdminController {
     public static void processInsert() {
        System.out.println("Thực hiện thêm mới admin.");
        System.out.println("Nhập account admin.");
        String account = ScannerUtil.getString();  
        System.out.println("Nhập password cho admin.");
        String password = ScannerUtil.getString();
        Admin admin = new Admin();
        admin.setId(1);
        admin.setAccount(account);
        admin.setPassword(password);
        admin.setStatus(1);
        AdminModel.insert(admin);
    }
}
