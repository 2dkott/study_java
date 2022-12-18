package controllers;

import model.*;
import persistance.NoteRepository;

public class NoteController {

    NoteRepository noteRepository;

    public NoteController(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    public String createNote(String title, String text){
        return noteRepository.createNote(new NoteData(title, text)).toString();
    }

    public String getNoteById(String id){
        return noteRepository.getNoteById(NoteIdentifier.of(id)).toString();
    }

    public String getAllNotes(){
        return noteRepository.getAllNotes().toString()
                .replace("[", "")
                .replace("]", "")
                .replace(", ","");
    }

    public void updateNote(String id, String title, String text){
        Note updatedNote = Note.of(NoteIdentifier.of(id),new NoteData(title, text), new NoteDate(), ActiveType.Y);
        noteRepository.updateNote(updatedNote);
    }

    public void deleteNoteById(String id){
        Note deleteNote = noteRepository.getNoteById(NoteIdentifier.of(id));
        noteRepository.deleteNode(deleteNote);
    }
}
