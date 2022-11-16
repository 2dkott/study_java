import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ShopStorage {

    private List<Integer> availableRamValueList = new LinkedList<>(Arrays.asList(8, 16, 62));
    private List<String> availableOsNameList = new LinkedList<>(Arrays.asList("Linux", "Windows", "MacOS", "DOS"));
    private List<Integer> availableStorageValueList = new LinkedList<>(Arrays.asList(128, 256, 512));
    private List<String> availableColorNameList = new LinkedList<>(Arrays.asList("Black", "Gray", "Pink"));
    private List<String> availableProcessorNameList = new LinkedList<>(Arrays.asList("Intel i7", "M2", "Intel i5", "AMD Ryzen"));

    private List<NoteBook> noteBookList = new ArrayList<>();

    public ShopStorage(){

    }

    public void addNoteBook(NoteBook noteBook){
        noteBookList.add(noteBook);
    }

    public List<Integer> getAvailableRamValueList() {
        return availableRamValueList;
    }

    public List<String> getAvailableOsNameList() {
        return availableOsNameList;
    }

    public List<Integer> getAvailableStorageValueList() {
        return availableStorageValueList;
    }

    public List<String> getAvailableColorNameList() {
        return availableColorNameList;
    }

    public List<String> getAvailableProcessorNameList() {
        return availableProcessorNameList;
    }

    public List<NoteBook> getNoteBookList() {
        return noteBookList;
    }
}
