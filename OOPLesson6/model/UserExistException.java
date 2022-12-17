package model;

public class UserExistException extends RuntimeException {
    public UserExistException(String userNames) {
        super(String.format("Пользователь '%s' уже существует!", userNames));
    }
}
