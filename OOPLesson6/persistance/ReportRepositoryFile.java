package persistance;

import model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ReportRepositoryFile implements ReportRepository {
    private FileOperation fileOperation;

    private final String DIVIDER = ",";

    public ReportRepositoryFile(FileOperation fileOperation) {
        this.fileOperation = fileOperation;
    }

    @Override
    public List<Report> getAllReportsByUserId(Identifier userIdentifier) {
        List<String> lines = fileOperation.readAllLines();
        List<Report> reports = new ArrayList<>();
        for (String line : lines) {
            reports.add(ReportMapper.map(line,DIVIDER));
        }
        return reports.stream().filter(report -> report.getUserId().equals(userIdentifier)).toList();
    }

    @Override
    public Report createReport(Identifier userIdentifier, String reportText) {
        List<Report> reports = getAllReportsByUserId(userIdentifier);
        if(reports.stream().filter(resultReport->resultReport.getText().equals(reportText)).toList().isEmpty()){
            Report report = new Report(userIdentifier, reportText);
            fileOperation.addLine(ReportMapper.map(report));
            return report;
        }
        throw new ReportExistException();
    }
}
