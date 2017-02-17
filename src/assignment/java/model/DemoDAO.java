/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.java.model;

/**
 *
 * @author daolinh
 */
public class DemoDAO {
    public static void main(String[] args) {        
        System.out.println("---------Demo DAO & MVC----------");
        User user = new User();
        user.setId("6");
        user.setName("Cong");
        UserModel.insert(user);
        System.out.println("--------DONE-----------");
    }
}
