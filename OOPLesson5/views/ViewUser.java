package views;

import controllers.UserController;
import model.User;

import java.util.Scanner;

public class ViewUser {

    private UserController userController;

    public ViewUser(UserController userController) {
        this.userController = userController;
    }

    public void run(){
        Commands com = Commands.NONE;

        while (true) {
            String command = prompt("Введите команду: ");
            try {
                com = Commands.valueOf(command);
            } catch (IllegalArgumentException exception){
                System.out.println(String.format("Команда '%s' не распознана, введите команду еще:", command));
            }
            if (com == Commands.EXIT) return;
            switch (com) {
                case CREATE:
                    String firstName = prompt("Имя: ");
                    String lastName = prompt("Фамилия: ");
                    String phone = prompt("Номер телефона: ");
                    try {
                        userController.saveUser(new User(firstName, lastName, phone));
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case READ:
                    String searchId = prompt("Идентификатор пользователя: ");
                    try {
                        User user = userController.readUser(searchId);
                        System.out.println(user);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case DELETE:
                    String deleteId = prompt("Идентификатор пользователя: ");
                    try {
                        userController.deleteUser(deleteId);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
            }
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
