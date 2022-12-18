package persistance;

import java.util.List;

public interface NoteFileOperation {
    List<String> readAllLines();

    void addLine(String line);

    void saveAllLines(List<String> lines);
}
