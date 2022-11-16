import java.util.*;

public class Lesson6Shop {

    static ShopStorage shopStorage = new ShopStorage();

    public static void main(String[] args) {
        shopStorage.addNoteBook(generateNoteBook());
        System.out.println(shopStorage.getNoteBookList());
    }

    static NoteBook generateNoteBook() {
        Random random = new Random();
        return new NoteBook.NoteBookBuilder()
                .setColor(shopStorage.getAvailableColorNameList().get(random.nextInt(shopStorage.getAvailableColorNameList().size())))
                .setOsName(shopStorage.getAvailableOsNameList().get(random.nextInt(shopStorage.getAvailableOsNameList().size())))
                .setRam(shopStorage.getAvailableRamValueList().get(random.nextInt(shopStorage.getAvailableRamValueList().size())))
                .setProcessor(shopStorage.getAvailableProcessorNameList().get(random.nextInt(shopStorage.getAvailableProcessorNameList().size())))
                .setSsdStorage(shopStorage.getAvailableStorageValueList().get(random.nextInt(shopStorage.getAvailableStorageValueList().size())))
                .build();
    }
}


