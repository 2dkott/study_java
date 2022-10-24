import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lesson3Task1 {

    public static void main(String[] args) {
        List<Integer> list = generateList();
        System.out.printf("Список до сортровки: %s \n", list);
        List<Integer> resultList = sortList(list);
        System.out.printf("Список после сортровки: %s \n", resultList);
        if(list.stream().sorted().toList().equals(resultList)){
            System.out.println("Проверка. Список отсортирован верно.");
        } else {
            System.out.println("Проверка. Список отсортирован неверно!");
        }
    }

    static List<Integer> generateList(){
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i< 50; i++){
            list.add(random.nextInt(100));
        }
        return list;
    }

    static List<Integer> sortList(List<Integer> list){
        if(list.size() > 1){
            int listASize = list.size() / 2;
            List<Integer> listA = list.subList(0, listASize);
            List<Integer> listB = list.subList(listASize, list.size());
            return joinAndSortLists(sortList(listA), sortList(listB));
        } else {
            return list;
        }
    }

    static List<Integer> joinAndSortLists(List<Integer> listA, List<Integer> listB){
        List<Integer> resultList = new ArrayList<>();
        int resultListIndex = 0;
        int listAIndex = 0;
        int listBIndex = 0;
        while(resultListIndex < listA.size() + listB.size()){
            if((listAIndex==listA.size()) || (listBIndex < listB.size() && listA.get(listAIndex) > listB.get(listBIndex))){
                resultList.add(listB.get(listBIndex));
                listBIndex++;
            }  else if(listAIndex < listA.size()){
                resultList.add(listA.get(listAIndex));
                listAIndex++;
            }
            resultListIndex++;
        }
        return resultList;
    }
}
