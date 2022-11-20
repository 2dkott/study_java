import java.util.*;

public class Lesson6Shop {

    static ShopStorage shopStorage = new ShopStorage();

    public static void main(String[] args) {
        shopStorage.addNoteBook(generateNoteBook());
        shopStorage.addNoteBook(generateNoteBook());
        shopStorage.addNoteBook(generateNoteBook());
        NoteBook minNoteBook = new NoteBook.NoteBookBuilder().setColor(NoteBookData.availableColorNameList.get(0))
                        .setOsName(NoteBookData.availableOsNameList.get(0))
                        .setRam(NoteBookData.availableRamValueList.get(0))
                        .setSsdStorage(NoteBookData.availableStorageValueList.get(0))
                        .setProcessor(NoteBookData.availableProcessorNameList.get(0))
                .build();
        shopStorage.addNoteBook(minNoteBook);

        System.out.println("Список хранимых ноутбуков: ");
        System.out.println(shopStorage.getNoteBookList());

        HashMap<FilterObjects, Object> minfilter = new HashMap<>();
        minfilter.put(FilterObjects.OS, NoteBookData.availableOsNameList.get(0));
        minfilter.put(FilterObjects.COLOR, NoteBookData.availableColorNameList.get(0));
        minfilter.put(FilterObjects.RAM, NoteBookData.availableRamValueList.get(0));
        minfilter.put(FilterObjects.PROC, NoteBookData.availableProcessorNameList.get(0));
        minfilter.put(FilterObjects.SSD, NoteBookData.availableStorageValueList.get(0));

        System.out.println("\nФильт поиска ноутбука по самым минимальным парамметрам: ");
        System.out.println(minfilter);

        List<NoteBook> searchResult = shopStorage.searchNoteBookByFilter(minfilter);

        System.out.println("\nРезультат поска: ");
        System.out.println(searchResult);
    }

    static NoteBook generateNoteBook() {
        Random random = new Random();
        return new NoteBook.NoteBookBuilder()
                .setColor(NoteBookData.availableColorNameList.get(random.nextInt(NoteBookData.availableColorNameList.size())))
                .setOsName(NoteBookData.availableOsNameList.get(random.nextInt(NoteBookData.availableOsNameList.size())))
                .setRam(NoteBookData.availableRamValueList.get(random.nextInt(NoteBookData.availableRamValueList.size())))
                .setProcessor(NoteBookData.availableProcessorNameList.get(random.nextInt(NoteBookData.availableProcessorNameList.size())))
                .setSsdStorage(NoteBookData.availableStorageValueList.get(random.nextInt(NoteBookData.availableStorageValueList.size())))
                .build();
    }
}


