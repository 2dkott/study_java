import java.io.IOException;
import java.util.Arrays;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Lesson2Task1 {

    static Logger logger = Logger.getLogger(Lesson2Task1.class.getName());

    public static void main(String[] args) throws IOException {
        FileHandler fileHandler = new FileHandler("task1.log", true);
        fileHandler.setFormatter(new SimpleFormatter());
        logger.addHandler(fileHandler);

        int[] inputArray = new int[]{3,1,2,8,3,0,4,1};
        sortArray(inputArray);
    }

    static void sortArray(int[] inputArray){
        logger.info(String.format("Unsorted array: %s", Arrays.toString(inputArray)));
        logger.info("Starting sort array");
        int index = inputArray.length-1;
        while(index>0) {
            for (int i = 0; i < index; i++) {
                if (inputArray[i] > inputArray[i + 1]) {
                    logger.info(String.format("Shifting element %s(index:%s) with element %s(index:%s)", inputArray[i], i, inputArray[i + 1], i+1));
                    int tempValue = inputArray[i];
                    inputArray[i] = inputArray[i + 1];
                    inputArray[i + 1] = tempValue;
                }
            }
            index--;
        }
        logger.info("Sorting is end");
        logger.info(String.format("Sorted array: %s", Arrays.toString(inputArray)));
    }
}
