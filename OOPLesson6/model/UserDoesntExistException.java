package model;

public class UserDoesntExistException extends RuntimeException {
    public UserDoesntExistException(String userNames) {
        super(String.format("Пользователя '%s' ну существует!", userNames));
    }
}
