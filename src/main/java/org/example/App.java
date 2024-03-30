package org.example;

import org.example.model.User;
import org.example.service.UserService;

import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        UserService userService = new UserService();

        userService.createTable();
//        userService.saveUser(new User("Aida", "Zheenbaeva"));

        userService.updateById(11, new User("Aida", "Baatyrbekovna"));


    }
}
