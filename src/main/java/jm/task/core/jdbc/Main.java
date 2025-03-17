package jm.task.core.jdbc;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Oleg", "Olegov", (byte) 30);
        userService.saveUser("Alex", "Petrov", (byte) 25);
        userService.saveUser("Nikita", "Sergeev", (byte) 35);
        userService.saveUser("Vladimir", "Ivanov", (byte) 28);

        userService.getAllUsers().forEach(System.out::println);

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}