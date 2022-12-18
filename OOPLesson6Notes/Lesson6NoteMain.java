import controller.UserController;
import controllers.NoteController;
import model.Report;
import model.UserNames;
import model.UserObject;
import persistance.*;
import views.NoteView;

import java.util.List;

public class Lesson6NoteMain {

	public static void main(String[] args){
		NoteRepository noteRepository = new NoteRepositoryFile(new NoteFileOperationImpl("noteFile.txt"));
		NoteView view = new NoteView(new NoteController(noteRepository));
		view.start();

	}
}