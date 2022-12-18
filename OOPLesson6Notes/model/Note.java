package model;

import java.util.Objects;

public class Note {

    private final NoteIdentifier id;
    private final NoteData data;
    private final NoteDate date;
    private final ActiveType isActive;

    public Note(NoteData data) {
        this(new NoteIdentifier(), data, new NoteDate(), ActiveType.Y);
    }

    private Note(NoteIdentifier id, NoteData data, NoteDate date, ActiveType isActive){
        this.id = id;
        this.data = data;
        this.date = date;
        this.isActive = isActive;
    }

    public static Note of(NoteIdentifier id, NoteData data, NoteDate date, ActiveType isActive){
        return new Note(id, data, date, isActive);
    }

    public NoteIdentifier getId() {
        return id;
    }

    public NoteData getData() {
        return data;
    }

    public NoteDate getDate() {
        return date;
    }

    public ActiveType isActive() {
        return isActive;
    }

    @Override
    public int hashCode(){
        return Objects.hash(id,data.getText(),data.getTitle(),date.toString());
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof Note){
            return o.hashCode()==this.hashCode();
        }
        return false;
    }

    @Override
    public String toString(){
        return String.format("Заметка:" +
                "\nId: %s" +
                "\nЗаголовок: %s" +
                "\nТекст: %s" +
                "\nДата: %s\n", id, data.getTitle(), data.getText(), date);
    }

}
