import java.util.*;

public class Lesson5Task2 {

    public static void main(String[] args) {
        UserList userList = new UserList("Иван Иванов,Светлана Петрова,Кристина Белова,Анна Мусина,Анна Крутова,Иван Юрин,Петр Лыков,Павел Чернов,Петр Чернышов,Мария Федорова,Марина Светлова,Мария Савина,Мария Рыкова,Марина Лугова,Анна Владимирова,Иван Мечников,Петр Петин\n" +
                "Иван Ежов");
        userList.printUserList();
        userList.printDuplicates();
    }
}

class UserList{

    private final List<UserName> userLIst;

    public UserList(String userList){
        this.userLIst =  Arrays.stream(userList.split(",")).map(UserName::new).toList();
    }

    public void printUserList(){
        System.out.println(userLIst);
    }

    public void printDuplicates(){
        HashMap<String, Integer> tempHashMap = new HashMap<>();
        userLIst.stream().forEach(userName -> {
            tempHashMap.put(userName.getName(), tempHashMap.getOrDefault(userName.getName(),0)+1);
        });
        System.out.println("\nСписок повторяющихся имен с количеством повторений:");
        tempHashMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(System.out::println);
    }

    public List<UserName> getUserLIst() {
        return userLIst;
    }
}

class UserName{

    private final String name;
    private final String surname;
    public UserName(String userName){
        name = userName.split(" ")[0];
        surname = userName.split(" ")[1];
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString(){
        return name + " " + surname;
    }
}
