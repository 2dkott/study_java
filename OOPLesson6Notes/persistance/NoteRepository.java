package persistance;

import model.*;

import java.util.List;

public interface NoteRepository {

    List<Note> getAllNotes();

    Note createNote(NoteData noteData);
    void updateNote(Note updatedNote);
    void deleteNode(Note deleteNote);
    Note getNoteById(NoteIdentifier noteIdentifier);
}
