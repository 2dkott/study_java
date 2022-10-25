import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Lesson3Task3 {

    public static void main(String[] args) {
        List<Integer> list = generateList();
        System.out.printf("Список сгенерирован: %s \n", list);

        int min = list.stream().mapToInt(v -> v).min().orElseThrow();
        System.out.printf("Минимальное значение: %s \n", min);

        int max = list.stream().mapToInt(v -> v).max().orElseThrow();
        System.out.printf("Максимальное значение: %s \n", max);

        int everage = list.stream().mapToInt(v -> v).sum()/list.size();
        System.out.printf("Среднее арифметическое: %s \n", everage);
    }

    static List<Integer> generateList(){
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            list.add(random.nextInt(100));
        }
        return list;
    }
}
