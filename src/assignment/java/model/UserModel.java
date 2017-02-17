/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.java.model;

import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author daolinh
 */
public class UserModel {

    public static void insert(User user) {
        try {
            Statement statement = DAO.getConnection().createStatement();
            statement.execute("Insert into users values('" + user.getId() + "', '" + user.getName() + "')");
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Lỗi khi insert.");
        }
    }

    public void list() {

    }

    public void update() {
    }

    public void delete() {
    }

}
