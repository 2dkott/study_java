package views;

import controllers.NoteController;
import model.Note;

import java.util.Scanner;

public class NoteView {
    private final NoteController controller;

    public NoteView(NoteController controller){
        this.controller = controller;
    }

    public void start(){
        System.out.println("Добро пожаловать в программу Заметки.");

        while(true){

            NoteActionTypes action = NoteActionTypes.valueOf(prompt("""
                    Доступны комнады:\s
                    CRETE: Создать заметку
                    UPDATE: Обновить заметку по ее Id
                    GET: Посмотреть заметку по ее Id
                    DELETE: Удалить заметку
                    EXIT: Выход\n"""));

            switch (action){
                case CREATE:
                    try{
                    String title = prompt("Введите заголовок Вашей заметки: ");
                    String text = prompt("Введите текст Вашей заметки: ");
                    String note = controller.createNote(title,text);
                    printResult(String.format("Заметка создана!\n%s\n", note));
                    } catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case UPDATE:
                    try{
                        String noteId = prompt("Введите id Вашей заметки: ");
                        String updatedTitle = prompt("Введите заголовок Вашей заметки: ");
                        String updatedText = prompt("Введите текст Вашей заметки: ");
                        controller.updateNote(noteId, updatedTitle, updatedText);
                        printResult(String.format("Заметка(Id:%s) обнавлена!\n",noteId));
                    } catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case GET:
                    try{
                        String noteId = prompt("Введите id Вашей заметки: ");
                        printResult(controller.getNoteById(noteId) + "\n");
                    } catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case GETALL:
                    try{
                        printResult(controller.getAllNotes());
                    } catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case DELETE:
                    try{
                        String noteId = prompt("Введите id Вашей заметки: ");
                        controller.deleteNoteById(noteId);
                        printResult(String.format("Заметка(Id:%s) удалена!\n",noteId));
                    } catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case EXIT:
                    return;
            }
        }
    }

    private void printResult(String message){
        System.out.println(message);
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

}
