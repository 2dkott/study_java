package persistance;

import java.io.IOException;
import java.util.List;

public interface FileOperation {
    List<String> readAllLines();

    void addLine(String line);
}
