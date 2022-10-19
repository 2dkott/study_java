import java.util.Scanner;

public class Task4 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int firstNumber = Integer.parseInt(scanner.next().replace("?", ""));
        System.out.println("Введите второе число");
        int secondNumber = Integer.parseInt(scanner.next().replace("?", ""));
        System.out.println("Введите результат");
        int result = scanner.nextInt();
        scanner.close();

        for(int i = 0; i<10; i++){
            for(int j = 0; j<100; j=j+10){
                int modifiedFirstNumber = firstNumber*10+i;
                int modifiedSecondNumber = j+secondNumber;
                if(modifiedFirstNumber+modifiedSecondNumber == result){
                    System.out.printf("%s+%s=%s\n", modifiedFirstNumber, modifiedSecondNumber, result);
                }
            }
        }
        System.out.println("Нет вариантов решения");
    }
}
