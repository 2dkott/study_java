package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class NoteDate {

    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    private LocalDate date;

    public NoteDate(){
        this(LocalDate.now());
    }

    private NoteDate(LocalDate date){
        this.date = date;
    }

    public static NoteDate of(String stringDate, DateTimeFormatter formatter){
        return new NoteDate(LocalDate.parse(stringDate, formatter));
    }

    public static NoteDate of(String stringDate){
        return new NoteDate(LocalDate.parse(stringDate, formatter));
    }

    @Override
    public String toString(){
        return date.format(formatter);
    }
}
