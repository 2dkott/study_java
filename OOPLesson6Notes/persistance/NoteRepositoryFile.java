package persistance;

import model.*;

import java.util.*;
import java.util.stream.IntStream;

public class NoteRepositoryFile implements NoteRepository {
    private NoteFileOperation fileOperation;

    private final String DIVIDER = ",";

    public NoteRepositoryFile(NoteFileOperation fileOperation) {
        this.fileOperation = fileOperation;
    }

    @Override
    public List<Note> getAllNotes() {
        List<String> lines = fileOperation.readAllLines();
        List<Note> notes = new ArrayList<>();
        for (String line : lines) {
            notes.add(NoteMapper.map(line,DIVIDER));
        }
        return notes.stream().filter(note -> note.isActive().equals(ActiveType.Y)).toList();
    }

    @Override
    public Note createNote(NoteData noteData) {
        Note note = new Note(noteData);
        fileOperation.addLine(NoteMapper.map(note,DIVIDER));
        return note;
    }

    @Override
    public void updateNote(Note updatedNote) {
        List<Note> notes = new ArrayList<>(getAllNotes());
        notes.removeIf(note -> note.getId().equals(updatedNote.getId()));
        notes.add(updatedNote);
        List<String> lines = notes.stream().map(note -> NoteMapper.map(note, DIVIDER)).toList();
        fileOperation.saveAllLines(lines);
    }

    @Override
    public void deleteNode(Note deleteNote) {
        updateNote(Note.of(deleteNote.getId(), deleteNote.getData(), deleteNote.getDate(), ActiveType.N));
    }

    @Override
    public Note getNoteById(NoteIdentifier noteIdentifier) {
        List<Note> notes = getAllNotes();
        return findNoteById(notes, noteIdentifier);
    }

    private Note findNoteById( List<Note> notes, NoteIdentifier noteIdentifier) {
        Optional<Note> resultNote = notes.stream()
                .filter(note -> note.isActive().equals(ActiveType.Y))
                .filter(note -> note.getId().equals(noteIdentifier)).findFirst();
        return resultNote.orElseThrow(()->new NoteDoesntExistException(noteIdentifier.toString()));
    }
}
