package views;

import controllers.ViewController;
import model.Calculator;

import java.util.Scanner;

public class ViewCalculator {

    private ViewController viewController;
    public ViewCalculator(ViewController viewController){
        this.viewController = viewController;
    }

    public void start(){
        System.out.println("Добро пожаловать в программу Калькулятор.");

        while(true){

            NumberTypes numberSelection = NumberTypes.valueOf(prompt("Для работы с комплексными числами введите COMP, c Рациональными RATI или EXIT для выхода\n>:"));

            switch (numberSelection){
                case COMP:

                    try{
                        String numberA = prompt("Введите первое комплексное число в формате n+/-mi :");
                        String numberB = prompt("Введите второе комплексное число в формате n+/-mi :");
                        ActionTypes actionType = getAction(prompt("Введите действие:"));
                        printResult(viewController.getComplexCalculator(numberA,numberB).calculate(actionType).toString());
                    } catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case RATI:
                    try{
                        String numberA = prompt("Введите первое рациональное число в формате n/m :");
                        String numberB = prompt("Введите второе комплексное число в формате n/m :");
                        ActionTypes actionType = getAction(prompt("Введите действие:"));
                        printResult(viewController.getRationalCalculator(numberA,numberB).calculate(actionType).toString());
                    } catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case EXIT:
                    return;
            }
        }
    }

    private ActionTypes getAction(String action){
        if(action.equals("+")) return ActionTypes.ADD;
        if(action.equals("-")) return ActionTypes.SUBTRACT;
        throw new RuntimeException("Вы ввели не верное выржение");
    }

    private void printResult(String result){
        System.out.println(String.format("Результат выражения: %s", result));
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
