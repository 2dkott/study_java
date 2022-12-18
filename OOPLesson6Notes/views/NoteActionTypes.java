package views;

public enum NoteActionTypes {
    CREATE("CREATE"),
    GET("GET"),
    GETALL("GETALL"),
    DELETE("DELETE"),
    UPDATE("UPDATE"),
    EXIT("EXIT");

    private final String text;

    NoteActionTypes(final String textValue) { text = textValue; }
    public String toString() { return text; }
}
