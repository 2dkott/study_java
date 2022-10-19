import java.util.Scanner;

public class Task3 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int firstNumber = scanner.nextInt();
        System.out.println("Введите выражение");
        String sign = scanner.next();
        System.out.println("Введите второе число");
        int secondNumber = scanner.nextInt();
        scanner.close();
        int result = 0;
        if(sign.contains("+")) result = sum(firstNumber,secondNumber);
        if(sign.contains("-")) result = subtraction(firstNumber,secondNumber);
        if(sign.contains("*")) result = multiply(firstNumber,secondNumber);
        if(sign.contains("/")) result = divide(firstNumber,secondNumber);

        System.out.printf("%s%s%s=%s", firstNumber, sign, secondNumber, result);

    }

    static int sum(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }

    static int subtraction(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }

    static int multiply(int firstNumber, int secondNumber){
        return firstNumber * secondNumber;
    }

    static int divide(int firstNumber, int secondNumber){
        return firstNumber / secondNumber;
    }
}
