import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Lesson2Task2 {

    static Logger logger = Logger.getLogger(Lesson2Task2.class.getName());

    public static void main(String[] args) throws IOException {
        Path lotPath = Path.of("Lesson2", "task2.log");
        FileHandler fileHandler = new FileHandler(lotPath.toString(), true);
        fileHandler.setFormatter(new SimpleFormatter());
        logger.addHandler(fileHandler);

        Path jsonPath = Path.of("Lesson2", "student_data.json");
        Gson gson = new Gson();
        JsonReader jsonReader = new JsonReader(new FileReader(jsonPath.toString()));
        HashMap<String, String>[] parsedData = gson.fromJson(jsonReader, HashMap[].class);
        for(int i = 0; i<parsedData.length; i++){
            logger.info(String.format("Студент %s получил %s по предмету %s.", parsedData[i].get("фамилия"), parsedData[i].get("оценка"), parsedData[i].get("предмет")));
        }
    }
}
