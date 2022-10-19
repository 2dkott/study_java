import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Lesson2Task4 {
    static Logger logger = Logger.getLogger(Lesson2Task2.class.getName());

    public static void main(String[] args) throws IOException {
        Path lotPath = Path.of("Lesson2", "task4.log");
        FileHandler fileHandler = new FileHandler(lotPath.toString(), true);
        fileHandler.setFormatter(new SimpleFormatter());
        logger.addHandler(fileHandler);

        Scanner scanner = new Scanner(System.in);
        logger.info("Введите первое число");
        int firstNumber = Integer.parseInt(scanner.next().replace("?", ""));
        logger.info("Введите второе число");
        int secondNumber = Integer.parseInt(scanner.next().replace("?", ""));
        logger.info("Введите результат");
        int result = scanner.nextInt();
        scanner.close();

        for(int i = 0; i<10; i++){
            for(int j = 0; j<100; j=j+10){
                int modifiedFirstNumber = firstNumber*10+i;
                int modifiedSecondNumber = j+secondNumber;
                if(modifiedFirstNumber+modifiedSecondNumber == result){
                    logger.info(String.format("%s+%s=%s\n", modifiedFirstNumber, modifiedSecondNumber, result));
                }
            }
        }
        logger.info("Нет вариантов решения");
    }
}
