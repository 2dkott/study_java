package model;

public class NoteDoesntExistException extends RuntimeException {
    public NoteDoesntExistException(String userNames) {
        super(String.format("Заметка(Id:%s) нe существует!", userNames));
    }
}
