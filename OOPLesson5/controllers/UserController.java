package controllers;

import model.Repository;
import model.User;

import java.util.List;
import java.util.Optional;

public class UserController {
    private final Repository repository;

    public UserController(Repository repository) {
        this.repository = repository;
    }

    public void saveUser(User user) throws Exception  {
        List<User> users = repository.getAllUsers();
        if (!users.contains(user)) repository.CreateUser(user);
        else throw new Exception(String.format("Пользователь '%s' уже существует", user));
    }

    public void deleteUser(String userId){
        List<User> users = repository.getAllUsers();
        Optional<List<User>> userToDelete = Optional.of(users.stream().filter(user -> user.getId().equals(userId)).toList());
        userToDelete.ifPresentOrElse(repository::deleteUsers,
                ()-> {throw new RuntimeException(String.format("Пользователь c id:%s не найден", userId));});
    }

    public User readUser(String userId) throws Exception {
        List<User> users = repository.getAllUsers();
        for (User user : users) {
            if (user.getId().equals(userId)) {
                return user;
            }
        }
        throw new Exception(String.format("Пользователь c id:%s не найден", userId));
    }
}
