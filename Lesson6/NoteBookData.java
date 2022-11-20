import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class NoteBookData {
    public final static List<Integer> availableRamValueList = new LinkedList<>(Arrays.asList(8, 16, 62));
    public final static List<String> availableOsNameList = new LinkedList<>(Arrays.asList("DOS", "Windows", "MacOS", "Linux"));
    public final static List<Integer> availableStorageValueList = new LinkedList<>(Arrays.asList(128, 256, 512));
    public final static List<String> availableColorNameList = new LinkedList<>(Arrays.asList("Black", "Gray", "Pink"));
    public final static List<String> availableProcessorNameList = new LinkedList<>(Arrays.asList("Intel i3", "M2", "Intel i9", "AMD Ryzen"));
}
