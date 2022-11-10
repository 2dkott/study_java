import java.util.LinkedList;
import java.util.List;

public class Lesson4Task2 {

    public static void main(String[] args) {
        CustomQueue customQueue = new CustomQueue();

        System.out.printf("Проверка  enqueue: + %s \n", 1);
        customQueue.enqueue(1);
        System.out.printf("Список до сортровки: %s \n\n", customQueue.getList());

        System.out.printf("Проверка  enqueue: + %s \n", 2);
        customQueue.enqueue(2);
        System.out.printf("Список до сортровки: %s \n\n", customQueue.getList());

        System.out.printf("Проверка  enqueue: + %s \n", 3);
        customQueue.enqueue(3);
        System.out.printf("Список до сортровки: %s \n\n", customQueue.getList());

        System.out.printf("Проверка dequeue: %s, список: %s \n", customQueue.dequeue(), customQueue.getList());
        System.out.printf("Проверка first: %s, список: %s \n", customQueue.first(), customQueue.getList());

    }

}

class CustomQueue {

    private List<Integer> list = new LinkedList<>();

    public void enqueue(int number){
        if(list.isEmpty()){
            list.add(number);
        } else{
            int listLength = list.size()-1;
            list.add(list.get(listLength));
            while (listLength>0){
                list.set(listLength, list.get(listLength-1));
                listLength--;
            }
            list.set(0, number);
        }
    }

    public int dequeue(){
        int tempValue = list.get(0);
        int index = 0;
        while (index < list.size()-1){
            list.set(index, list.get(index+1));
            index++;
        }
        list.remove(index);
        return tempValue;
    }

    public int first(){
        return list.get(0);
    }

    public List<Integer> getList(){
        return list;
    };
}
