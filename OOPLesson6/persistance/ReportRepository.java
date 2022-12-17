package persistance;

import model.Identifier;
import model.Report;
import model.UserNames;
import model.UserObject;

import java.util.List;

public interface ReportRepository {
    List<Report> getAllReportsByUserId(Identifier userIdentifier);
    Report createReport(Identifier userIdentifier, String reportText);
}
