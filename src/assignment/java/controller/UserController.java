/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.java.controller;

import assignment.java.model.User;
import assignment.java.model.UserModel;
import assignment.java.utility.ScannerUtil;

/**
 *
 * @author daolinh
 */
public class UserController {

    public static void processInsert() {
        System.out.println("Thực hiện thêm mới sinh viên.");
        System.out.println("Nhập tên sinh viên.");
        String name = ScannerUtil.getString();
        System.out.println("Nhập id sinh viên.");
        String id = ScannerUtil.getString();
        User user = new User();
        user.setId(id);
        user.setName(name);
        UserModel.insert(user);
    }
}
