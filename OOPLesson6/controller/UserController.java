package controller;

import model.Report;
import model.UserNames;
import model.UserObject;
import persistance.*;

import java.util.List;

public class UserController {

    UserRepository userRepository;
    ReportRepository reportRepository;

    public UserController(UserRepository userRepository, ReportRepository reportRepository) {
        this.userRepository = userRepository;
        this.reportRepository = reportRepository;
    }

    public UserObject createUser(UserNames userNames){
        return userRepository.createUser(userNames);
    }

    public Report addReportForUser(UserObject userObject, String reportText){
        return reportRepository.createReport(userObject.getIdentifier(), reportText);
    }

    public UserObject findUserByName(UserNames userNames){
        return userRepository.getUserByName(userNames);
    }

    public List<Report> getUserReports(UserObject userObject) {
        return reportRepository.getAllReportsByUserId(userObject.getIdentifier());
    }
}
