package org.example;

import org.example.model.User;
import org.example.service.UserService;

import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        /**
         * command || control + { -> возвращает назад
         command || contor + ЛКМ(левая кнопка мыши) -> открывает реализацию класса или метода
         */
        UserService userService = new UserService();

        userService.createTable();
//        userService.saveUser(new User("Aida", "Zheenbaeva"));


        userService.updateById(11, new User("Aida", "Baatyrbekovna"));
        userService.deleteById(2);
        userService.updateById(2, new User("dlf", "dfs"));


    }
}
