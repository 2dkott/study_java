import controller.UserController;
import model.Report;
import model.UserNames;
import model.UserObject;
import persistance.*;

import java.util.List;

public class Lesson6Main {

	public static void main(String[] args){

		UserRepository userRepository = new UserRepositoryFile(new FileOperationImpl("userFile.txt"));
		ReportRepository reportRepository = new ReportRepositoryFile(new FileOperationImpl("reportFile.txt"));

		UserController userController = new UserController(userRepository, reportRepository);
		userController.createUser(new UserNames("Вася", "Иванов"));
		userController.createUser(new UserNames("Петя", "Сидоров"));

		UserObject userA = userController.findUserByName(new UserNames("Вася", "Иванов"));
		userController.addReportForUser(userA, "Text 1");
		userController.addReportForUser(userA, "Text 2");

		UserObject userB = userController.findUserByName(new UserNames("Петя", "Сидоров"));
		userController.addReportForUser(userB, "Text 1B");

		System.out.println(userA);

		List<Report> reports = userController.getUserReports(userA);
		System.out.println(reports);
	}
}