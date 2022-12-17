package model;

public class ReportExistException extends RuntimeException {
    public ReportExistException() {
        super("Такой отчет уже существует!");
    }
}
