package persistance;

import model.Identifier;
import model.Report;
import model.UserNames;
import model.UserObject;

public class ReportMapper {

    public static Report map(String reportString, String divider){
        String[] record = reportString.split(divider);
        return Report.of(new Identifier(record[0]), new Identifier(record[1]), record[2]);
    }

    public static String map(Report report){
        return String.format("%s,%s,%s", report.getReportId(),report.getUserId(),report.getText());
    }
}
