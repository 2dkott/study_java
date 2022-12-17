package model;

public class Report{

    private final Identifier userId;
    private final Identifier reportId;
    private final String text;

    public Report(Identifier userId, String text){
        this(new Identifier(), userId, text);
    }

    private Report(Identifier reportId, Identifier userId, String text) {
        this.userId = userId;
        this.reportId = reportId;
        this.text = text;
    }

    public static Report of(Identifier reportId, Identifier userId, String text){
        return new Report(reportId, userId, text);
    }

    public Identifier getUserId() {
        return userId;
    }

    public String getText() {
        return text;
    }

    public Identifier getReportId() {
        return reportId;
    }

    @Override
    public String toString(){
        return String.format("Репорт(user id:%s):%s", userId.toString(), text);
    }
}
