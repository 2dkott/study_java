import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Lesson2Task3 {

    static Logger logger = Logger.getLogger(Lesson2Task3.class.getName());

    public static void main(String[] args) throws IOException {
        Path lotPath = Path.of("Lesson2", "task3.log");
        FileHandler fileHandler = new FileHandler(lotPath.toString(), true);
        fileHandler.setFormatter(new SimpleFormatter());
        logger.addHandler(fileHandler);

        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();
        scanner.close();
        if(inputString.equals(new StringBuilder(inputString).reverse().toString())){
            logger.info(String.format("Строка %s полиндром!", inputString));
        } else logger.info(String.format("Строка %s не йполиндром!", inputString));
    }
}
