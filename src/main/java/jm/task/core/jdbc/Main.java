package jm.task.core.jdbc;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Oleg", "Olegov", (byte) 30);
        System.out.println("User с именем — Oleg добавлен в базу данных");
        userService.saveUser("Alex", "Petrov", (byte) 25);
        System.out.println("User с именем — Alex добавлен в базу данных");
        userService.saveUser("Nikita", "Sergeev", (byte) 35);
        System.out.println("User с именем — Nikita добавлен в базу данных");
        userService.saveUser("Vladimir", "Ivanov", (byte) 28);
        System.out.println("User с именем — Vladimir добавлен в базу данных");

        userService.getAllUsers().forEach(System.out::println);

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}