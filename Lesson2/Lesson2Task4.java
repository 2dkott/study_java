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
        int firstNumber = scanner.nextInt();
        logger.info("Введено первое число:" + firstNumber);
        String sign = scanner.next();
        logger.info("Введен знак:" + sign);
        int secondNumber = scanner.nextInt();
        logger.info("Введено второе число:" + firstNumber);
        scanner.close();
        int result = 0;
        if(sign.contains("+")) result = sum(firstNumber,secondNumber);
        if(sign.contains("-")) result = subtraction(firstNumber,secondNumber);
        if(sign.contains("*")) result = multiply(firstNumber,secondNumber);
        if(sign.contains("/")) result = divide(firstNumber,secondNumber);

        logger.info(String.format("%s%s%s=%s", firstNumber, sign, secondNumber, result));

    }

    static int sum(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }

    static int subtraction(int firstNumber, int secondNumber){
        return firstNumber - secondNumber;
    }

    static int multiply(int firstNumber, int secondNumber){
        return firstNumber * secondNumber;
    }

    static int divide(int firstNumber, int secondNumber){
        return firstNumber / secondNumber;
    }
}
