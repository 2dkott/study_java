import java.util.*;

public class Lesson5Task1 {

    public static void main(String[] args) {
        PhoneDictionary phoneDictionary = new PhoneDictionary();
        phoneDictionary.addPhone("0000", "Anakin Skywalker");
        phoneDictionary.addPhone("1111", "Anakin Skywalker");
        phoneDictionary.addPhone("2222", "Darth Vaider");
        phoneDictionary.addPhone("3333", "Mandalorian");
        System.out.println(phoneDictionary);
        System.out.println("Get user by phone number: 3333");
        System.out.println(phoneDictionary.getUserByPhone("3333"));
        System.out.println("Get phone numbers by user: Anakin Skywalker");
        System.out.println(phoneDictionary.getUserPhonesNumbers("Anakin Skywalker"));
    }
}

class PhoneDictionary{

    private final HashMap<String, String> dictionary = new HashMap<>();

    public void addPhone(String phoneNumber, String user){
        dictionary.put(phoneNumber,user);
    }

    public List<String> getUserPhonesNumbers(String user){
        return dictionary.entrySet().stream()
                .filter(entry -> entry.getValue().equals(user))
                .map(Map.Entry::getKey).toList();
    }

    public String getUserByPhone(String phoneNumber){
        return dictionary.get(phoneNumber);
    }

}
