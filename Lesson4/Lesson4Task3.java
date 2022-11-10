import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.Stack;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Lesson4Task3 {


    public static void main(String[] args) throws IOException {
        Calculator calculator = new Calculator();
        calculator.listenInput();
    }
}

class Calculator{

    private final Stack<String> stack = new Stack<>();
    private final Scanner scanner;

    public Calculator(){
        scanner = new Scanner(System.in);
    }

    public void listenInput(){

        try {
            if (stack.isEmpty()) {
                System.out.println("Введите первое число:");
                stack.push(scanner.next());
            }

            System.out.println("Введите знак:");
            stack.push(scanner.next());

            System.out.println("Введите второе число:");
            stack.push(scanner.next());

            System.out.println("Посчитать > ; Отменить < ; Выйти !");
            String inputDecision = scanner.next();

            doCalculate(inputDecision);

            listenInput();
        } catch (IllegalStateException e){
            return;
        }
    }

    private void doCalculate(String inputString){
        if(inputString.contains(">")) {
            calculate(stack);
            System.out.println(stack.peek());
        } else if (inputString.contains("<")) {
            stack.pop();
            stack.pop();
        } else if (inputString.contains("!")) {
            scanner.close();
        }
    }

    private void calculate(Stack<String> stack){

        int  secondNumber = Integer.parseInt(stack.peek());
        stack.pop();

        String  mathSing = stack.peek();
        stack.pop();

        int  firstNumber = Integer.parseInt(stack.peek());
        stack.pop();

        if(mathSing.contains("+")) {
            stack.push(sum(firstNumber,secondNumber));
        }
        else if(mathSing.contains("-")) {
            stack.push(subtraction(firstNumber,secondNumber));
        }
        else if(mathSing.contains("*")) {
            stack.push(multiply(firstNumber,secondNumber));
        }
        else if(mathSing.contains("/")) {
            stack.push(divide(firstNumber,secondNumber));
        }
    }

    static String sum(int firstNumber, int secondNumber){
        return String.valueOf(firstNumber + secondNumber);
    }

    static String subtraction(int firstNumber, int secondNumber){
        return String.valueOf(firstNumber - secondNumber);
    }

    static String multiply(int firstNumber, int secondNumber){
        return String.valueOf(firstNumber * secondNumber);
    }

    static String divide(int firstNumber, int secondNumber){
        return String.valueOf(firstNumber / secondNumber);
    }

}
