public class Lesson3 {

    public static void main(String[] args){
        CustomLinkedList<String> linkedList = new CustomLinkedList<>();
        linkedList.add("One");
        linkedList.add("Two");
        linkedList.add("Three");
        linkedList.add("Four");
        linkedList.add("Five");
        System.out.println(linkedList);

        for (String number: linkedList) {
            System.out.println(number);
        }
    }
}
