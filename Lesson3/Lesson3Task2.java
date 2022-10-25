import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lesson3Task2 {

    public static void main(String[] args) {
        List<Integer> list = generateList();
        System.out.printf("Список сгенерирован: %s \n", list);
        List<Integer> resultList = removeEvenNumbers(list);
        System.out.printf("Список после удаления четных чисел: %s \n", resultList);
    }

    static List<Integer> generateList(){
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i< 20; i++){
            list.add(random.nextInt(100));
        }
        return list;
    }

    static List<Integer> removeEvenNumbers(List<Integer> list){
        return list.stream().filter(number -> number%2 != 0).toList();
    }

}
