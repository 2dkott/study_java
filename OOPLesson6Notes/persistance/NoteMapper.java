package persistance;

import model.*;

public class NoteMapper {

    public static Note map(String noteString, String divider){
        String[] record = noteString.split(divider);
        return Note.of(NoteIdentifier.of(record[0]),
                new NoteData(record[1], record[2]),
                NoteDate.of(record[3]),
                ActiveType.valueOf(record[4]));
    }

    public static String map(Note note, String divider){
        return String.format("%s,%s,%s,%s,%s",
                note.getId(),
                note.getData().getTitle(),
                note.getData().getText(),
                note.getDate().toString(),
                note.isActive().toString()).replace(",", divider);
    }
}
