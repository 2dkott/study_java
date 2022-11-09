import java.util.*;

public class Lesson4Task1 {

    public static void main(String[] args) {
        List<Integer> list = generateLinkedList();
        System.out.printf("Список до сортровки: %s \n", list);

        System.out.printf("Перевернутый список: %s \n", revertList(list));

    }

    static List<Integer> generateLinkedList(){
        List<Integer> list = new LinkedList<>();
        for(int i = 0; i<=20 ; i++){
            list.add(i);
        }
        return list;
    }

    static List<Integer> revertList(List<Integer> linkedList){
        Stack<Integer> stack = new Stack<>();
        linkedList.stream().forEach(stack::add);
        List<Integer> revertedList = new LinkedList<>();
        while(!stack.isEmpty()){
            revertedList.add(stack.peek());
            stack.pop();
        }
        return revertedList;
    }


}
